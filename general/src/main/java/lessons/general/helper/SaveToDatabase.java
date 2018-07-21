package lessons.general.helper;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.sql.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * @since 21.07.2018 (23:42)
 */
public class SaveToDatabase implements SaverProgress, DataConnectTo {
    private static final String SOURCE_CLASS = SaveToDatabase.class.getSimpleName();
    private static MessageToUser messageToUser = new MessageCons();
    Savepoint savepoint;
    private Connection c = getDefaultConnection();

    private static void createTable() {
        RegRuMysql regRuMysql = new RegRuMysql();
        MysqlDataSource u0466446_lessons = regRuMysql.getDataSourceSchema("u0466446_lessons");
        String sql = "CREATE TABLE IF NOT EXISTS general (\n" +
            "  `identry` int(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `idlesson` double NOT NULL,\n" +
            "  `lessonname` varchar(250) COLLATE utf8_unicode_ci NOT NULL,\n" +
            "  `links` text COLLATE utf8_unicode_ci,\n" +
            "  `timeset` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,\n" +
            "  PRIMARY KEY (`identry`),\n" +
            "  UNIQUE KEY `idlesson` (`idlesson`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;";
        try (Connection c = u0466446_lessons.getConnection();
             PreparedStatement p = c.prepareStatement(sql)) {
            p.executeUpdate();
        } catch (SQLException e) {
            messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
        }

    }

    @Override
    public boolean isSaved() {
        return false;
    }

    @Override
    public void saveMap(Map<?, ?> dataToSave, double idLesson) {
        String sql = "insert into u0466446_lessons.general (idlesson, lessonname, links) values (?,?,?)";
        Set<?> keySet = dataToSave.keySet();
        try (PreparedStatement p = c.prepareStatement(sql)) {
            for (Object key : keySet) {
                savepoint = c.setSavepoint(idLesson + " sPoint");
                p.setDouble(1, idLesson);
                p.setString(2, key.toString());
                p.setString(3, String.valueOf(dataToSave.get(key.toString())));
                p.executeUpdate();
            }
        } catch (SQLException e) {
            relSavepoint();
            messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));
        }
    }

    /**
     * @return {@link RegRuMysql#getDataSource()}
     */
    @Override
    public MysqlDataSource getDataSource() {
        return new RegRuMysql().getDataSource();
    }

    private void relSavepoint() {
        String savepointName = null;
        try {
            c.releaseSavepoint(savepoint);
            savepointName = savepoint.getSavepointName() + " released";
        } catch (SQLException e) {
            messageToUser.errorAlert(SOURCE_CLASS, e.getMessage() + "\n" + savepointName, Arrays.toString(e.getStackTrace()));
        }
    }


}

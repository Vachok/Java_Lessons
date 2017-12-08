import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main( String[] args ) throws Exception {
        UserChild user = new UserChild();
        user.lifeLevel = 55;
        User.staticField = 45;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;
        user.childLevel = 65;

        FileOutputStream fileOutputStream = new FileOutputStream("tempfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        User.staticField = 35;

        FileInputStream fileInputStream = new FileInputStream("tempfile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(User.staticField);
        System.out.println(newUser.sword);
        System.out.println(newUser.childLevel);
    }
}
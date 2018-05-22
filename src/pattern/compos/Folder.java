package pattern.compos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Пример объекта <b>Folder.</b>
 * <p>
 * Тип - "папка". Содержит сама себя {@link #folderList} + "листики" {@link #files}
 * По-сути, как папки на ПК.
 *
 * @author 14350
 * @see FileClass
 * @since 01.05.2018
 */
class Folder {
    /**
     * Имя папки.
     */
    String name;
    /**
     * Дата создания.
     */
    Date creationDate;
    /**
     * {@link List}, который будет содержать дерево.
     */
    List<Folder> folderList = new ArrayList<>();
    /**
     * @see FileClass
     */
    List<FileClass> files = new ArrayList<>();

    /**
     * @param name {@link #name}
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * Добавить папку.
     *
     * @param folder папка
     */
    void addFolder(Folder folder) {
        folderList.add(folder);
    }

    /**
     * Удалить папку
     *
     * @param folder папка
     */
    void removeFolder(Folder folder) {
        folderList.remove(folder);
    }

    /**
     * Показать лист папок.
     *
     * @return {@link #folderList}
     */
    List<Folder> getFolderList() {
        return folderList;
    }

    /**
     * Добавить файл.
     *
     * @param fileClass файл
     */
    void addFileClass(FileClass fileClass) {

    }

    /**
     * Удалить файл.
     *
     * @param fileClass файл
     */
    void removeFileClass(FileClass fileClass) {
        files.remove(fileClass);
    }

    /**
     * Показать лист файлов.
     *
     * @return {@link #files}
     */
    List<FileClass> getFileClassList() {
        return files;
    }
}

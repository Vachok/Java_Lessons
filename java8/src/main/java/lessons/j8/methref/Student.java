package lessons.j8.methref;

/**
 * <h1>Объяснение ссылки на метод</h1>
 * Есть класс Студент. У него есть имя, конструктор, геттер и сеттер.
 * @since 07.08.2018 (10:22)
 */
class Student{
    /**
     * <h2>Имя</h2>
     */
    String name;

    /**<h2>DEF конструктор</h2>
     * @param name имя
     */
    public Student(String name) {
        this.name = name;
    }

    /**<h2>Getter</h2>
     * @return {@link #name}
     */
    public String getName() {
        return name;
    }

    /**<h2>Setter</h2>
     * @param name {@link #name}
     */
    public void setName(String name) {
        this.name = name;
    }
}

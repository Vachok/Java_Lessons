package pattern.transobj;

/**
 * Объект для трансфера.
 * <p>
 *
 * @author IKudryashov
 * @since 30.05.2018 (13:28)
 */
class User {
    String uName;
    int age;

    public String getuName() {
        return uName;
    }

    public User setuName(String uName) {
        this.uName = uName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }
}

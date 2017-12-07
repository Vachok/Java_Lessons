import java.io.Serializable;

public class User implements Serializable {
    int lifeLevel;
    static int staticField;
    transient Sword sword;

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (lifeLevel != user.lifeLevel) return false;
        return sword.equals(user.sword);
    }

    @Override
    public int hashCode() {
        int result = lifeLevel;
        result = 31 * result + sword.hashCode();
        return result;
    }
}

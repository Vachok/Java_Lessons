import java.io.Serializable;

public class User implements Serializable {
    transient int lifeLevel;
    static int staticField;
    transient Sword sword;
}

import java.io.Serializable;

public class User implements Serializable {
    static int staticField;
    int lifeLevel;
    transient Sword sword;
}

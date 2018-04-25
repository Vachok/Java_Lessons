import java.io.Serializable;

public class User { //transient
    static int staticField;
    int lifeLevel;
    transient Sword sword;
}
/*
public class User implements Serializable {
    int lifeLevel;
    static int staticField;
    transient Sword sword; //transient не должен учавствовать в хеш
}
*/

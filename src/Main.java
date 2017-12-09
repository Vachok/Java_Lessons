import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main( String[] args ) {
        Map map = new HashMap(); // тут если _**не**_ String - нужно было бы переопределить equals и hashCode
        map.put("1" , "one");
        map.put("3" , "three");
        map.put("2" , "two");
        System.out.print(map.get("3"));
    }
}
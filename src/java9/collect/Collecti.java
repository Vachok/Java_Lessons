package java9.collect;



import java.util.List;
import java.util.Map;
import java.util.Set;



public class Collecti {
   
   public static void main(String[] args) {
      
      List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
      System.out.println(list);
      
      Set<Integer> set = Set.of(1, 2, 3, 4);
      System.out.println(set);
      
      Map<String,String> map = Map.of("k1", "v1", "k2", "va2");
      
      System.out.println(map.get("k2"));
      
      Map<String,String> map2 = Map.ofEntries(Map.entry("k1", "v1"), Map.entry("k2", "v2"));
      System.out.println(map2);
   }
}

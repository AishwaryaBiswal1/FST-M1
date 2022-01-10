package Activities;
import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Violet");
        hash_map.put(2, "Indigo");
        hash_map.put(3, "Blue");
        hash_map.put(4, "Yellow");
        hash_map.put(5, "Black");
        System.out.println("The Original map: " + hash_map);
        hash_map.remove(4);
        System.out.println("After removing White: " + hash_map);
        if(hash_map.containsValue("Indigo")) {
            System.out.println("Indigo exists in the Map");
        } else {
            System.out.println("Indigo does not exist in the Map");
        }
        System.out.println("Number of pairs in the Map is: " + hash_map.size());
    }
}

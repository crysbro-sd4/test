import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> testHashMap = new HashMap<>();
//        var testHashMap = new HashMap<String, Integer>();

        testHashMap.put("a", 3);
        testHashMap.put("a", 8);
        testHashMap.put("b", 6);
        testHashMap.put("c",8);
        testHashMap.put("c",5);
        testHashMap.put("c", 2);

//        testHashMap.remove("c");
        for (String i : testHashMap.keySet()) {
            System.out.println(i + " " + testHashMap.get(i));
        }
//        System.out.println(testHashMap.containsValue("USA-2"));
    }
}

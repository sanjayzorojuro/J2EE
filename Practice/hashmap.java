import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap (Key: Integer, Value: String)
        HashMap<Integer, String> map = new HashMap<>();

        // 🔹 Putting data (adding key-value pairs)
        map.put(1, "Rahul");
        map.put(2, "Anita");
        map.put(3, "Kiran");

        // 🔹 Retrieving data using key
        System.out.println(map.get(1)); // Output: Rahul
        System.out.println(map.get(2)); // Output: Anita

        // 🔹 Checking if key exists
        if (map.containsKey(3)) {
            System.out.println("Key 3 exists with value: " + map.get(3));
        }

        // 🔹 Iterating through HashMap
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
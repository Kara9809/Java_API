import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        Key Value

        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("052-521-2575", "Shaked");
        phoneBook.put("053-399-3903", "Karina");
        phoneBook.put("053-399-3903", "Carina");
        System.out.println(phoneBook);

        String magicWord = "Abra Cadabra";
        Map<Character,Integer> magicCounter = new TreeMap<>();
        for (int i = 0; i < magicWord.length(); i++) {
            Character currentChar = magicWord.toLowerCase().charAt(i);
            if (currentChar != ' ') {
                if (magicCounter.containsKey(currentChar)){
                    magicCounter.put(currentChar, magicCounter.get(currentChar)+1);
                } else {
                    magicCounter.put(currentChar, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : magicCounter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }





    }
}
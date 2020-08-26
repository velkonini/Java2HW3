import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] teams = {"Lakers", "Clippers", "Warriors", "Jazz", "Lakers", "Cavaliers", "Heat",
                "Blazzers", "Heat", "Rockets", "Blazers", "Jazz"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: teams) {
            Integer value = map.getOrDefault(s, 0);
            map.put(s, value + 1);
        }
        System.out.println(map);

        PhoneBook book = new PhoneBook();
        book.addContact("James", "1233344");
        book.addContact("Curry", "5555555");
        book.addContact("Lillard","8888888");
        book.addContact("Ronaldo", "1111111");
        book.addContact("Messi","22222222");


        book.getContactAndPrint("Ronaldo");

    }
}






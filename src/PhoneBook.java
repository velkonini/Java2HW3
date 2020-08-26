import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> pb;

    public PhoneBook(){
        this.pb = new HashMap<>();
    }

    public void addContact(String Surname, String number){
        HashSet<String>  book = pb.getOrDefault(Surname, new HashSet<>());
        book.add(number);
        pb.put(Surname, book);
    }
    public void getContactAndPrint(String name){

        System.out.println("Surname " + name + " Number " + pb.getOrDefault(name, new HashSet<>()));
    }


}
import java.util.HashMap;
import java.util.Map;

public class HashMapLibrary extends Book{
    private static Map<String,Book> hsmap = new HashMap<>();
    private HashMapLibrary(String id, String title, String author, int year) {
        super(id, title, author, year);
    }
    public static void addBook(String id, String title, String author, int year) {
        hsmap.put(id, new HashMapLibrary(id, title, author, year));
    }
    public static void findBookbyID(String id) {
        Book i = hsmap.get(id);
        if (i != null) {
            System.out.println("Tim thay sach co " +i.toString());
        }
        else System.out.println("Khong tim thay sach co id " + id);
    }
    public static void eraseBookbyID(String id) {
        Book i = hsmap.get(id);
        if (i != null) {
            System.out.println("Da xoa sach co " +i.toString());
            hsmap.remove(id);
        }
        else System.out.println("Khong tim thay sach co id " + id);
    }
    public static void print(){
        int stt = 1;
        System.out.println("Thu vien xay dung bang HashMap");
        for (Map.Entry<String, Book> i : hsmap.entrySet()) {
            System.out.println(stt +"| "+i.getValue().toString());
            stt+=1;
        }
    }
}

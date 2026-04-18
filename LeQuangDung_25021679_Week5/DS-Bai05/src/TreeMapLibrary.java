import java.util.Map;
import java.util.TreeMap;

public class TreeMapLibrary extends Book{
    private static Map<String, Book> treemap = new TreeMap<>();
    private TreeMapLibrary(String id, String title, String author, int year) {
        super(id, title, author, year);
    }
    public static void addBook(String id, String title, String author, int year) {
        treemap.put(id, new TreeMapLibrary(id, title, author, year));
    }
    public static void findBookbyID(String id) {
        Book i = treemap.get(id);
        if (i != null) {
            System.out.println("Tim thay sach co " + i.toString());
        }
        else System.out.println("Khong tim thay sach co id " + id);
    }
    public static void eraseBookbyID(String id) {
        Book i = treemap.get(id);
        if (i != null) {
            System.out.println("Da xoa sach co " + i.toString());
            treemap.remove(id);
        }
        else System.out.println("Khong tim thay sach co id " + id);
    }
    public static void print(){
        int stt = 1;
        System.out.println("Thu vien xay dung bang TreeMap");
        for (Map.Entry<String, Book> i : treemap.entrySet()) {
            System.out.println(stt +"| "+i.getValue().toString());
            stt+=1;
        }
    }
}

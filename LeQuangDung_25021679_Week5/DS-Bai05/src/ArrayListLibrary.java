import java.util.ArrayList;
import java.util.List;

public class ArrayListLibrary extends Book{
    private static List<Book> BookArrayListList = new ArrayList<>();
    private ArrayListLibrary(String id, String title, String author, int year) {
        super(id, title, author, year);
    }
    public static void addBook(String id, String title, String author,int year) {
        BookArrayListList.add(new ArrayListLibrary(id, title, author, year));
    }
    public static void findBookbyID(String id) {
        boolean kt = false;
        for (Book i : BookArrayListList){
            if (i.getId().equals(id)) {
                kt = true;
                System.out.println("Tim thay sach co " + i.toString());
            }
        }
        if (kt == false) {
            System.out.println("Khong tim thay sach co id " + id);
        }
    }
    public static void eraseBookbyID(String id) {
        boolean kt = false;
        int count = 0;
        for (int i = BookArrayListList.size() - 1; i >= 0; i--) {
            if (BookArrayListList.get(i).getId().equals(id)) {
                System.out.println("Da xoa sach co " + BookArrayListList.get(i).toString());
                BookArrayListList.remove(i);
                kt = true;
            }
        }
        if (kt == false) {
            System.out.println("Khong tim thay sach co id " + id);
        }
    }
    public static void print(){
        int stt = 1;
        System.out.println("Thu vien xay dung bang ArrayList");
        for (Book i : BookArrayListList) {
            System.out.println(stt +"| "+i.toString());
            stt+=1;
        }
    }
}

import java.io.*;

public class Doc {
    static void main() {
        System.out.println("dang doc tep");
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src\\numbers.dat"))) {
            while (true) {
                try {
                    int number = dis.readInt();
                    System.out.print(number + " ");
                } catch (EOFException e) {
                    System.out.println("\nDa doc het du lieu");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Lỗi: Không tìm thấy tệp ");
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }
}
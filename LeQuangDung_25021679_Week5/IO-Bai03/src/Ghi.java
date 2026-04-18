import java.io.*;
import java.util.Scanner;
public class Ghi {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        try {
            DataOutputStream data = new DataOutputStream(new FileOutputStream("src\\numbers.dat"));
            for (int i = 0; i < n; i++) {
                int k = scan.nextInt();
                data.writeInt(k);
            }
            data.close();
            System.out.println("ghi thanh cong, hay kiem tra tep moi");
            //data.flush();
        } catch (FileNotFoundException e) {
            System.err.println("Loi khong tim thay file");
        } catch (IOException e) {
            System.err.println("Loi nhap vao");
        }
    }
}


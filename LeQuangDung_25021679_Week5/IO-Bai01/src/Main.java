import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static void main(){
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            float res = a / b;
            System.out.println(res);
        } catch (InputMismatchException ex) {
            System.err.println("Loi so nhap vao phai la so nguyen");
        } catch (ArithmeticException ex) {
            System.err.println("Khong the chia cho khong");
        } catch (Exception ex) {
            System.err.println("loi he thong : "+ex.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}


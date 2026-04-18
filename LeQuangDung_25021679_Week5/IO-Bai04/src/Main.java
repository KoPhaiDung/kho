import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);
        try (ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("src\\data.dat"))) {
            while (true) {
                String input = scan.nextLine();
                if (input.equals("END")) {
                    break;
                }
                String[] ip = input.split(" ");
                op.writeObject(new Students(ip[0],ip[1],Double.parseDouble(ip[2])));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi ko tim thay file");
        } catch (IOException e) {
            System.err.println("Loi doc file");
            e.printStackTrace();
        }
        ArrayList<Students> list = new ArrayList<>();
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("src\\data.dat"))){
            while (true) {
                try {
                    list.add((Students) is.readObject());
                } catch (EOFException e){
                    System.out.println("Da doc het file");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi ko tim thay file");
        } catch (IOException e) {
            System.err.println("Loi doc file");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("Loi khong tim thay class tuong ung");
        }
        for (Students i : list){
            System.out.print(i+"\n");
        }
    }
}
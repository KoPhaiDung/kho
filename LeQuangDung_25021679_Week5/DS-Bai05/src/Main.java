import java.util.*;

public class Main {
    static void main() {
        String[] test1, test2, test3;
        test1 = "100 NhungNgayNoiGio NguyenVanDung 1907".split(" ");
        test2 = "101 DemTrang LeVietCong 1921".split(" ");
        test3 = "99 NhungDemMua TranThanhHai 1024".split(" ");
        ArrayListLibrary.addBook(test1[0],test1[1],test1[2],Integer.parseInt(test1[3]));
        ArrayListLibrary.addBook(test2[0],test2[1],test2[2],Integer.parseInt(test2[3]));
        ArrayListLibrary.addBook(test3[0],test3[1],test3[2],Integer.parseInt(test3[3]));
        ArrayListLibrary.eraseBookbyID("100");
        ArrayListLibrary.findBookbyID("99");
        ArrayListLibrary.print();
        System.out.println("\n \n");
        HashMapLibrary.addBook(test1[0],test1[1],test1[2],Integer.parseInt(test1[3]));
        HashMapLibrary.addBook(test2[0],test2[1],test2[2],Integer.parseInt(test2[3]));
        HashMapLibrary.addBook(test3[0],test3[1],test3[2],Integer.parseInt(test3[3]));
        HashMapLibrary.eraseBookbyID("100");
        HashMapLibrary.findBookbyID("99");
        HashMapLibrary.print();
        System.out.println("\n \n");
        TreeMapLibrary.addBook(test1[0],test1[1],test1[2],Integer.parseInt(test1[3]));
        TreeMapLibrary.addBook(test2[0],test2[1],test2[2],Integer.parseInt(test2[3]));
        TreeMapLibrary.addBook(test3[0],test3[1],test3[2],Integer.parseInt(test3[3]));
        TreeMapLibrary.eraseBookbyID("100");
        TreeMapLibrary.findBookbyID("99");
        TreeMapLibrary.print();


    }
}
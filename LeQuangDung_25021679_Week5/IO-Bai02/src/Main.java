import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<String> Read(File s) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(s));
        ArrayList<String> data = new ArrayList<>();
        String readline;
        while ((readline = br.readLine()) != null){
            data.add(readline);
        }
        return data;
    }
    static void Write(String s,ArrayList<String> arr) throws FileNotFoundException,IOException {
        FileWriter fw = null;
        PrintWriter pr = null;
        try {
            fw = new FileWriter(new File(s));
            pr = new PrintWriter(fw);
            for(int i = 0; i < arr.size(); i++){
                pr.println(arr.get(i));

            }
        } finally {
            if (pr != null) pr.close();
            if (fw != null) fw.close();
            System.out.println("Sao chep thanh cong\nSo dong da sao chep la : " + arr.size());
        }

    }
    static void main(){
        File readdata = new File("src\\Math.txt");
        try {
            ArrayList<String> data = Read(readdata);
            Write("src\\CopyMath.txt",data);
        } catch (FileNotFoundException exp) {
            System.err.println("Source file not found");
        } catch (IOException exp) {
            System.err.println("I/O error");
            exp.printStackTrace();
        }
    }
}


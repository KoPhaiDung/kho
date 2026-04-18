import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Main {
    static void main() {
        Map<String,String> lst = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String filename = scan.next();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            while (true) {
                try {
                    String in = reader.readLine();
                    if (in == null){
                        throw new EOFException();
                    }
                    String[] input = in.split(" = ");
                    if (input.length < 2) {
                        throw new Loinhapvao();
                    } else if (Integer.parseInt(input[1]) < 0 && input[0].equals("maxConnections") != true) {
                        throw new Loitimeout();
                    } else if (input[0].equals("maxConnections")) {
                        if (Integer.parseInt(input[1]) < 1 || String.valueOf(Integer.parseInt(input[1])).equals(input[1]) != true)
                        throw new maxconectionexp();
                    }
                    lst.put(input[0],input[1]);
                } catch (EOFException e) {
                    System.out.println("Da doc xong du lieu");
                    break;
                } catch (Loitimeout e) {
                    throw new InvalidConfigException(e.getMessage());
                } catch (Loinhapvao e) {
                    throw new InvalidConfigException(e.getMessage());
                } catch (maxconectionexp e) {
                    throw new InvalidConfigException(e.getMessage());
                }
            }
            System.out.println("Config loaded successfully.\n");
        } catch (FileNotFoundException e) {
            System.err.println("Config file not found");
        } catch (IOException e) {
            System.err.println("I/O error");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format");
        } catch (InvalidConfigException e) {
            System.err.println(e.getMessage());
            int sohangloi = lst.size()+1;
            System.out.println("loi o hang so "+sohangloi);
        } finally {
            System.out.println("Programed finished");
        }
    }
}
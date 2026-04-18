import java.util.Scanner;

public class Main {
    static void useString(){
        // chay bang vong lap +=
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s+="Hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("run's time with += operator : " + (end - start));
    }
    static void useStringBuffer(){
        // chay bang vong lap stringbuffer
        long start = System.currentTimeMillis();
        StringBuffer s1 = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {
            s1.append("Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("run's time with StringBuffer : " + (end - start));
    }
    static void contentAnalysis(StringBuffer a){
        int count = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == '.' || a.charAt(i) == '!' || a.charAt(i) == '?') {
                count++;
            }
            if (a.charAt(i) == 'j'){
                if (a.charAt(i+1) == 'a'){
                    if (a.charAt(i+2) == 'v'){
                        if (a.charAt(i+3) == 'a'){
                            a.replace(i,i+4,"Python");
                        } else i++;
                    }
                }
            }
        }
        System.out.println("The number of sentences is " + count);
        System.out.println(a.toString());
    }
    static void main() {
        useString();
        useStringBuffer();
        StringBuffer a = new StringBuffer("\"This is a java test.This is a java test?This is a java test!\"");
        contentAnalysis(a);
    }
}
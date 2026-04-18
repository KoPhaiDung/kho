import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {
    public static String most;
    public static Map<String,Integer> map = new HashMap<>();
    public static void analize(String text) {
        StringBuffer a = new StringBuffer(text);
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i)) == true) {
                a.replace(i,i+1, String.valueOf(Character.toLowerCase(a.charAt(i))));
            }
            if (a.charAt(i) == ',' || a.charAt(i) == '.' || a.charAt(i) =='"' || a.charAt(i) == '?' || a.charAt(i) == '!') {
                a.replace(i, i+1, " ");
            }
        }
        text = a.toString();
        System.out.println(text);
        String[] arr = text.split(" ");
        for (String i : arr) {
            if (i.isEmpty()) {
                continue;
            } else if (map.containsKey(i) != true) {
                map.put(i,1);
            } else {
                int current = map.get(i);
                map.put(i,current + 1);
            }
        }
        List<String> only = new ArrayList<>();
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > max) {
                max = count;
                most = word;
            }
            if (count == 1) {
                only.add(word);
            }
        }
    }
    public static void displayResult() {
        System.out.println("Tu xuat hien nhieu nhat : " + most + " , so lan xuat hien : " + map.get(most));
        System.out.println("Danh sach cac tu : \n" + map);
    }
}

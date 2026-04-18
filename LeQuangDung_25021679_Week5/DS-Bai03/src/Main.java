import java.util.*;

public class Main {
    static char lower(char k) {
        return Character.toLowerCase(k);
    }
    static void main() {
        Map<String,Integer> map = new HashMap<>();
        StringBuffer a = new StringBuffer("This is A teSt parAgrAph, ThIs test iS mEaningFul!");
        for (int i = 0; i < a.length(); i++) {
            if (Character.isUpperCase(a.charAt(i)) == true) {
                a.replace(i,i+1, String.valueOf(lower(a.charAt(i))));
            }
            if (a.charAt(i) == ',' || a.charAt(i) == '.' || a.charAt(i) =='"' || a.charAt(i) == '?' || a.charAt(i) == '!') {
                a.replace(i, i+1, "");
            }
        }
       String[] arr = (a.toString()).split(" ");
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
        String most;
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
        System.out.println(max + "   " + only);
    }
}
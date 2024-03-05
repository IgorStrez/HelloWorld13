package hausaufgaben.l36.l361;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        String data = "fsdfsd23234xvv";
        System.out.println("Изначально: " + data);
        clear(data);

    }

    public static void clear(String data) {
        Set<Character> chars = new HashSet<>();
        for (char c : data.toCharArray()) {
            chars.add(c);
        }
        System.out.println(chars);
    }
}

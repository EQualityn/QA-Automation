package lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class DuplicateChars {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String text =
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting," +
                " remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset" +
                " sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like" +
                "Aldus PageMaker including versions of Lorem Ipsum.";

        char[] textChars = text.toCharArray();
        for (int i = 0; i < textChars.length; i++) {
            map.put(textChars[i],0);
        }
        map.forEach((c,i) -> {
            Long b = text.chars().filter(ch -> ch == c).count();
            System.out.println("b = " + b);
            map.put(c,Integer.valueOf(b.intValue()));
        });
        /*
        for (char letter : textChars) {

            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            }
            else {
                map.put(letter, 1);
            }
        }
        */


        // map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
        System.out.println(map);
    }
}

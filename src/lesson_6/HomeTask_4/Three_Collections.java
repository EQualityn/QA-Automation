package lesson_6.HomeTask_4;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Three_Collections {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            arrayList1.add(random.nextInt(100));
            arrayList2.add(Character.toString((char)random.nextInt(26) + 'a'));
            map.put(arrayList1.get(i)," - " + arrayList2.get(i));
        }
        map.forEach((num, str) -> System.out.println(num + str));
    }
}

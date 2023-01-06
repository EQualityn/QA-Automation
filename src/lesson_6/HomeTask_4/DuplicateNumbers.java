package lesson_6.HomeTask_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DuplicateNumbers {
    static Random random = new Random();
    public static void main(String[] args) {
        int arrSize = 100;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Map<Integer,Integer> map  = new HashMap<>();
        int number;
        for (int i = 0; i < arrSize; i++) {
            number = random.nextInt(50);
            arrayList.add(number);
            map.put(number,0);
        }
        for (Integer num : arrayList) {
            if (map.containsKey(num))
                map.put(num, map.get(num)+1);
            else map.put(num,1);
        }
        System.out.println("Map:\nNumber\tAmount of numbers");
        map.forEach((n,a) -> System.out.println(n + "\t\t\t\t" + a));
    }
}

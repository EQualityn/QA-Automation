package lesson_5.HomeTask_4;

public class Interval {
    public static int findInterval(int number){
        if (number < 15)
            return 1;
        if (number < 36)
            return 2;
        if (number < 51)
            return 3;
        // default number in [51:100]
            return 4;
        }

}

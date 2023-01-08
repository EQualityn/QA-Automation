package lesson_5.HomeTask_4;

public class CountAverage {
    public static void main(String[] args) {

        System.out.println("Average value of array is " + countAvg(100));
    }
    public static double countAvg (int size){
        double sum = 0;
        for (int i = 0; i <= size; i++) {
            sum += i;
        }
        return sum/size;
    }
}

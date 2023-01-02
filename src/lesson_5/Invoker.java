package lesson_5;

public class Invoker {
    public static void main(String[] args) {
        PhoneBill bill1 = new PhoneBill(2,4,5,7);
        bill1.PrintBill();
        PhoneBill bill2 = new PhoneBill();
        bill2.PrintBill();
        PhoneBill bill3 = new PhoneBill(4);
        bill3.PrintBill();
    }
}

package lesson_5;

public class PhoneBill {
    int id = 0;

    int baseCost = 0;
    int numMinutes = 0;
    int minUsed = 300;
    public PhoneBill(){}
    public PhoneBill (int id){
        this.id = id;
    }
    public PhoneBill (int id, int baseCost){
        this.id = id;
        this.baseCost = baseCost;
    }
    public PhoneBill (int id, int baseCost, int numMinutes, int minUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.numMinutes = numMinutes;
        this.minUsed = minUsed;
    }
    public void PrintBill() {
        System.out.println("Bill  with id: " + this.id +
                "\nwith base cost " +this.baseCost +
                "\nwith minutes allotted " + numMinutes  + "\nwith minutes used " +minUsed);

    }

}

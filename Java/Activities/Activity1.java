package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car C1= new Car();
        C1.make= 2014;
        C1.color = "Black";
        C1.transmission= "Manual";
        C1.displayCharacteristics();
        C1.accelerate();
        C1.brake();

    }
}

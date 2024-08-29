package JAVA;

public class example2 {

    public static double inch_to_cm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        double inchAmount = 10;
        double cmAmount = inch_to_cm(inchAmount);
        System.out.println(inchAmount + " inches is equivalent to " + cmAmount + " centimeters");
    }

}

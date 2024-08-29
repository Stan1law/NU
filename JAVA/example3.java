package JAVA;

public class example3 {

    public static int Fahren_to_Cel(int Fahrenheit) {
        return (int) ((Fahrenheit - 32) * 5 / 9);
    }

    public static void main(String[] args) {
        int Celsius = 50;
        int Fahrenheit = Fahren_to_Cel(Celsius);
        System.out.println(Fahrenheit);
    }

}

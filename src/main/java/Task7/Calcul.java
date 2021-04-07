package Task7;



public class Calcul {


    public static void Plus(double a, double b) {
        System.out.println("Полученный результат: " + (a + b));
    }

    public static void Minus(double a, double b) {
        System.out.println("Полученный результат: " + (a - b));
    }


    public static void Divide(double a, double b) {
        System.out.println("Полученный результат: " + (a * b));
    }

    public static void Multiply(double a, double b) {
        try {
            System.out.println("Полученный результат: " + (a / b));
        }
        catch (Exception ex)
        {
            System.out.println("На ноль делить нельзя!" + ex.getMessage());
        }
    }
}

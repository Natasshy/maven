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
            if (Double.isInfinite(a / b)) {
                throw (new Exception());
            }
            System.out.println("Полученный результат: " + (a / b));
        } catch (Exception e) {
            System.out.println("Ошибка - На ноль делить нельзя!");
        }

    }
}

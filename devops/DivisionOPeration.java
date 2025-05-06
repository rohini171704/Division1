public class DivisionOPeration {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        try {
            int div = a / b;
            System.out.println("division: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero not possible");
        }
    }
}

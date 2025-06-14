public class Fibonacci {
    public static void main(String[] args) {
        int count = 10;
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + count + " terms:");

        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

import java.util.Scanner;

public class FindFibonacci {
    static int fibonacci(int n)
    {
        if (n == 0 || n==1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(fibonacci(a));
    }
}

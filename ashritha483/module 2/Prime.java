import java.util.Scanner;
public class Prime {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        int count = 0;
        while (count < 5) {
            if (isPrime(start)) {
                System.out.println(start);
                count++;
            }
            start++;
        }
        sc.close();
    }
}
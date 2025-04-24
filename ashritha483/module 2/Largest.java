import java.util.Arrays;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 5, 30, 25};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int number = sc.nextInt();
        Arrays.sort(arr);
        int length = arr.length;
        if (number <= length)
            System.out.println(number + "nth largest: " + arr[length - number]);
        else
            System.out.println("Invalid");
    }
}

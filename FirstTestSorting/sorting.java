package FirstTest;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        
        double[] numbers = new double[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        
        // Sorting
        Arrays.sort(numbers);
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        double average = sum / n;
     
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average " + average);
        scanner.close();
    }
}

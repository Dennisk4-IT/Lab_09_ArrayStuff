import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Here goes Task 1:
        int[] dataPoints = new int[100];

        // Here goes Task 2:
        Random randomGen = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = randomGen.nextInt(100) + 1;
        }

        // Here goes Task 3:
        System.out.println("Data Points:");
        for (int dataPoint : dataPoints) {
            System.out.print(dataPoint + " | ");
        }
        System.out.println();

        // Here goes Task 4:
        int totalSum = 0;
        for (int val : dataPoints) {
            totalSum += val;
        }
        double totalAverage = (double) totalSum / dataPoints.length;
        System.out.println("The sum of the dataPoints array is: " + totalSum);
        System.out.printf("The average of the dataPoints array is: %.2f\n", totalAverage);

        // Here goes Task 5:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numeric value between 1 and 100: ");
        int userValue = scanner.nextInt();

        // Here goes Task 6:
        int count = 0;
        for (int val : dataPoints) {
            if (val == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times in the array.");

        // Here goes Task 7:
        System.out.print("Enter a value between 1 and 100: ");
        int searchTotal = scanner.nextInt();
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchTotal) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + searchTotal + " was found at index " + position);
        } else {
            System.out.println("The value " + searchTotal + " was not found in the array.");
        }

        // Here goes Task 8:
        int totalMin = dataPoints[0];
        int totalMax = dataPoints[0];
        for (int val : dataPoints) {
            if (val < totalMin) {
                totalMin = val;
            }
            if (val > totalMax) {
                totalMax = val;
            }
        }
        System.out.println("The minimum value in the array is: " + totalMin);
        System.out.println("The maximum value in the array is: " + totalMax);

        // Here goes Task 9:
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values) {
        int totalSum = 0;
        for (int val : values) {
            totalSum += val;
        }
        return (double) totalSum / values.length;
    }
}




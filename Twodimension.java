import java.util.Scanner;

public class Twodimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arrsum = new int[3][3];
        int[][] arrsub = new int[3][3];

        System.out.println("Enter elements of array1: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of array2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arrsum[i][j] = arr1[i][j] + arr2[i][j];
                arrsub[i][j] = arr1[i][j] - arr2[i][j];
            }
        }

        System.out.println("Matrix Addition:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            if (i == arr1.length / 2) {
                System.out.print(" +\t");
            } else {
                System.out.print("\t");
            }

            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            if (i == arr2.length / 2) {
                System.out.print(" =\t");
            } else {
                System.out.print("\t");
            }

            for (int j = 0; j < arrsum[i].length; j++) {
                System.out.print(arrsum[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            if (i == arr1.length / 2) {
                System.out.print(" -\t");
            } else {
                System.out.print("\t");
            }

            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            if (i == arr2.length / 2) {
                System.out.print(" =\t");
            } else {
                System.out.print("\t");
            }

            for (int j = 0; j < arrsub[i].length; j++) {
                System.out.print(arrsub[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}





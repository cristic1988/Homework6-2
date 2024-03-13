import java.util.Random;
import java.util.Scanner;

public class MatrixProgram {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value M");
        int m = scanner.nextInt();
        System.out.println(m);



        System.out.println("Enter value N");
        int n = scanner.nextInt();
        System.out.println(n);



        int[][] array2DOriginal = new int[m][n];
        int[][] array2DTransported = new int[n][m];
        for (int i = 0; i < array2DOriginal.length; i++) {
            for (int j = 0; j < array2DOriginal[i].length; j++) {
                array2DOriginal[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < array2DOriginal.length; i++) {
            for (int j = 0; j < array2DOriginal[i].length; j++) {
                System.out.print(array2DOriginal[i][j] + " ");
            }
            System.out.println();
            }
        System.out.println();



        for (int i = 0; i < array2DOriginal.length; i++) {
            for (int j = 0; j < array2DOriginal[i].length; j++) {
                int temp = array2DOriginal[i][j];
                array2DOriginal[i][j] = array2DTransported[j][i];
                array2DTransported[j][i] = temp;
            }
            }
        for (int i = 0; i < array2DOriginal.length; i++) {
            for (int j = 0; j < array2DOriginal[i].length; j++) {
                System.out.print(array2DTransported[j][i] + " ");
            }
            System.out.println();
            }

      //  int temp = array2DOriginal[i][j];
     //   array2DOriginal[i][j] = array2DTransported[j][i];
     //   array2DTransported[j][i] = temp;












    }

}

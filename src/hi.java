import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input23.txt");
        Scanner readFile = new Scanner(file);
        int m = readFile.nextInt();
        int n = readFile.nextInt();
        int[][] matrix = new int[m][n];
        while (readFile.hasNextInt()) {
            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = readFile.nextInt();
                }
            }
        }
        readFile.close();
        sort(matrix);
        for(int i =0 ; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }


//


    }
    public static void sort(int[][] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                for(int k = j + 1; k < a[i].length; k++) {
                    if(a[i][j] > a[i][k] ) {
                        int temp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = temp;
                    }
                }
            }
        }

    }
}

import java.util.Arrays;
public class Arr2DMisc {
    public static int[][] inner(int[][]arr){
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] result = new int[rows - 2][cols - 2];

        for (int i = 1; i < rows - 1; i++){
            for (int j = 1; j < cols - 1; j++){
                result[i - 1][j - 1] = arr[i][j];
            }
        }
        return result;
    }
public static int[][] trans(int[][] arr){
    int rows = arr.length;
    int cols = arr[0].length;

    int[][] result = new int[cols][rows];

    for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
            result[j][i] = arr[i][j];
        }
    }
    return result;
}
public static int[][] right(int[][]arr) {
    int rows = arr.length;
    int cols = arr[0].length;

    int startCol = cols / 2;
    int newCols = cols - startCol;

    int[][] result = new int[rows][newCols];

    for (int i = 0; i < rows; i++){
        for (int j = 0; j < newCols; j++){
            result[i][j] = arr[i][startCol + j];
        }
    }
    return result;
}
public static void main (String[] args) {
    int[][] a = { {1,2,3,4,5,6},
                {2,3,4,5,6,7},
                {3,4,5,6,7,8},
                {4,5,6,7,8,9} };

System.out.println("**** inner");
    for (int[] r : a)

System.out.println(Arrays.toString(r));
System.out.println();

    for (int[] r : inner(a))

System.out.println(Arrays.toString(r));
System.out.println("\n**** trans");
    for (int[] r : a)

System.out.println(Arrays.toString(r));
System.out.println();
    for (int[] r : trans(a))

System.out.println(Arrays.toString(r));
System.out.println("\n**** right");
    for (int[] r : a)

System.out.println(Arrays.toString(r));
System.out.println();

    for (int[] r : right(a))

System.out.println(Arrays.toString(r));
    }
}


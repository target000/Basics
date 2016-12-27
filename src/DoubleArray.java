
public class DoubleArray {
    public static void main(String[] args) {

        int m = 3;
        int n = 5;
        int[][] d2Arr = new int[m][n];

        int k = 0;

        for (int i = 0; i < d2Arr.length; i++) {
            for (int j = 0; j < d2Arr[i].length; j++) {
                d2Arr[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < d2Arr.length; i++) {
            for (int j = 0; j < d2Arr[i].length; j++) {
                System.out.print(d2Arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

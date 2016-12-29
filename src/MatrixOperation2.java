
public class MatrixOperation2 {
    public static void main(String[] args) {

        // do a forward diagonal / swap

        // access 2d arr column by column instead of row by row

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < mat.length; j++) {
            reverse2DArray(mat);
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                // swap [i,j] with [j,i]
                if (i < j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

        System.out.println("---------");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    // this is important, instead of swapping elements swap the arrays instead
    // { {1,2,3}, {4,5,6}, {7,8,9} } ==> { {7,8,9}, {4,5,6}, {1,2,3} }
    public static void reverse2DArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int mid = arr.length / 2;

        for (int i = 0; i < mid; i++) {
            int[] temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}

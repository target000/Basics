
public class MatrixOperation {

    public static void main(String[] args) {

        // 1 2 3
        // 4 5 6
        // 7 8 9

        // diagonal 1 5 9 swap, [0,1] - [1,0]
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // print original
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mat.length; i++) {
            reverseArr(mat[i]);
        }

        // note that i < j, when i == j it is the diagonal, no point to swap, when i > j you are undoing what you did with i < j
        // if above not applied, you end up with the same matrix since you will double count
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

        // diagonal 3 5 7 swap, [0, 1] - [ 1, 2]

    }

    // this is a in-place reverse array algorithm
    public static void reverseArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int mid = arr.length / 2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}

public class Task7 {
    public static void main(String[] args) {

        /*Create a 2D array or integer type where you will store odd and even numbers
        in 3 rows and 4 columns. Develop a program which will identify/print
        the even numbers only.
         */

        int[][] num = {{3, 6, 9, 12},
                {2, 8, 14, 30},
                {13, 19, 5, 28}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("------------");
        for (int[] x : num) {
            for (int odd : x) {
                if (odd % 2 == 0) {
                    System.out.print(odd + " ");
                }
            }
        }
    }
}

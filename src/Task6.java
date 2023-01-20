public class Task6 {
    public static void main(String[] args) {
         /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
         Print the sum of all numbers
         */

        int[][] num={{3,6,9},
                {4,8,12},
                {5,10,15}};

        int sum=0;

        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum+=num[i][j];
            }
        }
        System.out.println(sum);

    }
}

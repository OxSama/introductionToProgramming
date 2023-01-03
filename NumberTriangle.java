
public class NumberTriangle {
    public static void main(String[] args) {
        int i, j;
        int rows = 7;
        // ​outermost loop to represent the number of rows which is 7 in this case
        // for the upper half of arrow
        for (i = 1; i <= rows; i++) {
            // ​innermost loop is to print the numbers in the specific rows
            // for the upper half of arrow
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // ​ outermost loop to represent the number of rows which is 6 in this case
        // for the lower half of arrow
        for (i = rows - 1; i >= 1; i--) {
            // innermost loop is to print the numbers in the specific rows
            // for the lower half of arrow
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
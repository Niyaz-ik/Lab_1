/**
 * @author Niyaz
 * @version 1.0
 * This is the Main class
 */

public class Main{
    /**
     * Here start point of the program
     */
    public static void main(String[] args){
        System.out.println("Starting project");

        byte v_byte = 120;
        System.out.println("This is a byte: "+v_byte);
        short v_short = 129;
        System.out.println("This is a short: "+v_short);
        char v_char = 'a';
        System.out.println("This is a char: "+v_char);
        int v_int = 65999;
        System.out.println("This is a int: "+v_int);
        long v_long = 429496796112L;
        System.out.println("This is a long: "+v_long);
        float v_float = 0.33333334f;
        System.out.println("This is a float: "+v_float);
        double v_double = 0.3333333333333333;
        System.out.println("This is a double: "+v_double);
        boolean v_bool = true;
        System.out.println("This is a bool: "+v_bool+ "\n");

        for (int i = 97; i <= 122; i++)
        {
            char c_char = (char) i;
            System.out.println("Unicode "+ i + " is " + c_char);
        }
        System.out.println("");

        long begin = new java.util.Date().getTime();
        for (int i = 0; i <= 100000000; i++);
        long end = new java.util.Date().getTime();
        System.out.print("If I is int: ");
        System.out.println(end-begin);

        begin = new java.util.Date().getTime();
        for (long i = 0; i <= 100000000; i++);
        end = new java.util.Date().getTime();
        System.out.print("If I is long: ");
        System.out.println(end-begin);
        System.out.println("");

        int max = 0;
        int[] mas = {12,43,12,-65,778,123,32,76};
        for (int i = 0; i < mas.length; i++)
        {
            if (mas[i] > max){
                max = mas[i];
            }
        }
        System.out.println("Max number is: " + max + "\n");

        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j]=(int)Math.round(Math.random()*10);
            }
        }

        System.out.println("Initial Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("\n" + "Final Matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
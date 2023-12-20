import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = num3;

        if(max>num1 || max> num2){

            System.out.println(max);
        } else if (max>num1 || max< num2) {
            System.out.println(num2);
        } else if (max>num2 || max < num1) {
            System.out.println(num1);
        }


    }
}
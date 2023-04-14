import java.lang.reflect.Array;
import java.util.Scanner;
public class ABC {
    public static void main(String[] args){
        int num1 = 0; int num2 = 0; int num3 = 0;
        int [] order;
        Scanner input = new Scanner(System.in); //Take in input

        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        input.nextLine();
        String letters = input.nextLine();
        System.out.print(num1 + " " + num3 + " " + num2); //output order
    }
}

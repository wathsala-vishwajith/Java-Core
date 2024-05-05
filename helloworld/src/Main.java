import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = reader.nextInt();
        if(num % 2 == 0 ){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }
}
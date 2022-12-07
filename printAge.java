import java.util.Scanner;

public class printAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        if (age >= 50){
            System.out.println("You are old");
        }
        else System.out.println("You are Young");
    }
}
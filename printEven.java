import java.util.Scanner;
public class printEven {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num");
        int number = sc.nextInt();
        sc.close();
        int i=0;
        while(i<=number){
            System.out.println((i++ % 2 == 0) ? i + " odd" : i + " even");
        }
    }    
}
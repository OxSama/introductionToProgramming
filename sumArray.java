public class sumArray{
    public static void main(String args[]){
        int [] arrayOfNumbers = {1234,3,3,4,5,46,57,8,9,10};
        int sum = 0;
        for(int i = 0; i < arrayOfNumbers.length; i++){
            sum += arrayOfNumbers[i];
        }
        System.out.print(sum);
    }
}
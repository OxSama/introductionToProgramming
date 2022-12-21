public class loopsHW{
    public static void main (String [] args){
        // for(int i = 1 ; i < 6 ; i++){
        //     for(int j = 6 ; j >= 1  ; j--){
        //         if(j <= i){System.out.print(j);}
        //         else{System.out.print(" ");}
        //     }
        //     System.out.println("");
        // }
        for(int i = 1; i< 5; i++){
            for(int j = 5; j >= 1; j--){
                if(j <= i) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
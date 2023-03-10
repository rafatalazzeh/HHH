import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrnumbers = {2, 4, 6, 12};
        phang(arrnumbers);


    }

    public static int[] phang(int[] arrnumbers) {
        int[] arrNumbers1 = arrnumbers;
        for ( int i = 0 ; i<arrNumbers1.length;i++){
            if (2%arrNumbers1[i] ==0){
                System.out.println("true");
            }
        }


        return arrNumbers1;
    }
}






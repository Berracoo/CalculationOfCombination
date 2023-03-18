import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner num = new Scanner(System.in);
        System.out.print("Please enter the first number of elements : ");
        int n = num.nextInt();
        System.out.println("*******************");
        System.out.print("Please enter the second number of elements and" +
                " be sure it's smaller than the first one: ");
        int r = num.nextInt();
        System.out.println("*******************");
        num.close();

        int factorial1 = 1,factorial2 = 1,factorial3 = 1;
        if(r == 0){
            System.out.println("Combination result equals to : 1.");
        }


        for(int i = 1; i <= n; i++ ){
                factorial1 *= i;
        }for (int j = 1; j <= r; j ++){
            factorial2 *= j;
        }for (int l = 1; l <= (n-r); l++){
            factorial3 *= l;
        }
        int combination = factorial1 / (factorial2 * factorial3);

        System.out.println("The combination result of C(n,r) is : " + combination);
    }
}

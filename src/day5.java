import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        System.out.println("1. Check Prime Number");
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = obj.nextInt();
        int count = 0;
        if (num >= 2){
            for (int i=2 ; i<=num ; i++){
                if (num%i==0){
                    count++;
                }
            }
            if (count>1){
                System.out.println("No , it Not prime number . ");
            }
            else {
                System.out.println("Yes , it is prime number . ");
            }
        } else if (num <= 1) {
            System.out.println("No , it Not prime number . ");
        }
        else {
            System.out.println("invalid");
        }

    }
}

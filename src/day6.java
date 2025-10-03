import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Choose which one :\n" +
                "1.Method to check if a number is prime\n"+
                "2.Method to find factorial of a number\n"+
                "3.Method to find GCD of two numbers\n"+
                "4.Method to check if a string is palindrome\n"+
                "5.Method to calculate Fibonacci series up to n terms\n"
        );
        int n= obj.nextInt();
        switch (n){
            case 1:
                prime();
                System.out.println();
                break;
            case 2:
                factorial();
                System.out.println();
                break;
            case 3:
                System.out.println("The Greatest common divisor (GCF) of two numbers are: "+ GCD());
                break;
            case 4:
                palin();
                System.out.println();
                break;
            case 5:
                fibo();
                System.out.println();
                break;

        }
    }
    public static int prime(){
        return 0;
    }
    public static int factorial(){

        return 0;
    }
    public static int GCD(){
        System.out.print("Enter First number :");
        Scanner obj1=new Scanner(System.in);
        int num1= obj1.nextInt();
        System.out.print("Enter Second number :");
        int num2= obj1.nextInt();
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void palin(){


    }
    public static void fibo(){

    }
}

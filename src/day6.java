import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        while(true){
            System.out.print("\nChoose which one :\n" +
                    "1.Method to check if a number is prime\n"+
                    "2.Method to find factorial of a number\n"+
                    "3.Method to find GCD of two numbers\n"+
                    "4.Method to check if a string is palindrome\n"+
                    "5.Method to calculate Fibonacci series up to n terms\n"+
                    "6.Exit\n"
            );
            int n= obj.nextInt();
            switch (n){
                case 1:
                    System.out.print("Enter number :");
                    int num3= obj.nextInt();
                    System.out.println("It is Prime number :"+prime(num3));
                    break;
                case 2:
                    System.out.print("Enter number :");
                    int num4= obj.nextInt();
                    System.out.println("Factorial of this number is :"+factorial(num4));
                    break;
                case 3:
                    System.out.print("Enter First number :");
                    int num1= obj.nextInt();
                    System.out.print("Enter Second number :");
                    int num2= obj.nextInt();
                    System.out.println("The Greatest common divisor (GCF) of two numbers are: "+ GCD(num1,num2));
                    break;
                case 4:
                    System.out.print("Enter the string :");
                    obj.nextLine(); // consume newline
                    String str = obj.nextLine();
                    System.out.println("This string is palindrome : "+palin(str));
                    break;
                case 5:
                    System.out.print("Enter the required steps :");
                    int num5= obj.nextInt();
                    fibo(num5);
                    break;
                case 6:
                    System.out.println("System exiting.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose right index number!");
            }
        }
    }
    public static boolean prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static int factorial(int num4){
        int fact=1;
        for (int i=1;i<=num4;i++){
            fact*=i;
        }
        return fact;
    }
    public static int GCD(int num1,int num2){
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static boolean palin(String str){
        String str1="";
        int l= str.length();
        for (int i=l-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        return str1.equals(str);
    }
    public static void fibo(int num5){
        int f1=0,f2=1,f3;
        for (int i=1;i<=num5;i++){
            System.out.print(f1+" ");
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
    }
}

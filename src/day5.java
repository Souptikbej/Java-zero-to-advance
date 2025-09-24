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
            System.out.println("invalid number");
        }

        System.out.println("2. Find Factorial");
        System.out.println("Enter Number : ");
        int num1 = obj.nextInt();
        int fact=1;
        if (num1<0)
            System.out.println("Enter positive number.");
        else if (num1==0)
            System.out.println("Factorial 0 is 1");
        else
            for (int i=1;i<=num1;i++){
                fact=fact*i;
            }
            System.out.println("factorial of "+num1+" is :"+fact);


        System.out.println("3. Fibonacci Series");
        System.out.println("Enter Number of trams : ");
        int num2 = obj.nextInt();
        int fibo1=0 , fibo2=1 , fibo3;
        for (int i=1;i<=num2;i++){
            System.out.print(fibo1+" ");
            fibo3=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibo3;
        }


        System.out.println("\n4. Palindrome Number");
        System.out.println("Enter Number : ");
        int num3 = obj.nextInt();
        int remin,temp=0,depli=num3;
        while(num3>0){
            remin=num3%10;
            temp=temp*10+remin;
            num3=num3/10;
        }
        if (temp==depli)
            System.out.println("Yes , it's palindrome number.");
        else
            System.out.println("No , it's not palindrome number .");


        System.out.println("\n5. Greatest Common Divisor (GCD) LCM (Least Common Multiple)");
        System.out.println("Enter first Number : ");
        int num5= obj.nextInt();
        System.out.println("Enter second Number : ");
        int num6= obj.nextInt();
        int gcf_ans = GCF(num5,num6);
        int lcm_ans=LCM(num5,num6);
        System.out.println("The Greatest common divisor (GCF) of two numbers are: "+gcf_ans);
        System.out.println("The Lowest common multiplier (LCM) of two numbers are: "+ lcm_ans);

    }
    public static int GCF(int a, int b){
        if (b==0){
            return a;
        }
        else {
            return GCF(b,a%b);
        }
    }
    public static int LCM(int a, int b){
        return (a * b) / GCF(a, b);
    }

}

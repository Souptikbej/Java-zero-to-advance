import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        //Check whether a number is positive, negative, or zero (using if-else).
        System.out.println("1. Check whether a number is positive, negative, or zero (using if-else).");
        int x= 0;
        if (x>0){System.out.println("It's Positive number ");}
        else if (x<0) {System.out.println("It's Negative number ");}
        else if (x==0) {System.out.println("It's Zero ");}
        else {System.out.println("Invalid ");}

        //Take marks as input and print grade (A, B, C, Fail) using if-else ladder.
        System.out.println("2. Take marks as input and print grade (A, B, C, Fail) using if-else ladder.");
        Scanner obj=new Scanner(System.in);
        System.out.println("\nWhat is yours total marks out of 100 : ");
        int mark=obj.nextInt();
        if (mark>=91){System.out.println("Outstanding : O");}
        else if (mark>=81) {System.out.println("Excellent : A+");}
        else if (mark>=71) {System.out.println("Very Good : A");}
        else if (mark>=61) {System.out.println("Good : B+");}
        else if (mark>=56) {System.out.println("Above Average : B");}
        else if (mark>=51) {System.out.println("Average : C");}
        else if (mark>=33) {System.out.println("Pass : D");}
        else if (mark>=0) {System.out.println("Fail : Need Improvement");}
        else {System.out.println("Chack ! Need Marks out of 100");}

        //Write a program using switch to print day of the week (1=Monday, … 7=Sunday).
        System.out.println("\n3. Write a program using switch to print day of the week (1=Monday, … 7=Sunday).");
        System.out.print("Enter number day of one week :");
        int weeknum = obj.nextInt();
        switch (weeknum){
            case 1:{System.out.println("Monday = associated with the Moon\n");break;}
            case 2:{System.out.println("Tuesday = from the god Tiw, associated with Mars\n");break;}
            case 3:{System.out.println("Wednesday = from Germanic god Odin\n");break;}
            case 4:{System.out.println("Thursday = from Germanic god of thunder Thor\n");break;}
            case 5:{System.out.println("Friday = from Germanic goddess Frigga associated with Venus\n");break;}
            case 6:{System.out.println("Saturday = associated with Saturn\n");break;}
            case 7:{System.out.println("Sunday = associated with the Sun\n");break;}
            default:{System.out.println("Invalid !");break;}
        }


        //Print numbers from 1 to 20 using for loop.
        System.out.println("4. Print numbers from 1 to 20 using for loop.");
        for (int i=1;i<=20;i++){
            System.out.print(i+" ");
        }

        //Print even numbers between 1 to 50 using while loop.
        System.out.println("\n\n5. Print even numbers between 1 to 50 using while loop.");
        int j=1;
        while (j<=50){
            if (j%2==0){
                System.out.print(j+" ");
            }
            j++;
        }


        //Find sum of digits of a number using do-while loop.
        System.out.println("\n\n6. Find sum of digits of a number using do-while loop.");
        int findnum = 1234;
        int sum= 0 ;
        do {
            int a= findnum%10;
            sum=sum+a;
            findnum=findnum/10;
        }while (findnum>0);
        System.out.println("Sum of digits : "+sum);
    }
}

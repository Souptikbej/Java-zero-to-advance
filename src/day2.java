import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        String name="Souptik Bej";
        String rollnum="BWU/BTA/22/685";
        String dept="B.Tech";
        int sem=7;
        int year=4;
        String prog="BTech CSE in AI & ML";
        System.out.println("Create variables for your name, age, and salary. Print them in one line.\n");
        System.out.println("Name :" +name +"\n"+
                        "Student Code :" +rollnum+"\n"+
                        "Department :" +dept+"\n"+
                        "Semester :" +sem+"\n"+
                        "Year :" +year+"\n"+
                        "Program :" +prog+"\n"
        );
        System.out.println("Write a program to add, subtract, multiply, and divide two numbers.\n");
        int a=10;
        int b=20;
        System.out.println("A = "+a+"\n"+
                        "B = "+b+"\n"+
                        "A + B = "+(a+b)+"\n"+
                        "A - B = "+(a-b)+"\n"+
                        "A x B = "+(a*b)+"\n"+
                        "B / A = "+(b/a)+"\n"
        );
        System.out.println("Write a program to check if one number is greater than another.\n");
        int x=10;
        int y=20;
        System.out.println("X = "+x+"\n"+"Y = "+y+"\n");
        if (x > y) {
            System.out.println("Y is greater than X .");
        } else {
            System.out.println("X is greater than Y .");
        }


        System.out.println("Write a program that checks if a number is even or odd using %.\n");
        int num1=10;
        if (num1%2==0){
            System.out.println(num1+" is even number .");
        }
        else {
            System.out.println(num1+" is odd number .");
        }


        System.out.println("\n5.Write a program that uses &&, ||, and ! to test logical conditions.\n");
        int num2 = 10;
        int num3 = 50;
        if (num2>5 && num3<100){
            System.out.println("Both condition are True ");
        }
        if (num2>15 || num3<100){
            System.out.println("At least one condition is true");
        }
        boolean flag = true;
        System.out.println("!flag = " + !flag);
    }
}

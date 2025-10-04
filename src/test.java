import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the string :");
        String str= obj.nextLine();
        String str1="";
        int l= str.length();
        for (int i=l-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if (str1.equals(str))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

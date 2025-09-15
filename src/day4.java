public class day4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("1. Print numbers from 1 to 100, but skip multiples of 5.");
        for (int i=1 ; i<=100 ; i++){
            if (i%5==0)
                continue;
            System.out.print(i+ " ");
        }


        System.out.println("\n2. Print first 10 multiples of 7 using a loop.");
        for (int i = 1; i<=10 ; i++){
            System.out.println("7 X "+i+" = "+7*i);
        }


        System.out.println("3. Print a multiplication table (up to 10x10).");
        for (int i= 1 ; i<=10 ; i++){
            for (int j=1 ; j<=10 ; j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
        }

        System.out.println("4. Print a hollow square of stars. Example for n=5:");
        int n=5;
        for (int i= 1 ; i<= n ; i++){
            for (int j=1 ; j<=n ; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("5. Print Floyd’s Triangle (numbers in triangle form):");
        int k=1;
        for (int i =1 ; i<= 4 ; i++){
            for (int j= 1 ; j<=i ; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }

    }
}

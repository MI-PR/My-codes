import java.util.Scanner;

class Palnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = sc.nextInt();

        int t = n;

        int a = 0; 

        do{
            a = a *  10 + t % 10;
            t /= 10;
        }while(t != 0);

        if (a == n) {
            System.out.println("The number is a  palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close();
    }
}

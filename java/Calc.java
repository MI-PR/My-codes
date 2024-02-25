import java.io.*;
import java.util.Scanner;

class Calc {
    public static void main (String st[]){
        System.out.println("Enter a binary equation of basic operations");
        float a,b;
        char c;

        Scanner sc = new Scanner (System.in);

        a = sc.nextFloat();
        c = sc.next().charAt(0);
        b = sc.nextFloat();

        if(c=='+'){
        System.out.println(a+b);
        }
        if(c=='-'){
            System.out.println(a-b);
        }
        if(c=='*'){
            System.out.println(a*b);
        }
        if(c=='/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid");
        }
    }
}

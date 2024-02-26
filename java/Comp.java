import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        
        int temp = 25;

        if (temp>30) {
            System.out.println("It is hot outside ");
        }

        Scanner sc = new Scanner(System.in);

        String r = sc.next();

        if (r.equals("q") || r.equals("Q")) {
            System.out.println("No");
        }

        else{
            System.out.println("not quit");
        }

        sc.close();
    }
}
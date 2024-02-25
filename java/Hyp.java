import java.util.Scanner;

class Hyp {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length and breadth : ");
        x = sc.nextInt();
        y = sc.nextInt();

        sc.close();

        z = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));

        System.out.println(z);

    }
}

import java.util.Scanner;

class Matrixmult {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns in first matrix:");

        Scanner sc  = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int m1[][] = new int [r1][c1];
        System.out.println("Enter elements of first matrix:");

        int i,j;

        for(i=0;i<r1;i++){
            for(j=0;j<c1;j++){
                m1[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<r1;i++) {
            for(j=0;j<c1;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.println( "\n" );
        }

        int r2,c2;
        do{
            System.out.println("Enter the number of rows and columns in second matrix : ");
            
            r2 = sc.nextInt();
            c2 = sc.nextInt();

            if(c1 != r2)
            System.out.println("Enter the row with same column value in matrix 1");

        }while(c1 != r2);

        int m2[][] = new int [r2][c2];
        System.out.println("Enter elements of second matrix:");

        for(i = 0;i < r2;i++)
        {
            for(j = 0; j < c2; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<r2;i++) {
            for(j=0;j<c2;j++){
                System.out.print(m2[i][j]+"\t");
            }
            System.out.println( "\n" );
        }

        System.out.println("Matrix product is ");

        int c[][] = new int[r1][c2];

        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                for(int k = 0;k<r2;k++){
                    c[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        for(i=0; i<r1; i++) {
            for(j=0; j<c2 ;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println("\n");
         }
    }
}

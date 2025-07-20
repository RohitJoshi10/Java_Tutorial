package Arrays;
import  java.util.Scanner;
public class Two_D_Arrays {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n,m;
        System.out.println("Enter rows and col: ");
        n = sc.nextInt();
        m = sc.nextInt();

        int [][]arr = new int[n][m];
        // int arr[][] = new int[n][m];

        System.out.println("Enter the element of the arrays: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are: ");
        for(int row=0; row<n; row++)
        {
            for(int col=0; col<m; col++)
            {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(" ");
        }

    }
}

// In java INT_MIN means Integer.MIN_VALUE
// INT_MAX means Integer.MAX_VALUE
// int marks[][] = { {1,2,3}, {4,5,6}, {7,8,9} };

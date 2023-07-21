import java.util.*;

public class tm {
    public static void main(String[] args) {
        int[][] m = new int[2][2];
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];  
        Scanner sc = new Scanner(System.in);

        for (int k = 0; k < m.length; k++) {
            for (int j = 0; j < m[k].length; j++) {
                m[k][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = m[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    b[i][j] += a[i][k] * m[k][j];
                }
            }
        }
        for (int i = 0; i < b.length; i++, System.out.println()) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
    }
}

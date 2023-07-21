import java.util.Scanner;
    
    public class maine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numProducts = scanner.nextInt();
            int[] salesValues = new int[numProducts];
            
            for (int i = 0; i < numProducts; i++) {
                salesValues[i] = scanner.nextInt();
            }
            
            int totalSales = calculateTotalSales(numProducts, salesValues);
            System.out.println(totalSales);
        }
        
        public static int calculateTotalSales(int numProducts, int[] salesValues) {
          
        int totalSales = salesValues[numProducts - 1] + salesValues[numProducts - 2];
            
            return totalSales;
        }
    }
     


import java.util.Scanner;
class triplets 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
    {
        arr[i] = sc.nextInt();
    }
        int count = 0;
        for (int i = 0; i < n - 2; i++) 
    {
        for (int j = i + 1; j < n - 1; j++) 
    {
        for (int k = j + 1; k < n; k++) 
    {
        if (arr[i] + arr[j] == arr[k] || arr[i] + arr[k] == arr[j] || arr[j] + arr[k] == arr[i]) 
    {
        count++;
            }
        }
    }
}
        System.out.println("Number of triplets satisfying the condition: " +count);
    }
}
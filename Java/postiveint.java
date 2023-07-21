import java.util.Arrays;
public class postiveint {
  static void rearrange(int[] arr, int n)
	{
		int temp[] = arr.clone();
        int small = 0, large = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
		if (flag)
		arr[i] = temp[large--];
		else
		arr[i] = temp[small++];
        flag = !flag;
		}
	}
    public static void main(String[] args)
	{
		int arr[] = new int[] { 1,2,3,4,5,6 };

		System.out.println("arr[]");
		System.out.println(Arrays.toString(arr));

		rearrange(arr, arr.length);

		System.out.println("Output");
		System.out.println(Arrays.toString(arr));
	}
}
  


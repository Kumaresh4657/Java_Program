import java.util.*;

public class maxproduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        int nums[]=new int [4];
        for(int i=0;i<4;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<3;i++){
            a=(nums[i+1]-1);
            b=(nums[i]-1);
    }
    System.out.println(a*b);
}
}
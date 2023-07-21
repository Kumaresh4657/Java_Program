public class Solution {
    static int dp[][]=new int[501][501];
    static int mcm(int arr[], int i, int j){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int mn=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=mcm(arr,i,k) + mcm(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(temp<mn){
                mn=temp;
            }
        }
        return dp[i][j]=mn;
    }
    static int matrixMultiplication(int N, int arr[])
    {
      
        int i=1,j=N-1;
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return mcm(arr,i,j);
    }
}
}

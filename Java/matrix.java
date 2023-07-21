package Nightclss;
import java.util.*;
public class Matrix {
public static void main(String[] args) {
            Scanner sh=new Scanner(System.in);
            int n=sh.nextInt();
            int arr[][]=new int[n][n];
         
            
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    arr[i][j]=sh.nextInt();
                }
            }
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
          
                if(( (i==0)&&(j==2))||((i==2)&&(j==0))||((i==0)&&(j==0))||((i==2)&&(j==2)))
                        
                {
                    arr[i][j]=arr[i][j]+arr[1][1];
                
                    System.out.print(arr[i][j]+" ");		
                }
                else if(arr[i][j]==arr[1][1])
                {
                    arr[i][j]=arr[i][j];
                    System.out.print(arr[i][j]+" ");	
                }
                else {
                    
                    System.out.print("*"+" ");
                }
                }
                System.out.println();
                }
            
            }}
     

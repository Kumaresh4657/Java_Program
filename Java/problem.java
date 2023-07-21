import java.util.Scanner;

public class problem {  

public static void main(String[] args) {  

  Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();  
    int n = sc.nextInt();

    while (n != 0) {  
    int w = sc.nextInt();
    int h = sc.nextInt();
    System.out.println(((w >= L) && (h >= L)) ? w == h ? "Accepted" : "Crop it" : "Upload another");
     n--;
    }

}

}

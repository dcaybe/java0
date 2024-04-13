package lab03;

import java.util.Scanner;

public class bai1 {public static void main(String[] args) {
    int i;
    int dem=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap so can xet");
    int n = scanner.nextInt();
    if (n==0 || n==1) System.out.println("khong phai so nguyen to");
        else{
        for( i=2;i<=(n/2);i++){
            if(n%i==0) dem++;
               
            
            
        }
        
        if(dem==0) System.out.println(n+"la so nguyen to");
            else System.out.println(n+"khong phai so nguyen to");
}
    
}
}
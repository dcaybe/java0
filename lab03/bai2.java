package lab03;

import java.util.Scanner;

public class bai2 {
//     Dùng vòng lặp từ 1 tới 10
// sysout(" %d x %d = %d ", x, i, x*i)
    public static void main(String[] args) {
        
    Scanner scanner= new Scanner(System.in);
    System.out.println("nhap so muon lam bang cuu chuong");
    int x= scanner.nextInt();
    for(int i=1;i<10;i++){

        System.out.println(x+"x"+i+"="+(x*i));
    }
    }
}

package lab02;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
//         Nếu a = 0 => làm tương tự ví dụ bài 1
// - Nếu a # 0:
//  - Tính delta = b^2 - 4ac.
//  - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//  - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//  - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//  x1 = (-b + căn(delta))/(2*a)
//  x2 = (-b - căn(delta))/(2*a
        Scanner scanner = new Scanner(System.in);
        System.out.println("giải phương trình bậc 2");
        
        System.out.println("nhap gia tri cua a");
        int a = scanner.nextInt();
        System.out.println("nhap gia tri cua b");
        int b = scanner.nextInt();
        System.out.println("nhap gia tri cua c");
        int c = scanner.nextInt();
        double delta= ((Math.pow(b,2))-4*a*c);
        if(delta<0)System.out.println("phuong trinh vo nghiem");
            else if (delta==0)System.out.println("phuong trinh co nghiem kep x="+-b+"/"+2*a);
                else {
                    System.out.println("phuong trinh co hai nghiem phan biet:");
                    double x1=(double)(-b+Math.sqrt(delta)/(2*a));
                    double x2=(double)(-b-Math.sqrt(delta)/(2*a));
                    System.out.println("x1="+x1);
                    System.out.println("x2="+x2);
                    
                }
        }
    
}

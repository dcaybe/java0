package lab02;

import java.util.Scanner;

public class axb {
    public static void main(String[] args) {
//         Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
// - Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
// - Còn lại: x = -b/a => thông báo x = ?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giai phuong trinh ax+b=0");
        System.out.println("nhap gia tri cua a");
        int a = scanner.nextInt();
        System.out.println("nhap gia tri cua b");
        int b = scanner.nextInt();
        if (a==0 && b==0) System.out.println("pt co vo so nghiem");
            else if (a==0 && b!=0) System.out.println("pt vo nghiem");
                else 
                    System.out.println("pt co nghiem la x="+-b+"/"+a);
                    
    }

    
}

package lab02;

import java.util.Scanner;

public class bai4 {
    public static void axb(){
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
    public static void bai2(){
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
    public static void bai3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dien");
        int sodien=scanner.nextInt();
        if (sodien<=100)System.out.println("Tien dien la: "+1000*sodien);
            else System.out.println("Tien dien la:"+((sodien-100)*1500+100000));
    }

    public static void main(String[] args) {
    
System.out.println(">> LUA CHON TINH NANG<<");
System.out.println("++ ----------------------------------------- ++");
System.out.println("| 1. Giai phuong trinh bac nhat |");
System.out.println("| 2. Giai phuong trinh bac hai |");
System.out.println("| 3. Tinh so tien dien |");
System.out.println("| 4. Ket thuc |");
System.out.println("++ ------------------ ++");
    Scanner scanner = new Scanner(System.in);
    int luachon=scanner.nextInt();
    switch (luachon) {
        case 1:
            axb();
            break;
         case 2:
            bai2();
            break;
        case 3:
            bai3();
            break;
    
        default:
        System.out.println("ban da thoat ");
            System.exit(0);
    }
    
}
    
}

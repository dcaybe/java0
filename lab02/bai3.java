package lab02;

import java.util.Scanner;

public class bai3 {public static void main(String[] args) {
            //     nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
            // - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
            // - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
     Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so dien");
        int sodien=scanner.nextInt();
        if (sodien<=100)System.out.println("Tien dien la: "+1000*sodien);
            else System.out.println("Tien dien la:"+((sodien-100)*1500+100000));
}
    
}

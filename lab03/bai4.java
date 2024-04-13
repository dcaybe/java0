package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai4 {public static void main(String[] args) {
//     - Sắp xếp và xuất mảng vừa nhập ra màn hình
// - Xuất phần tử có giá trị nhỏ nhất
// - Xuất phần tử có giá trị lớn nhất
// Gợi ý:
// - Sử dụng Arrays.sort
// - Sử dụng Math.min, Math.max

    System.out.println("nhap so phan tu trong mang");
    
    Scanner scanner= new Scanner(System.in);
    int n =scanner.nextInt();
    int [] mangsongnguyen =new int [n];
    for (int i=0; i<n;i++)
    {
        System.out.println("nhap phan tu thu"+i);
        mangsongnguyen[i]=scanner.nextInt();
    }
    Arrays.sort(mangsongnguyen);
    System.out.println("mang sau khi sap xep"+Arrays.toString(mangsongnguyen));
    System.out.println("phan tu nho nhat cua mang la"+mangsongnguyen[0]);
    System.out.println("phan tu lon nhat cua mang la"+mangsongnguyen[n-1]);



    
}
}

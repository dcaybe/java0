package chapter4;

public class video23 {
    public static void main(String[] args) {
        sinhvien sv1 = new sinhvien();
        sv1.ten = "Nguyen Van A";
        sv1.tuoi = 20;
        System.out.println("Ten: " + sv1.ten);
        System.out.println("Tuoi: " + sv1.tuoi);
       sinhvien test = new sinhvien();
       test.sum(6,5);
       System.out.println("Tong la: " + test.sum(6,5));
    }

    
}

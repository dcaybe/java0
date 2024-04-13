package chapter4;

public class sinhvien {
    String ten;
    int tuoi;
    int sum (int a, int b) {
        return a + b;

       
    }
    public sinhvien(String ten, int tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public sinhvien(){
        this.ten = "hung";
        this.tuoi = 19;
    }
    public  String getName(){
        return this.ten;
    }
    public void setName(String name1){
        this.ten = name1;       

    }


    public void learnJava() {
        System.out.println("Learning Java with hoidanit");
    }
}

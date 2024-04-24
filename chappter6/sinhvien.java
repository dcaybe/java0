package chappter6;

public abstract class sinhvien {  //abstract class bat buoc cac lop con ke thua lai abstract cua lop cha
    protected String id;            
    protected String name;
    protected double price;
    protected double tax;
    public double getPriceTax() {
        return this.price* this.tax;
    }
    public void info (){
        System.out.println("run info");
    }
    sinhvien(String id, String name, double price, double tax){
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;

    }
    abstract void tinhDiem     ();


    
}

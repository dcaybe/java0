package chappter6;

public class sinhvienIT extends sinhvien{
    private String language;
    public void getMoney(){
        System.out.println( "run get money");
        super.info();//goi phuong thuc info cua lop cha, luon goi cha. neu la this.info() thi goi cua lop con
        
    }
   
    public void info(){
        System.out.println("run info in sinhvienIT");
    }
    sinhvienIT(String language,String id, String name, double price, double tax){
        super(id,name,price,tax);
        this.language = language;

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
}

package chappter6;

public class student {
    String name;
    int id;
    
    @Override
    public String toString() {
        return "student [name=" + name + ", id=" + id + "]";
    }
    student(String name,int id){
        this.name = name;
        this.id = id;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public static void main(String[] args) {
        
    }
    
}

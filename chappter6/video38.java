package chappter6;

import java.util.ArrayList;
import java.util.Scanner;

public class video38 {public static void main(String[] args) {
 
//     System.out.println("run video38");
//     Scanner sc = new Scanner(System.in);
//     System.out.println("nhap vao ten nguoi dung");
//     String username = sc.nextLine();
//     //sc.nextLine();
//     System.out.println("nhap vao password");
//     String password = sc.nextLine();
//     System.out.println("username= "+username + " password= "+password);
//     if (username.equals("hoidanit") && (password.length()>6)){
//         System.out.println("dang nhap thanh cong");

// } 
  student st1= new student("hoidanit", 123);
  student st2= new student("nguyen van a", 123);
  student st3= new student("nguyen van b", 123);
  student st4= new student("hoidanit", 123);
  student st5= new student("hoidanit", 123);
    ArrayList<student> list = new ArrayList();
    list.add(st1);
    list.add(st2);
    list.add(st3);
    list.add(st4);
    list.add(st5);
   System.out.println(list);
   for(int i =0; i<list.size();i++){
       if (list.get(i).getName().startsWith("nguyen")){      //startswith dùng để tìm xem kí tự bắt đầu bằng ()
           System.out.println(list.get(i));
   }

}
}
}

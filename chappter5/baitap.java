package chappter5;

import java.util.ArrayList;
import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        
        System.out.println("run bai tap ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList();
        while (true){
            Double x = sc.nextDouble();
            list.add(x);
            System.out.println("continue? y/n");
            String input = sc.next();
            if (input.equals("n")){
                break;
            }
        }
        double sum = 0;
        for (int i =0 ; i<list.size();i++){
            sum += list.get(i);
        }
        System.out.println("sum = "+sum);
    }
    
}

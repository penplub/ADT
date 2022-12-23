// Karanthaphong Areerak 652115001

import java.util.Scanner;
import java.util.Vector;

public class Tutorial3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<Integer> mynumber = new Vector<Integer>();// create vector
        while (true) {
            System.out.println("Enter number :");
            String myscan = input.nextLine(); 
            if (myscan.isEmpty()) {//press enter to stop put number and show
                break;
                
            }
            int number = Integer.parseInt(myscan);// change String ti int
            mynumber.add(number);// put number on keyboard to vector

            
        }

        mynumber = sort(mynumber);
        show(mynumber);

    }
    //method print vector
    private static void show(Vector<Integer>v){
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+",");
            
        }
    }
    // sort
    private static Vector<Integer> sort(Vector<Integer>v){
        int s = v.size();
        int temp = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 1; j < s-i; j++) {
                if (v.get(j-1)>v.get(j)) {
                    temp = v.get(j-1);
                    v.set(j-1, v.get(j));
                    v.set(j, temp);
                    
                }
                
            }
            
        }
        return v;
    }
}
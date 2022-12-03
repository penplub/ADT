//Karanthaphong Areerak 652115001
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class tutorial1 {

    public static void main(String[] args) throws FileNotFoundException {
        final int size = 99;
        double mylist[][] = new double[size][size];
        double mytotal[] = new double[size];

        StringTokenizer token;
        File f = new File("C:/Users/TUF GAMING/Desktop/ADT/t1.csv");
        // read the input file
        Scanner myScan = new Scanner(f);
        // read line by line
        int n = 0;
        while (myScan.hasNext()) {
            // keep reading until the end of file
            // store each value in each column to the data structure
            String dataLine = myScan.nextLine();
            // you are going to tokenize the data such that it will seperate into 2 String
            // values
            // parse the string to double
            token = new StringTokenizer(dataLine, ",");
            double a = Double.parseDouble(token.nextToken()); // row a
            double b = Double.parseDouble(token.nextToken()); // row b
            
            mylist[0][n] = a;
            mylist[1][n] = b;
            System.out.println(a + "    " + b);
            n++;

        }
        // sum a + b in my total

        for (int i = 0; i < size; i++) {
            mytotal[i] = mylist[0][i] + mylist[1][i];
        }
        System.out.println("top five of answer :");
        for (int i = 0; i <5; i++) {
            System.out.println(mytotal[i]);
            
        }
        System.out.println("Bottom of five :");
        for (int i = size-5; i < mytotal.length; i++) {
            System.out.println(mytotal[i]);
            
        }
        System.out.println("Sums of row : "+sum(mytotal));

        System.out.println("end of program");

        myScan.close();

    }
    public static double sum(double menu[]){
        double total = 0;
        for (int i = 0; i < menu.length; i++) {
            total = menu[i]+total;

            
        }
        return total;

    }

}

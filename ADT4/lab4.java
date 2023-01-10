/**
 * Karanthaphong Areerak 652115001
 */
public class lab4 {

    public static void main(String[] args) {
        int size = 10;
        String arr[][] = new String[size][size]; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = "0";
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    System.out.printf("%3s", count);
                }else{
                    System.out.printf("%3s", arr[i][j]);
                }
            }
            count++;
            System.out.println();

    }
}
}

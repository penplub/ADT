public class lab4_3 {
    public static void main(String[] args) {
        char arr[][] = new char[10][10];// array declaration

        // init the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 'A';
            

            }
        }
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(arr[i][j]+" ");
                

            }
            if (i<arr.length/2) {
                count--;
                
            }else{
                count++;
            }
            System.out.println();


        }

    }
}

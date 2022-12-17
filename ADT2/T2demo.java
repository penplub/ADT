
/**
 * @author Karanthaphong Areerak 
 * @email Karanthaphong_aree@cmu.ac.th
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.File;

public class T2demo {

    public static void main(String[] args) throws FileNotFoundException {
        Vector<Student> myStudents = new Vector<Student>();
        File f = new File("C:/Users/TUF GAMING/Desktop/ADT2/student_list_65.csv");
        Scanner sc = new Scanner(f);
        // read csv line by line
        StringTokenizer st;
        while (sc.hasNextLine()) {
            String dataLine = sc.nextLine();
            System.out.println(dataLine);
            st = new StringTokenizer(dataLine, ",");
            int index = Integer.parseInt(st.nextToken());
            String SID = st.nextToken();
            String firstName = st.nextToken();
            String lastName = "";
            Student myStudent;
            // token
            if (st.hasMoreTokens()) {
                lastName = st.nextToken();
                myStudent = new Student(index, SID, firstName, lastName);

            } else {
                lastName = "";
                myStudent = new Student(index, SID, firstName);

            }
            myStudents.add(myStudent);

        }
        //print number of student 
        System.out.println("Total student is : " + myStudents.size());
        // print student
        for (int i = 0; i < myStudents.size(); i++) {
            System.out.println(myStudents.get(i).toString());
            
        }
        System.out.println("My student data is : ");
        // search my id
        System.out.println(linearSearch(myStudents, "652115001").toString());
        System.out.println("Program terminated propery");
    }


    private static Student linearSearch(Vector<Student> v, String sid) {
        for (int i = 0; i < v.size(); i++) {
            if (sid.equals(v.get(i).getSID())) {
                return v.get(i);

            }

        }
        return v.get(0);

    }
}
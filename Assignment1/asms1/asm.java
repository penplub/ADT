import java.io.*;
import java.util.*;

public class asm {
    public static void main(String[] args) throws FileNotFoundException {
        Vector<Student> myStudents = new Vector<Student>();
        File f = new File("C:/Users/TUF GAMING/Desktop/Assignment1/student_list_65.csv");
        Scanner myscan = new Scanner(f);
        StringTokenizer token;
        while (myscan.hasNextLine()) {
            String dataline = myscan.nextLine();
            token = new StringTokenizer(dataline, ",");
            int index = Integer.parseInt(token.nextToken());
            String SID = token.nextToken();
            String firstName = token.nextToken();
            String lastName = "";
            Student myStudent;
            if (token.hasMoreTokens()) {
                lastName = token.nextToken();
                myStudent = new Student(index, SID, firstName, lastName);

            } else {
                lastName = "";
                myStudent = new Student(index, SID, firstName);

            }
            myStudents.add(myStudent);

        }
        System.out.println("Total student is : " + myStudents.size());
        
        if (args[0].equals("n")) {
            sort(myStudents, "SID");

            
        }else if (args[0].equals("l")) {
            sort(myStudents, "firstName");
            
        }else if (args[0].equals("f")) {
            sort(myStudents, "lastName");
            
        }else{
            System.out.println("error");
        }

        
        
        show(myStudents);

        myscan.close();

    }

    private static void show(Vector<Student> v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i).toString());

        }
    }

    public static void sort(Vector<Student> v, final String f) {
        Collections.sort(v, new Comparator<Student>() {
          
            @Override
            public int compare(Student object1, Student object2) {
                if(f.equals("index")) {
                    return object1.getIndex().compareTo(object2.getIndex());
                } else if(f.equals("SID")) {
                    return object1.getSID().compareTo(object2.getSID());
                } if(f.equals("firstName")) {
                    return object1.getFname().compareTo(object2.getFname());
                } if(f.equals("lastName")) {
                    if(object1.getLname() == null || object2.getLname() == null)return 0;
                    return object1.getLname().compareTo(object2.getLname());
                }
                return 0;
            }           
        });
    }

}
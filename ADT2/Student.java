
/**
 * @author Karanthaphong Areerak 
 * @email Karanthaphong_aree@cmu.ac.th
 */
import javax.print.DocFlavor.STRING;

public class Student {
    private int index;
    private String SID;
    private String firstName;
    private String lastName;

    public Student() {
        this.index = -1;
        this.SID = "";
        this.firstName = "";
        this.lastName = "";
    }// default constructor

    public Student(int index, String SID, String firstName, String lastName) {
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;

    }// overload constructor

    public Student(int index, String SID, String firstName) {
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = "";

    }
    public String getSID(){
        return this.SID;
    }
    


    public String getFname() {
        return this.firstName;
    }// return firstname

    public String getLname() {
        return this.lastName;
    }

    public void setFname(String f) {
        this.firstName = f;
    }

    public void setLname(String l) {
        this.lastName = l;
    }
    public void setSID(String s){
        this.SID = s;
    }

    public String toString() {
        return "[" + this.index + "," + this.SID + "," + this.firstName + "," + this.lastName + "]";
    }

    public void add(Student myStudent) {
    }
}

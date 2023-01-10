# Author
Karanthaphong Areerak 652115001
# Assignment 1 
This Assignment is about to use student_list_65.csv which is cvs from excel file to sort about the data of each student in that and it can sort by number of student to make it it want to store the object student by using dynamic array to sort you don't use Scanner in put letter from keyboard but use argument to sort argument n to sort by number argument f to sort by name argument l to sort by lastname
# Requirement
If you want to run this program you want to download student_list65.csv to run and you want to set path fire that link asm.java to Student.java to your pathfile from your computer
# about the code 
First you see the program it have a Student.java that is an object to pull that data to main code it have to create a vector to store Student by using dynamic array  that is vector because it can make to write the code easier that don't have vector to store data and usetoken that to make it token about SID firstName lastName to convert into a token and use while .hasnextline to loop taht when it read the student file to the end and token SID firstname lastname and coding to make this program can read the middle name and print the number of all student in this section before show the end of result it want to  create a 2 method about to show the detail of all student and another method is about to sort the student at vector that use collection to sort and come back to main code and use argument to select to sort n to sort by number f to sort by firstname and l to sort by lastname and close the scanner then end of program
# This is my code of this program
import java.io.*;
import java.util.*;

public class asm {
    public static void main(String[] args) throws FileNotFoundException {
        Vector<Student> myStudents = new Vector<Student>(); // create vector of student
        File f = new File("C:/Users/TUF GAMING/Desktop/Assignment1/student_list_65.csv");// set file path and link
        Scanner myscan = new Scanner(f);
        StringTokenizer token;// token the student file
        while (myscan.hasNextLine()) {// if it has next it do that think
            String dataline = myscan.nextLine();
            token = new StringTokenizer(dataline, ",");
            int index = Integer.parseInt(token.nextToken());
            String SID = token.nextToken();
            String firstName = token.nextToken();
            String lastName = "";
            Student myStudent;
            if (token.hasMoreTokens()) {// for foreigner that have middle name
                lastName = token.nextToken();
                myStudent = new Student(index, SID, firstName, lastName);

            } else {
                lastName = "";
                myStudent = new Student(index, SID, firstName);

            }
            myStudents.add(myStudent);

        }
        System.out.println("Total student is : " + myStudents.size());// print number of student
        
        if (args[0].equals("n")) { // args of n,l,f to sort number name and lastname
            sort(myStudents, "SID");

            
        }else if (args[0].equals("f")) {
            sort(myStudents, "firstName");
            
        }else if (args[0].equals("l")) {
            sort(myStudents, "lastName");
            
        }else{
            System.out.println("error");
        }

        
        
        show(myStudents);

        myscan.close();

    }

    private static void show(Vector<Student> v) { // show all student
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i).toString());

        }
    }

    public static void sort(Vector<Student> v, final String f) {// to sort the file and select to sort by use f
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
# This is an object code for main code 
  
public class Student {
    public static Object getSID;
     Integer index;
     String SID;
     String firstName;
     String lastName;

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
    public Integer getIndex(){
        return this.index;
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
  
# Tutorial of this program 
If you want to use this program you have to download this program and mystudent_list_65.csv after that you have to set a path to your location where you keep these file and put this file to one folder  Warning you have to set up you augument before run this app because if you don't set set up it can't find your main method to set up you have to write on terminal "javac yourfilepath of your two file asm.java and Student.java" second write"java yourfilepath of your main code" and to run you have to set up select to sort by write this"java yourfile and letter" and of tutorial
# This is the output of this program 
PS E:\java2> javac .\asms1\asm.java .\asms1\Student.java
PS E:\java2> java .\asms1\asm.java n
Total student is : 33
[1,652115001,KARANTHAPHONG,AREERAK]        
[2,652115002,KRITTAYOT,KHUEANCHAN]
[3,652115003,KEERATI,THUEANPAN]
[4,652115004,CHRISTINA,CHUA]
[5,652115005,CHAMOR,LAHUNA]
[6,652115006,JAKKAPAN,LONGLAI]
[7,652115007,JIRAPHAT,LAMUN]
[8,652115008,CHATCHAI,CHATKAMPANG]
[9,652115009,CHANANCHIDA,WONGRACH]
[10,652115010,CHONTHICHA,MAITHAM]
[11,652115011,CHAWANAKORN,SANANNAM]        
[12,652115012,CHANYANUCH,PANYADEE]
[14,652115014,NATTAPAT,PUDHOM]
[15,652115015,NADTHAWAT,DACHAPHOBPHOKKANIT]
[16,652115016,NICHAKORN,PROMPONG]
[17,652115017,NICHAPAT,PADUNG]
[18,652115018,TANABADEE,KRAITONG]
[19,652115019,THANAPHAT,SANNGOEN]
[20,652115020,TATCHAPOL,WANGSUNTON]
[21,652115021,THANYASIRI,CHAINOI]
[22,652115022,TANRADA,WICHIANWANNAKOOL]
[23,652115023,THITIWUT,THITNUEA]
[24,652115025,NONLANEE,PANJATEERAWIT]
[25,652115026,POORIMPRATH,SOMKHAM]
[26,652115027,PHORNSAWAN,SRIJANPANG]
[27,652115028,PANIPUK,YOTTHAMEE]
[28,652115029,PHITCHAYAPHA,BUAPHA]
[29,652115030,PHIRIYA,PROMKAEWMA]
[30,652115507,HKUN LATT AUNG,]
[31,652115508,HONGYU,FU]
[32,652115510,NAW JOYFUL AWGYI,]
[33,652115511,KHANT ZAW HEIN,]
PS E:\java2> java .\asms1\asm.java f
Total student is : 33
[5,652115005,CHAMOR,LAHUNA]
[9,652115009,CHANANCHIDA,WONGRACH]
[12,652115012,CHANYANUCH,PANYADEE]
[8,652115008,CHATCHAI,CHATKAMPANG]
[11,652115011,CHAWANAKORN,SANANNAM]
[10,652115010,CHONTHICHA,MAITHAM]
[4,652115004,CHRISTINA,CHUA]
[30,652115507,HKUN LATT AUNG,]
[31,652115508,HONGYU,FU]
[6,652115006,JAKKAPAN,LONGLAI]
[7,652115007,JIRAPHAT,LAMUN]
[1,652115001,KARANTHAPHONG,AREERAK]
[33,652115511,KHANT ZAW HEIN,]
[2,652115002,KRITTAYOT,KHUEANCHAN]
[15,652115015,NADTHAWAT,DACHAPHOBPHOKKANIT]
[13,652115013,NARONGCHAI,RONGTHONG]
[14,652115014,NATTAPAT,PUDHOM]
[32,652115510,NAW JOYFUL AWGYI,]
[16,652115016,NICHAKORN,PROMPONG]
[17,652115017,NICHAPAT,PADUNG]
[24,652115025,NONLANEE,PANJATEERAWIT]
[27,652115028,PANIPUK,YOTTHAMEE]
[29,652115030,PHIRIYA,PROMKAEWMA]
[28,652115029,PHITCHAYAPHA,BUAPHA]
[26,652115027,PHORNSAWAN,SRIJANPANG]
[25,652115026,POORIMPRATH,SOMKHAM]
[18,652115018,TANABADEE,KRAITONG]
[22,652115022,TANRADA,WICHIANWANNAKOOL]
[20,652115020,TATCHAPOL,WANGSUNTON]
[19,652115019,THANAPHAT,SANNGOEN]
[21,652115021,THANYASIRI,CHAINOI]
[23,652115023,THITIWUT,THITNUEA]
PS E:\java2> java .\asms1\asm.java l
Total student is : 33
[30,652115507,HKUN LATT AUNG,]
[32,652115510,NAW JOYFUL AWGYI,]
[33,652115511,KHANT ZAW HEIN,]
[1,652115001,KARANTHAPHONG,AREERAK]
[28,652115029,PHITCHAYAPHA,BUAPHA]
[21,652115021,THANYASIRI,CHAINOI]
[8,652115008,CHATCHAI,CHATKAMPANG]
[4,652115004,CHRISTINA,CHUA]
[15,652115015,NADTHAWAT,DACHAPHOBPHOKKANIT]
[31,652115508,HONGYU,FU]
[2,652115002,KRITTAYOT,KHUEANCHAN]
[18,652115018,TANABADEE,KRAITONG]
[5,652115005,CHAMOR,LAHUNA]
[7,652115007,JIRAPHAT,LAMUN]
[6,652115006,JAKKAPAN,LONGLAI]
[10,652115010,CHONTHICHA,MAITHAM]
[17,652115017,NICHAPAT,PADUNG]
[24,652115025,NONLANEE,PANJATEERAWIT]
[12,652115012,CHANYANUCH,PANYADEE]
[29,652115030,PHIRIYA,PROMKAEWMA]
[16,652115016,NICHAKORN,PROMPONG]
[14,652115014,NATTAPAT,PUDHOM]
[13,652115013,NARONGCHAI,RONGTHONG]
[11,652115011,CHAWANAKORN,SANANNAM]
[19,652115019,THANAPHAT,SANNGOEN]
[25,652115026,POORIMPRATH,SOMKHAM]
[26,652115027,PHORNSAWAN,SRIJANPANG]
[23,652115023,THITIWUT,THITNUEA]
[3,652115003,KEERATI,THUEANPAN]
[20,652115020,TATCHAPOL,WANGSUNTON]
[22,652115022,TANRADA,WICHIANWANNAKOOL]
[9,652115009,CHANANCHIDA,WONGRACH]
[27,652115028,PANIPUK,YOTTHAMEE]
PS E:\java2> 
# End of my read me

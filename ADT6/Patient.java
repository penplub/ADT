public class Patient {
    private int SID;
    private String firstName;
    private String lastName;
    private String preVaccine;
    public Patient(int SID, String firstName,String lastName,String preVaccine){
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.preVaccine = preVaccine;
    }
    public int getSID(){
        return SID;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getpreVaccine(){
        return preVaccine;
    }
    public String toString(){
        return SID+" "+firstName+" "+lastName+" "+preVaccine;
    }

}

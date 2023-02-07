public class Task {
    private String taskID;
    private String taskDes;
    public Task(String taskID,String taskDes){
        this.taskID = taskID;
        this.taskDes = taskDes;
    }
    public String getDes(){
        return taskDes;

    }
    public String toString(){
        return taskID+" "+taskDes;
    }
    
}

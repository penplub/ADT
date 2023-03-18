//Karanthaphong Areerak 652115001
public class Node {//
    private String data;//Create data
    private Node next;//reate next
    public Node(String data){
        setData(data);//Create set data
        setNext(null);// set next = null
    }
    public void setData(String data){//Method set data
        this.data = data;// Set data = data read from main java

    }
    public void setNext(Node next){// set next to next read from Convert.java as same
        this.next = next;

    }
    public String getData(){//return data
        return data;

    }
    public Node getNext(){//return next
        return next;
    }
    public String toString(){////like to show out put like in toString
        if (data == null) {
            return " Node : Null";
            
        }else{
            return "Node :" +data;
        }
    }
    
}

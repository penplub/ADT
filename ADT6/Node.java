/**
 * Node
 */
public class Node {
private Patient data;
private Node next;
public Node(Patient data){
    setData(data);
    setNext(null);
}
public void setData(Patient data){
    this.data = data;
}
public void setNext(Node next){
    this.next = next;
}
public Patient getData(){
    return data;
}
public Node getNext(){
    return next;
}
public String toString(){
    if (data == null) {
        return "Node : null";
        
    }else{
        return "Node: "+data.toString();
    }
}
    
}
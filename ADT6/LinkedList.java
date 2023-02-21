import java.util.Random;

public class LinkedList {
    private Node head;
    int size;

    public LinkedList() {
        setHead(null);
        setSize(0);
    }

    private void setHead(Node head) {
        this.head = head;
    }

    private Node getHead() {
        return this.head;
    }
    private void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }

    public void add(Patient sr) {
        if (getHead() == null) {
            Node temp = new Node(sr);
            temp.setNext(getHead());
            setHead(temp);

        } else {
            add(getHead(), sr);
        }
        setSize(getSize() +1);

    }

    private void add(Node cur, Patient sr) {
        if (cur.getNext() == null || cur.getNext().getData().getSID() > sr.getSID()) {
            Node temp = new Node(sr);
            temp.setNext(cur.getNext());
            cur.setNext(temp);
        } else {
            add(cur.getNext(), sr);
        }

    }

    public void traverse() {
        traverse(getHead());
    }

    private void traverse(Node cur) {
        if (cur != null) {
            System.out.println(cur);
            traverse(cur.getNext());

        }
    }

    public void traverse(String s) {
        System.out.println(s);
        traverse();
    }

    public void deleteAll(int targSID) {
        setHead(null);
        setSize(0);


    }

  public void delete(int targSID){
    if (getHead()!=null) {if (getHead().getData().getSID() == targSID) {
        setHead(getHead().getNext());
        setSize(getSize()-1);
        
    }else{
        delete(getHead(),targSID);
        setSize(getSize()-1);
    }
        
    }
  }
  private void delete(Node cur,int targSID){
    if (cur.getNext() != null) {
        if (cur.getNext().getData().getSID() ==  targSID) {
            cur.setNext(cur.getNext().getNext());
            
        }else{
            delete(cur.getNext(),targSID);
        }
        
    }
  }
  public void deleteRandom(){
    if (getHead() == null) {
        System.out.println("List is empty.");
        return;
    }
    Random rand = new Random();
    int index1 = rand.nextInt(getSize());
    int index2 = rand.nextInt(getSize());

    while (index2 == index1) {
        index2 = rand.nextInt(getSize());
    }

    delete(index1);
    delete(index2);

  }
    public static void main(String[] args) {
        LinkedList ell = new LinkedList();
        ell.traverse("Empty list traversal");
        ell.add(new Patient(111, "Deep", "Dark", "Yes : sinovac"));
        ell.add(new Patient(222, "Elderson", "Short", "No"));
        ell.add(new Patient(333, "Mib", "Smith", "Yes : Pfizer"));
        ell.add(new Patient(444, "To", "Ricardo", "No"));
        ell.add(new Patient(555, "Lam", "Gare", "No"));
        ell.add(new Patient(666, "Kazuya", "Danny", "Yes : sinovac"));
        ell.add(new Patient(777, "Tomas", "Thetrain", "Yes : sinovac"));
        ell.add(new Patient(888, "Peeth", "Leon", "No"));
        ell.add(new Patient(999, "Ice", "Saru", "Yes : Moderna"));
        ell.add(new Patient(1000, "Billy", "Herington", "No"));
        System.out.println("Size = "+ell.getSize());
        ell.traverse();
      ell.delete(888);
      ell.delete(333);
        System.out.println("My linklist after delete is :");
        ell.traverse();
        System.out.println();
        ell.deleteAll(ell.size);
        System.out.println("After delete all My linklist is :");
        ell.traverse("Is Empty");
    }

}

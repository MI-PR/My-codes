class Link{
    int data;
    Link next,prev;

    public Link(int data){
        this.data = data;
        prev = next = null;
    }
}

class DLink{
    Link first,last;


    public void insertfirst(int data){
        if(first != null){
            Link nl = new Link(data);
            nl.next = first;
            first.prev = nl;
            first = nl;
        }
    }

    public void insertlast(int data){
        if(first != null){
            Link nl = new Link(data);
            last.next = nl;
            nl.prev = last;
            last = nl;
        }
    }
    
    public void insertafterkey(int data,int key){
        Link nl = new Link(data);

        Link curr
    }
}

public class Imp {
    public static void main(String[] args) {
        
    }
    
}

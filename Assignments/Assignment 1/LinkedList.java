public class LinkedList {
    public CoordinateNode head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int x, int y) {
        head = new CoordinateNode(x, y);
    }

    public void append(int x, int y) {
        if(head != null)
        {
            CoordinateNode newNode = new CoordinateNode(x,y);
            CoordinateNode current = head;
            appendHelper(current,newNode);
        }
        else{
            head = new CoordinateNode(x, y);
        }
    }

    public void appendList(LinkedList other) {
        if(other != null){
            if(head == null)
            {
                
                head = other.head;
            }
            else{
                appendListHelper(other, head);
            }
        }
    }

    public boolean contains(int x, int y) {
        return false;
    }

    @Override
    public String toString() {
        if( head == null){
            return "Empty List";
        }
        return toStringHelper(head, "");
    }

    public int length() {
        return 0;
    }

    public LinkedList reversed() {
        return null;
    }





    //======Helper Functions=============Helper Functions=============Helper Functions=============Helper Functions=============Helper Functions=============Helper Functions=======
    private void appendHelper(CoordinateNode current, CoordinateNode newNode){
        if(current.next == null){
            current.next = newNode;
        }
        else
            appendHelper(current.next, newNode);
    }
    
    private void appendListHelper(LinkedList list, CoordinateNode curr){
        if(curr.next == null){
            curr.next = list.head;
        }
        else
        appendListHelper(list , curr.next);
    }

    private String toStringHelper(CoordinateNode node, String out) {
        if(node.next == null){
            return out+= node.toString();
        }
        else{
            out+= node.toString() + " -> ";
            return toStringHelper(node.next, out);
        }
        
        
    }
}

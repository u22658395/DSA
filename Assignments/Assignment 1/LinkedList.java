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
        return containsHelper(head, x, y);
    }

    @Override
    public String toString() {
        if( head == null){
            return "Empty List";
        }
        return toStringHelper(head, "");
    }

    public int length() {
        return count(head);
    }

    public LinkedList reversed() {
        if(head == null){
            return new LinkedList();
        }
        
        LinkedList copy = new LinkedList();
        reverseHelper(copy, head);
        return copy;
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

    private boolean containsHelper(CoordinateNode curr, int x, int y) {  
        if(curr == null ){
            return false;
        }
        else{
            if(curr.x == x && curr.y == y )
                return true;
        }
            
        return containsHelper(curr.next, x,y);
    }

    private int count(CoordinateNode curr){
        if(curr == null){
            return 0;
        }
        return 1 + count(curr.next);
    }

    private void reverseHelper(LinkedList copy, CoordinateNode curr){
        if(curr != null){
            reverseHelper(copy, curr.next);
            copy.append(curr.x, curr.y);
        }
    }
}

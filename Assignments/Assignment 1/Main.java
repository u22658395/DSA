public class Main {
    // Output is in output.txt
    public static void main(String[] args) {
        // Maze m = new Maze("input.txt");
        // System.out.println(m.solve(3, 3, 1, 0));
        // System.out.println(m.validStarts(0, 0));


        testAppend();
    }


    private static void testAppend(){
        System.out.println("=========Test Append functions============Test Append functions============Test Append functions============Test Append functions============");

        LinkedList ll = new LinkedList();
        System.out.println(ll);
        ll.append(0, 1);
        ll.append(3, 1);
        System.out.println(ll +"\n");
        

        ll = new LinkedList(1,1);
        System.out.println(ll);
        ll.append(5, 2);
        ll.append(3, 1);
        System.out.println(ll +"\n");
        
        
        System.out.println("=========Test appendList============Test appendList============Test appendList============Test appendList============");

        LinkedList l2 = new LinkedList(10,10);
        l2.append(100, 22);
        l2.append(123, 90);
        System.out.println("Linked List to append: " + l2 +"\n");
        
        ll = new LinkedList();
        ll.append(5, 2);
        ll.append(3, 1);
        System.out.println("Linked List to append to: " + ll);
        ll.appendList(l2);
        System.out.println(ll + "\n");
        
        ll = new LinkedList(0,11);
        ll.append(5, 2);
        ll.append(3, 1);
        System.out.println("Linked List to append to: " + ll);
        ll.appendList(l2);
        System.out.println(ll + "\n");
    }
}
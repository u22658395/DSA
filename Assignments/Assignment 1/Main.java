public class Main {
    // Output is in output.txt
    public static void main(String[] args) {
        // Maze m = new Maze("input.txt");
        // System.out.println(m.solve(3, 3, 1, 0));
        // System.out.println(m.validStarts(0, 0));


        testAppend();
        testContains();
        testLength();
        testReverse();
        testMaze();
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
        
        System.out.println("Linked List to append: " + null);
        ll.appendList(null);
        System.out.println(ll + "\n");
    }

    private static void testContains(){
        System.out.println("=========Test contains============Test contains============Test contains============Test contains============");

        LinkedList ll = new LinkedList();
        System.out.println(ll);
        System.out.println("Contains 0,0: "+ll.contains(0, 0) +"\n");
        
        ll = new LinkedList(0,0);
        System.out.println(ll);
        System.out.println("Contains 0,0: "+ll.contains(0, 0));
        System.out.println("Contains 0,1: "+ll.contains(0, 1) +"\n");
        
        ll = new LinkedList(0,0);
        ll.append(3, 1);
        System.out.println(ll);
        System.out.println("Contains 0,0: "+ll.contains(0, 0));
        System.out.println("Contains 3,1: "+ll.contains(3, 1));
        System.out.println("Contains 0,1: "+ll.contains(0, 1) +"\n");
    }

    private static void testLength(){
        System.out.println("=========Test length============Test length============Test length============Test length============");

        LinkedList ll = new LinkedList();
        System.out.println(ll);
        System.out.println("Length: "+ ll.length() +"\n");
        
        ll.append(65, 0);
        System.out.println(ll);
        System.out.println("Length: "+ ll.length() +"\n");

        
        ll = new LinkedList(1,1);
        System.out.println(ll);
        System.out.println("Length: "+ ll.length() +"\n");

        ll = new LinkedList(1,1);
        ll.append(145, 65);
        System.out.println(ll);
        System.out.println("Length: "+ ll.length() +"\n");
        
        ll.append(300, 65);
        System.out.println(ll);
        System.out.println("Length: "+ ll.length() +"\n");

    }

    private static void testReverse(){
        System.out.println("=========Test Reverse============Test Reverse============Test Reverse============Test Reverse============");

        LinkedList ll = new LinkedList();
        System.out.println("Original List: \n" + ll);
        System.out.println(ll.reversed() +"\n");

        ll = new LinkedList(0,0);
        System.out.println("Original List: \n" + ll);
        System.out.println(ll.reversed() +"\n");

        ll.append(11, 54);
        ll.append(32, 47);
        ll.append(9, 100);
        System.out.println("Original List: \n" + ll);
        System.out.println(ll.reversed() +"\n");


    }

    private static void testMaze(){
        System.out.println("=========Test Maze============Test Maze============Test Maze============Test Maze============");

        Maze m = new Maze("input.txt");
        System.out.println(m + "\n");

        Maze k = new Maze(m);
        System.out.println(k + "\n");
    }
}
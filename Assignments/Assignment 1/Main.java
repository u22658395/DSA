public class Main {
    // Output is in output.txt
    public static void main(String[] args) {
        Maze n = new Maze("input.txt");
        testAppend();
        testContains();
        testLength();
        testReverse();
        testMaze();
        System.out.println();
        
        Maze m = new Maze("maze2_0.txt");
        System.out.println("====MAP=====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP==\n");
        System.out.println(m+ "\n");
        System.out.println("====MAP=====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP====MAP==\n");
        testValidSolution2_0(m);
        testSolve(m);
        testStarts(m);
        
        
        
        
    }

//test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==test 2.0==

    private static void testValidSolution2_0(Maze m){
        System.out.println("====test validSolution 2.0=====test validSolution 2.0=====test validSolution 2.0=====test validSolution 2.0=====");
        System.out.println("valid Path:\n"+ validPath());
        System.out.println("validity: " + m.validSolution(0, 0, 11, 4, validPath()) +"\n");
        
        System.out.println("Empty Path:\n"+ emptyPath());
        System.out.println("validity: " + m.validSolution(0, 0, 11, 4, emptyPath()) +"\n");

        System.out.println("Wall at start of Path:\n"+ startWallPath());
        System.out.println("validity: " + m.validSolution(0, 2, 11, 4, startWallPath()) +"\n");

        System.out.println("Wall at end of Path:\n"+ endWallPath());
        System.out.println("validity: " + m.validSolution(0, 0, 12, 4, endWallPath()) +"\n");

        System.out.println("diagonal Path:\n"+ diagonalPath());
        System.out.println("validity: " + m.validSolution(0, 0, 12, 4, diagonalPath()) +"\n");

        System.out.println("More than one step X Path:\n"+ xStepPath());
        System.out.println("validity: " + m.validSolution(0, 0, 12, 4, xStepPath()) +"\n");

        System.out.println("More than one step Y Path:\n"+ yStepPath());
        System.out.println("validity: " + m.validSolution(0, 0, 12, 4, yStepPath()) +"\n");

    }
    

    private static LinkedList validPath(){
        
        LinkedList ll = new LinkedList();
        ll.append(0, 0);
        ll.append(0, 1);
        ll.append(1, 1);
        ll.append(2, 1);
        ll.append(3, 1);
        ll.append(3, 2);
        ll.append(3,3);
        ll.append(4,3);
        ll.append(5,3);
        ll.append(6,3);
        ll.append(7,3);
        ll.append(7,4);
        ll.append(7,5);
        ll.append(8,5);
        ll.append(9,5);
        ll.append(10,5);
        ll.append(10,4);
        ll.append(11,4);
        return ll;
    }

    private static LinkedList emptyPath(){
        
        LinkedList ll = new LinkedList();
        return ll;
    }
    
    private static LinkedList endWallPath(){
        
        LinkedList ll = new LinkedList();
        ll.append(0, 0);
        ll.append(0, 1);
        ll.append(1, 1);
        ll.append(2, 1);
        ll.append(3, 1);
        ll.append(3, 2);
        ll.append(3,3);
        ll.append(4,3);
        ll.append(5,3);
        ll.append(6,3);
        ll.append(7,3);
        ll.append(7,4);
        ll.append(7,5);
        ll.append(8,5);
        ll.append(9,5);
        ll.append(10,5);
        ll.append(10,4);
        ll.append(11,4);
        ll.append(12,4);
        return ll;
    }
    
    private static LinkedList startWallPath(){
        
        LinkedList ll = new LinkedList();
        ll.append(0, 2);
        ll.append(0, 1);
        ll.append(1, 1);
        ll.append(2, 1);
        ll.append(3, 1);
        ll.append(3, 2);
        ll.append(3,3);
        ll.append(4,3);
        ll.append(5,3);
        ll.append(6,3);
        ll.append(7,3);
        ll.append(7,4);
        ll.append(7,5);
        ll.append(8,5);
        ll.append(9,5);
        ll.append(10,5);
        ll.append(10,4);
        ll.append(11,4);
        ll.append(12,4);
        return ll;
        
    }

    private static LinkedList diagonalPath(){
        
        LinkedList ll = new LinkedList();
        ll.append(0, 0);
        ll.append(0, 1);
        ll.append(1, 1);
        ll.append(2, 1);
        ll.append(3, 1);
        ll.append(3, 2);
        ll.append(3,3);
        ll.append(4,3);
        ll.append(5,3);
        ll.append(6,3);
        ll.append(7,3);
        ll.append(7,4);
        ll.append(7,5);
        ll.append(8,5);
        ll.append(9,5);
        ll.append(10,5);
        ll.append(11,4);
        return ll;
    }



    private static LinkedList xStepPath(){
        
        LinkedList ll = new LinkedList();
        ll.append(0, 0);
        ll.append(0, 1);
        ll.append(2, 1);
        ll.append(3, 1);
        ll.append(3, 2);
        ll.append(3,3);
        ll.append(4,3);
        ll.append(5,3);
        ll.append(6,3);
        ll.append(7,3);
        ll.append(7,4);
        ll.append(7,5);
        ll.append(8,5);
        ll.append(9,5);
        ll.append(10,5);
        ll.append(10,4);
        ll.append(11,4);
        return ll;
    }

    private static LinkedList yStepPath(){
        
        LinkedList ll = new LinkedList();
        ll.append(0, 0);
        ll.append(0, 1);
        ll.append(1, 1);
        ll.append(2, 1);
        ll.append(3, 1);
        ll.append(3,3);
        ll.append(4,3);
        ll.append(5,3);
        ll.append(6,3);
        ll.append(7,3);
        ll.append(7,4);
        ll.append(7,5);
        ll.append(8,5);
        ll.append(9,5);
        ll.append(10,5);
        ll.append(10,4);
        ll.append(11,4);
        return ll;
    }

    //==test Input.txt====test Input.txt====test Input.txt====test Input.txt====test Input.txt====

    
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
        
        
        System.out.println("Append to empty list: " + l2);
        ll = new LinkedList();
        ll.appendList(l2);
        System.out.println(ll);
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
        
        Maze o = new Maze("wrongFile.txt");
        System.out.println(o + "\n");
        
        Maze m = new Maze("input.txt");
        System.out.println(m + "\n");
        
        Maze k = new Maze(m);
        System.out.println(k + "\n");
    }
    
    private static void testSolve(Maze m) {
        System.out.println(m.solve(1, 1, 4, 0) +"\n");
        System.out.println(m.solve(4, 0, 3, 3) +"\n");
        System.out.println(m.solve(1, 1, 3, 3)+ "\n");
    }

    private static void testStarts(Maze m){

        System.out.println("====Test validStarts========Test validStarts========Test validStarts========Test validStarts====");

        System.out.println("Destination is a wall:");
        System.out.println(m.validStarts(4, 4)+"\n");
        
        System.out.println("Destination is out of x bounds:");
        System.out.println(m.validStarts(12, 4)+"\n");
        
        System.out.println("Destination is out of y bounds:");
        System.out.println(m.validStarts(3, 7)+"\n");
       
        System.out.println("Destination is valid:");
        System.out.println(m.validStarts(11, 4)+"\n");
    }

    //====testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=========testing 2.0=====
}


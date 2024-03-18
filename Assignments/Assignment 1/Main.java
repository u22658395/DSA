public class Main {
    // Output is in output.txt
    public static void main(String[] args) {
        Maze m = new Maze("mazeWithWalls.txt");
        // System.out.println(m.solve(3, 3, 1, 0));
        // System.out.println(m.validStarts(0, 0));
        
        
        testAppend();
        testContains();
        testLength();
        testReverse();
        testMaze();
        testValidSolution();
        testSolve(m);
        testStarts(m);
        // System.out.println(m.mazeString(0));n
        
        
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
    
    
    private static void testValidSolution(){
        System.out.println("=========Test ValidSolution============Test ValidSolution============Test ValidSolution============Test ValidSolution============");
        
        Maze m = new Maze("input.txt");
        
        //valid path
        System.out.println("valid path");
        LinkedList l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //wrong starting point
        System.out.println("wrong starting point");
        l2 = new LinkedList(2,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //wrong destination point
        System.out.println("wrong destination point");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(2,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //duplicate
        System.out.println("duplicate");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(2,2);
        l2.append(3,1);
        l2.append(3,2);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //more than 2 steps in X direction
        System.out.println("more than 2 steps in X direction");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        // l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //more than 2 steps in Y direction
        System.out.println("more than 2 steps in Y direction");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        // l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //diagonal movement
        System.out.println("diagonal movement right up");
        l2 = new LinkedList(0,4);
        // l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
        //diagonal movement
        System.out.println("diagonal movement left down ");
        l2 = l2.reversed();
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(4, 0, 1, 3, l2)+"\n");
        
        
        //diagonal movement
        System.out.println("diagonal movement right down");
        l2 = new LinkedList(0,0);
        l2.append(1,1);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 0, 1, 1, l2)+"\n");
        
        System.out.println("diagonal movement left up");
        l2 = new LinkedList(4,4);
        l2.append(3,3);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(4, 4, 3, 3, l2)+"\n");
        
        // x-index outside map
        System.out.println("out of bounds x");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        l2.append(5,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 5, 0, l2)+"\n");

        //y-index outside map
        System.out.println("out of bounds y");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        l2.append(4,-1);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, -1, l2)+"\n");

        //goal coordinate are a proper subset of part
        System.out.println("goal coordinates are a proper subset of part");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 3, 1, l2)+"\n");
        
        //wall
        m = new Maze("mazeWithWalls.txt");
        System.out.println("wall");
        l2 = new LinkedList(0,4);
        l2.append(1,4);
        l2.append(1,3);
        l2.append(1,2);
        l2.append(2,2);
        l2.append(3,2);
        l2.append(3,1);
        l2.append(3,0);
        l2.append(4,0);
        System.out.println("Path: "+ l2);
        System.out.println("Validity: "+ m.validSolution(0, 4, 4, 0, l2)+"\n");
        
    }

    private static void testSolve(Maze m) {
        System.out.println(m.solve(1, 1, 4, 0) +"\n");
        System.out.println(m.solve(4, 0, 3, 3) +"\n");
        System.out.println(m.solve(1, 1, 3, 3)+ "\n");
    }

    private static void testStarts(Maze m){

        System.out.println("====Test validStarts========Test validStarts========Test validStarts========Test validStarts====");

        System.out.println("Destination is a wall:");
        System.out.println(m.validStarts(4, 0)+"\n");
        
        System.out.println("Destination is out of x bounds:");
        System.out.println(m.validStarts(5, 0)+"\n");
        
        System.out.println("Destination is out of y bounds:");
        System.out.println(m.validStarts(2, 5)+"\n");
        
        System.out.println("Destination is valid:");
        System.out.println(m.validStarts(2, 4)+"\n");
    }
}


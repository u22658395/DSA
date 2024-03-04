
public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        System.out.println("Initial tree: \n"+ tree +"\n");
        testInsert(tree);
        testDelete(tree);
        testContains(tree);
        testPrintSearch(tree);

    }

    private static void testInsert(BST<Integer> tree){

        System.out.println("====Testing Insert=========Testing Insert=========Testing Insert=========Testing Insert=========Testing Insert=========Testing Insert=====");
        tree.insert(50);
        System.out.println("Insert 50:\n" + tree);
        tree.insert(50);
        System.out.println("Insert 50:\n" + tree+"\n");
        
        
        //Inserting a smaller number
        tree.insert(33);
        System.out.println("Insert 33:\n" + tree);
       
        //Inserting a bigger number
        tree.insert(77);
        System.out.println("Insert 77:\n" + tree);

        //Inserting a bigger number
        tree.insert(60);
        System.out.println("Insert 60:\n" + tree);

        //Inserting a bigger number
        tree.insert(40);
        System.out.println("Insert 40:\n" + tree);

        //Inserting a bigger number
        tree.insert(90);
        System.out.println("Insert 90:\n" + tree);

        //Inserting a bigger number
        tree.insert(29);
        System.out.println("Insert 29:\n" + tree);

        tree.insert(55);
        System.out.println("Insert 55:\n" + tree);

        tree.insert(59);
        System.out.println("Insert 59:\n" + tree);

        tree.insert(51);
        System.out.println("Insert 51:\n" + tree);

        tree.insert(67);
        System.out.println("Insert 67:\n" + tree);

        tree.insert(63);
        System.out.println("Insert 63:\n" + tree);

        tree.insert(71);
        System.out.println("Insert 71:\n" + tree);

        tree.insert(85);
        System.out.println("Insert 85:\n" + tree);

        tree.insert(81);
        System.out.println("Insert 81:\n" + tree);

        tree.insert(89);
        System.out.println("Insert 89:\n" + tree);

        tree.insert(110);
        System.out.println("Insert 110:\n" + tree);

        tree.insert(106);
        System.out.println("Insert 106:\n" + tree);

        tree.insert(129);
        System.out.println("Insert 129:\n" + tree);

        tree.insert(115);
        System.out.println("Insert 115:\n" + tree);

        tree.insert(103);
        System.out.println("Insert 103:\n" + tree);

        tree.insert(99);
        System.out.println("Insert 99:\n" + tree);
        
        tree.insert(100);
        System.out.println("Insert 100:\n" + tree);

    }

    public static void testDelete(BST<Integer> tree){
        System.out.println("====Testing Delete=========Testing Delete=========Testing Delete=========Testing Delete=========Testing Delete=========Testing Delete=====");

        System.out.println("Delete 33:");
        tree.delete(33);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 29:");
        tree.delete(29);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 70:");
        tree.delete(70);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 77:");
        tree.delete(77);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 77:");
        tree.delete(77);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 90:");
        tree.delete(90);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 50:");
        tree.delete(50);
        System.out.println(tree+"\n");
        
        System.out.println("Delete 1:");
        tree.delete(1);
        System.out.println(tree+"\n");
    }

    private static void testContains(BST<Integer> tree){
        System.out.println("====Testing Contains=========Testing Contains=========Testing Contains=========Testing Contains=========Testing Contains=========Testing Contains=====");
        System.out.println("Tree"+"\n");
        System.out.println(tree+"\n");

        System.out.println("Contains 1000:"); //value never been in the tree
        System.out.println(tree.contains(1000)+"\n");
        
        System.out.println("Contains 33:"); //value deleted from the tree
        System.out.println(tree.contains(33)+"\n");
        
        System.out.println("Contains 51:"); //the root
        System.out.println(tree.contains(51)+"\n");
        
        System.out.println("Contains 100:");//leaf node
        System.out.println(tree.contains(100)+"\n");
        
        System.out.println("Contains 81:"); //non-terminal node
        System.out.println(tree.contains(81)+"\n");
        
    }

    private static void testPrintSearch(BST<Integer> tree){
        System.out.println("====Testing PrintSearch=========Testing PrintSearch=========Testing PrintSearch=========Testing PrintSearch=========Testing PrintSearch=========Testing PrintSearch=====");

        System.out.println("Search Path of 1000:"); //value never been in the tree
        System.out.println(tree.printSearchPath(1000)+"\n");
        
        System.out.println("Search Path of 33:"); //value deleted from the tree
        System.out.println(tree.printSearchPath(33)+"\n");
        
        System.out.println("Search Path of 51:"); //the root
        System.out.println(tree.printSearchPath(51)+"\n");
        
        System.out.println("Search Path of 100:");//leaf node
        System.out.println(tree.printSearchPath(100)+"\n");
        
        System.out.println("Search Path of 81:"); //non-terminal node
        System.out.println(tree.printSearchPath(81)+"\n");

    }
}


public class Main {
    public static void main(String[] args) {
        testInsert_Delete();
        
    }

    private static void testInsert_Delete(){


        BST<Integer> tree = new BST<Integer>();
        System.out.println("Initial tree: \n"+ tree);

        //Inserting the same number
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

        // tree.insert(10);
        // System.out.println("Insert 100:\n" + tree);
        // tree.insert(100);
        // System.out.println("Insert 100:\n" + tree+"\n");


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
}

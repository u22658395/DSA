
public class Main {
    public static void main(String[] args) {
        testInsert();
        
    }

    private static void testInsert(){


        BST<Integer> tree = new BST<Integer>();
        System.out.println("Initial tree: \n"+ tree);

        //Inserting the same number
        tree.insert(50);
        System.out.println("Insert 50:\n" + tree);
        tree.insert(50);
        System.out.println("Insert 50:\n" + tree);
        
        
        //Inserting a smaller number
        tree.insert(33);
        System.out.println("Insert 33:\n" + tree);
        tree.insert(33);
        System.out.println("Insert 33:\n" + tree);
       
        //Inserting a bigger number
        tree.insert(77);
        System.out.println("Insert 77:\n" + tree);
        tree.insert(77);
        System.out.println("Insert 77:\n" + tree);

        //Inserting a bigger number
        tree.insert(60);
        System.out.println("Insert 77:\n" + tree);
        tree.insert(60);
        System.out.println("Insert 77:\n" + tree);

        //Inserting a bigger number
        tree.insert(40);
        System.out.println("Insert 77:\n" + tree);
        tree.insert(40);
        System.out.println("Insert 77:\n" + tree);

        //Inserting a bigger number
        tree.insert(90);
        System.out.println("Insert 77:\n" + tree);
        tree.insert(90);
        System.out.println("Insert 77:\n" + tree);

        //Inserting a bigger number
        tree.insert(29);
        System.out.println("Insert 77:\n" + tree);
        tree.insert(29);
        System.out.println("Insert 77:\n" + tree);

    }
}

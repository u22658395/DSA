
public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        System.out.println("Initial tree: \n"+ tree +"\n");
        testInsert(tree);
        testDelete(tree);
        testContains(tree);
        testPrintSearch(tree);
        testNumLeaves(tree);
        testMinMax(tree);
        testGetNode(tree);
        testBalance(tree);
        testHeight(tree);
        testExtractSuper(tree);
        CheckCount();

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
        
        System.out.println("Delete 40:");
        tree.delete(40);
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

    private static void testNumLeaves(BST<Integer> tree){
        System.out.println("====Testing NumLeaves=========Testing NumLeaves=========Testing NumLeaves=========Testing NumLeaves=========Testing NumLeaves=========Testing NumLeaves=====");
        System.out.println("Num leaves: "+tree.getNumLeaves() + "\n");

        BST<Integer> emptTree = new BST<Integer>();
        System.out.println(emptTree);
        System.out.println("Num leaves: "+emptTree.getNumLeaves()+ "\n");

    }

    private static void testMinMax(BST<Integer> tree) {
        System.out.println("====Testing findMax and findMin=========Testing findMax and findMin=========");
        System.out.println("Min: "+tree.findMin());
        System.out.println("Max: "+tree.findMax());
    }

    private static void testGetNode(BST<Integer> tree){
        System.out.println("====Testing getNode=========Testing getNode=========Testing getNode=========");
        System.out.println("Tree"+"\n");
        System.out.println(tree+"\n");

        System.out.println("get Node 1000:"); //value never been in the tree
        System.out.println(tree.getNode(1000)+"\n");
        
        System.out.println("get Node 33:"); //value deleted from the tree
        System.out.println(tree.getNode(33)+"\n");
        
        System.out.println("get Node 51:"); //the root
        System.out.println(tree.getNode(51)+"\n");
        
        System.out.println("get Node 100:");//leaf node
        System.out.println(tree.getNode(100)+"\n");
        
        System.out.println("get Node 81:"); //non-terminal node
        System.out.println(tree.getNode(81)+"\n");
    }

    private static void testBalance(BST<Integer> tree){
        System.out.println("====Testing superficialBalance=========Testing superficialBalance=========Testing superficialBalance=========");

        BST<Integer> t = new BST<Integer>();
        System.out.println("Tree:\n"+t);
        System.out.println(t.isSuperficiallyBalanced()+"\n");
        
        t.insert(1);
        System.out.println("Tree:\n"+t);
        System.out.println(t.isSuperficiallyBalanced()+"\n");

        System.out.println("Tree:\n"+tree);
        System.out.println(tree.isSuperficiallyBalanced()+"\n");
        
        tree.delete(51);
        tree.delete(100);
        tree.delete(103);
        tree.delete(115);
        tree.insert(50);
        tree.insert(84);
        
        System.out.println("Tree:\n"+tree);
        System.out.println(tree.isSuperficiallyBalanced()+"\n");
        
        tree.delete(50);
        tree.delete(129);
        System.out.println("Tree:\n"+tree);
        System.out.println(tree.isSuperficiallyBalanced()+"\n");
    }

    private static void testHeight(BST<Integer> tree){
        System.out.println("====Testing getHeight=========Testing getHeight=========Testing getHeight=========");

        BST<Integer> t = new BST<Integer>();
        System.out.println("Tree:\n"+t);
        System.out.println(t.getHeight()+"\n");    
        
        t.insert(8);
        System.out.println("Tree:\n"+t);
        System.out.println(t.getHeight()+"\n");    
        
        System.out.println("Tree:\n"+tree);
        System.out.println(tree.getHeight()+"\n");    
    }

    private static void testExtractSuper(BST<Integer> tree){
        System.out.println("====Testing ExtractSuperficialTree=========Testing ExtractSuperficialTree=========Testing ExtractSuperficialTree=========");

        System.out.println("Tree:\n"+tree+"\n");
        System.out.println("Superficial Tree:\n"+tree.extractBiggestSuperficiallyBalancedSubTree()+"\n");

        tree.delete(129);
        System.out.println("Tree:\n"+tree+"\n");
        System.out.println("Superficial Tree:\n"+tree.extractBiggestSuperficiallyBalancedSubTree()+"\n");

        tree.delete(50);
        tree.delete(59);
        tree.delete(63);
        tree.delete(71);
        tree.delete(106);
        tree.delete(84);
        tree.insert(83);
        tree.insert(82);
        tree.insert(84);
        tree.insert(87);
        tree.insert(90);
        tree.insert(88);
        tree.insert(92);
        System.out.println("Tree:\n"+tree+"\n");
        System.out.println("Superficial Tree:\n"+tree.extractBiggestSuperficiallyBalancedSubTree()+"\n");

    }

    private static void CheckCount(){
        System.out.println("====checking count=========checking count=========checking count=========");
        BST<Integer> tree = new BST<Integer>();
        tree.insert(100);
        System.out.println(tree);
        System.out.println(tree.countNodes(tree.root) +"\n");
        
        
        tree.insert(54);
        tree.insert(32);
        tree.insert(76);
        tree.insert(15);
        tree.insert(80);
        System.out.println(tree);
        System.out.println(tree.countNodes(tree.root) +"\n");
        System.out.println("Balanced: "+ tree.isSuperficiallyBalanced()+"\n");
        
        tree.delete(100);
        System.out.println(tree);
        System.out.println(tree.countNodes(tree.root) +"\n");
        System.out.println("Balanced: "+ tree.isSuperficiallyBalanced()+"\n");
        
        
        

    }
}

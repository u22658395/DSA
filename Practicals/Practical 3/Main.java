public class Main {
    public static void main(String[] args) {
        SplayTree t = new SplayTree();
        System.out.println("Initial Tree: \n"+ t+"\n");

        testAccess(t);
        testRemove(t);
        testSortStd(t);
        testSortMark(t);
    }

    
    private static void testAccess(SplayTree t){
        System.out.println("========Testing access========Testing access========Testing access========Testing access========");
        
        System.out.println("Access: 2295");
        t.access(2295,6);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        System.out.println("Access: 1000");
        t.access(1000,3);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        System.out.println("Access: 3000");
        t.access(3000,0);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        
        System.out.println("Access: 3700");
        t.access(3700,null);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 100");
        t.access(100,1);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 110");
        t.access(110, 67);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 200");
        t.access(200,100);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 50");
        t.access(50,55);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 300");
        t.access(300, 90);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 210");
        t.access(210, 90);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 300,80");
        t.access(300,80);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 173");
        t.access(173, 90);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 60");
        t.access(60, 90);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
    }

    private static void testRemove(SplayTree t){
        System.out.println("Remove 300:");
        t.remove(300);
        System.out.println("Root's parent after removing 300: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        System.out.println("Remove 60:");
        t.remove(60);
        System.out.println("Root's parent after removing 60: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        System.out.println("Remove 50:");
        t.remove(50);
        System.out.println("Root's parent after removing 60: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
    }

    private static void testSortStd(SplayTree t){
        System.out.println("======Testing sortStd========Testing sortStd========Testing sortStd========Testing sortStd========");

        System.out.println(t.sortByStudentNumber());

        t =  new SplayTree();
        System.out.println(t);
        System.out.println(t.sortByStudentNumber());
    }
    
    private static void testSortMark(SplayTree t){
        System.out.println("======Testing Mark========Testing Mark========Testing Mark========Testing Mark========Testing Mark========");

        System.out.println(t.sortByStudentNumber());

        System.out.println(t.sortByMark());
    }
}
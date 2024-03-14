public class Main {
    public static void main(String[] args) {
        testAccess();
    }

    
    private static void testAccess(){
        System.out.println("Testing access========Testing access========Testing access========Testing access========Testing access========Testing access========");
        
        SplayTree t = new SplayTree();
        System.out.println("Tree: \n"+ t+"\n");
        

        System.out.println("Access: 2295");
        t.access(2295);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        
        
        System.out.println("Access: 1000");
        t.access(1000);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        System.out.println("Access: 3000");
        t.access(3000);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        
        
        System.out.println("Access: 3700");
        t.access(3700);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 100");
        t.access(100);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 110");
        t.access(110);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 200");
        t.access(200);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 50");
        t.access(50);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 300");
        t.access(300);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 210");
        t.access(210);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 173");
        t.access(173);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");

        System.out.println("Access: 60");
        t.access(60);
        System.out.println("Root's parent: "+t.root.parent);
        System.out.println("Tree: \n"+ t+"\n");
        

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

        System.out.println("So fr the parent of "+t.root+" is "+t.root.parent);




    }
}
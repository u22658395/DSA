public class Main {
    public static void main(String[] args) {
        testConstructor();
        testAppend(1);
        testPreppend(10);

        Integer[] values = {1,5,10,3};
        testContains(values);

        testAsc();
        testDesc();
    }

    private static void testConstructor(){
        System.out.println("====Testing Constructor====Testing Constructor====Testing Constructor====Testing Constructor====");
        RecursiveArray arr = new RecursiveArray();
        System.out.println(arr);

        arr = new RecursiveArray("");
        System.out.println(arr);
        
        arr = new RecursiveArray("1");
        System.out.println(arr);

        arr = new RecursiveArray("1,3,4,5,6,12,3");
        System.out.println(arr);

    }
    
    private static void testAppend(Integer val){
        System.out.println("====Testing Append====Testing Append====Testing Append====Testing Append====");

        RecursiveArray arr = new RecursiveArray();
        System.out.println("Initial: "+arr);
        arr.append(val);
        System.out.println(arr +"\n");


        arr = new RecursiveArray("");
        System.out.println("Initial: "+arr);
        arr.append(val);
        System.out.println(arr +"\n");
        
        arr = new RecursiveArray("1");
        System.out.println("Initial: "+arr);

        arr.append(val);
        System.out.println(arr +"\n");

        arr = new RecursiveArray("1,3,4,5,6,12,3");
        System.out.println("Initial: "+arr);
        arr.append(val);
        System.out.println(arr +"\n");

    }
    
    private static void testPreppend(Integer val){
        System.out.println("====Testing Preppend====Testing Preppend====Testing Preppend====Testing Preppend====");

        RecursiveArray arr = new RecursiveArray();
        System.out.println("Initial: "+arr);
        arr.prepend(val);
        System.out.println(arr +"\n");


        arr = new RecursiveArray("");
        System.out.println("Initial: "+arr);
        arr.prepend(val);
        System.out.println(arr +"\n");
        
        arr = new RecursiveArray("1");
        System.out.println("Initial: "+arr);

        arr.prepend(val);
        System.out.println(arr +"\n");

        arr = new RecursiveArray("1,3,4,5,6,12,3");
        System.out.println("Initial: "+arr);
        arr.prepend(val);
        System.out.println(arr +"\n");

    }
    
    private static void testContains(Integer[] val){
        System.out.println("====Testing Contains====Testing Contains====Testing Contains====Testing Contains====");

        RecursiveArray arr = new RecursiveArray("1,3,4,5,6,12,3");
        System.out.println(arr);
        System.out.println("Contains "+ val[0]+": " + arr.contains(val[0]));
        System.out.println("Contains "+ val[1]+": " + arr.contains(val[1]));
        System.out.println("Contains "+ val[2]+": " + arr.contains(val[2]));
        System.out.println("Contains "+ val[3]+": " + arr.contains(val[3]));

    }
    
    private static void testAsc(){
        System.out.println("====Testing Ascending====Testing Ascending====Testing Ascending====Testing Ascending====");

        RecursiveArray arr = new RecursiveArray();
        System.out.println(arr);
        System.out.println(arr.isAscending() + "\n");

        arr = new RecursiveArray("1,3,4,5,5,6,12,3,3");
        System.out.println(arr);
        System.out.println(arr.isAscending() + "\n");

        arr = new RecursiveArray("1,1,3,4,5,5,6,12,");
        System.out.println(arr);
        System.out.println(arr.isAscending() + "\n");

        arr.append(3);
        System.out.println(arr);
        System.out.println(arr.isAscending() + "\n");
    }

    private static void testDesc(){
        System.out.println("====Testing Desc====Testing Desc====Testing Desc====Testing Desc====");

        RecursiveArray arr = new RecursiveArray();
        System.out.println(arr);
        System.out.println(arr.isDescending() + "\n");

        arr = new RecursiveArray("1,3,4,5,6,12,3");
        System.out.println(arr);
        System.out.println(arr.isDescending() + "\n");

        arr = new RecursiveArray("9,9,8,7,6,5,4");
        System.out.println(arr);
        System.out.println(arr.isDescending() + "\n");

    }

}
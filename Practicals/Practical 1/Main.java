public class Main {
    public static void main(String[] args) {
        testConstructor();
        testAppend(1);
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
}
public class RecursiveArray {
    public Integer[] array;

    public RecursiveArray() {
        array = new Integer[0];
    }

    public RecursiveArray(String input) {
        if(input.trim() != ""){
            String[] numbers = input.split(",");
            array = new Integer[numbers.length];

            constructorHelper(numbers, 0);
        }
        else{
            array = new Integer[0];
        }
    }

    @Override
    public String toString() {
        if(array.length == 0){
            return "Empty Array";
        }
        String out = "[" + toStringHelper("", 0);
        return out;
        
    }

    public void append(Integer value) {
        Integer[] tempArr = new Integer[array.length+1];

        appendHelper(tempArr, 0, array.length);
        tempArr[array.length] = value;
        array = tempArr;
    }

    public void prepend(Integer value) {
        Integer[] tempArr = new Integer[array.length+1];

        tempArr[0] = value;
        preppendHelper(tempArr, 1, array.length+1);
        array = tempArr;
    }

    public boolean contains(Integer value) {

        return containsHelper(value, 0);
    }

    public boolean isAscending() {
        if(array.length == 1){
            return true;
        }

        return ascHelper(1);
    }

    public boolean isDescending() {
        if(array.length == 1){
            return true;
        }

        return descHelper(1);
    }

    public void sortAscending() {
        ascBubbleSort(array.length);
    }

    public void sortDescending() {
        descBubbleSort(array.length);
    }

    private void constructorHelper(String[] input, int index){
        if(index < input.length){
            array[index] = Integer.parseInt(input[index]);
            constructorHelper(input, ++index);
        }
    }
    
    private String toStringHelper(String out, int index){
        if(index < array.length){
            
            if(index == array.length-1)
            {
                out+= array[index];
            }
            else
                out+= array[index]+",";
            return  toStringHelper(out, ++index);
        }
        else{
            return out+"]";
        }
    }

    private void appendHelper(Integer[] tempArr, int index, int end) {  
        if(index < end){
            tempArr[index] = array[index];
            appendHelper(tempArr, ++index, end);
        }
    }
    
    private void preppendHelper(Integer[] tempArr, int index, int end) {  
        if(index < end){
            tempArr[index] = array[index-1];
            preppendHelper(tempArr, ++index, end);
        }
    }

    private boolean containsHelper(Integer val, int index) {  
        if(index < array.length ){
            if(array[index] == val)
                return true;
        }
        else{
            return false;
        }
            
        return containsHelper(val, ++index);
    }

    private boolean ascHelper(int index){
        if(index >= array.length){
            return true;
        }

        if(array[index] < array[index-1]){
            return false;
        }

        return ascHelper(++index);
    }

    private boolean descHelper(int index){
        if(index >= array.length){
            return true;
        }

        if(array[index] > array[index-1]){
            return false;
        }

        return descHelper(++index);
    }

    private void ascBubbleSort(int n) {
        //if only one element or empty array, it's already sorted
        if (n <= 1) {
            return;
        }

        ascBubblePass(0, n - 1);
        ascBubbleSort(n - 1);
    }
    
    private void descBubbleSort(int n) {
        //if only one element or empty array, it's already sorted
        if (n <= 1) {
            return;
        }

        descBubblePass(0, n - 1);
        descBubbleSort(n - 1);
    }

    private void ascBubblePass(int i, int n) {
        //if we have reached the end of the array
        if (i == n) {
            return;
        }

        // swap
        if (array[i] > array[i + 1]) {
            Integer temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        ascBubblePass(i + 1, n);
    }

    private void descBubblePass(int i, int n) {
        //if we have reached the end of the array
        if (i == n) {
            return;
        }

        //swap
        if (array[i] < array[i + 1]) {
            Integer temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        descBubblePass(i + 1, n);
    }

}

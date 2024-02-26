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

        helperInsert(tempArr, 0, array.length);
        tempArr[array.length] = value;
        array = tempArr;
    }

    public void prepend(Integer value) {

    }

    public boolean contains(Integer value) {
        return false;
    }

    public boolean isAscending() {
        return false;
    }

    public boolean isDescending() {
        return false;
    }

    public void sortAscending() {

    }

    public void sortDescending() {

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

    private void helperInsert(Integer[] tempArr, int index, int end) {  
        if(index < end){
            tempArr[index] = array[index];
            helperInsert(tempArr, ++index, end);
        }
    }
}

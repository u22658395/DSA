import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Maze {
    private String[] map;

    public Maze(String filename) {
        try{
            FileReader reader = new FileReader(filename);
            Scanner scanner = new Scanner(reader);
            
            int rows = Integer.parseInt(scanner.nextLine());
            map = new String[rows];

            constructorHelper(scanner, 0, rows);
            scanner.close();
            
        }
        catch(FileNotFoundException e){
            map = new String[0];
        }
    }

    public Maze(Maze other) {
        map  = new String[other.map.length];
        insertIntoMap(other.map, 0, map.length);
    }

    @Override
    public String toString() {
        if(map.length <1){
            return "Empty Map";
        }

        return toStringHelper(0);
    }

    public boolean validSolution(int startX, int startY, int goalX, int goalY, LinkedList path) {
        if(path == null || path.head == null){
            return false;
        }
        
        if(path.head.x != startX  || path.head.y != startY)
        {
            return false;
        }
        
        CoordinateNode result = validSolutionHelper(null, null, path);

        if(result ==  null){
            return false;
        }
        
        return  (result.x == goalX && result.y == goalY);
        
        
    }

    public String solve(int x, int y, int goalX, int goalY) {
    
        String[] copy = null;
        copy = mapToCopy(0, copy);

        LinkedList ll = new LinkedList();

        // Call the recursive solve function
        boolean found = solveHelper(x, y, x, y, goalX, goalY, copy, ll);

        // If a valid path is found, return the modified map; otherwise, return an error message
        if(found){

            return String.join("\n", copy).concat("\n" + ll.toString()) ;
        }

        return "No valid solution exists";
    }

    public LinkedList validStarts(int x, int y) {

        LinkedList ll = new LinkedList();
        ll.head = startsHelper(0, 0, x, y);
        return ll;
    }




//======Helper Functions==============Helper Functions==============Helper Functions==============Helper Functions==============Helper Functions==============Helper Functions==============Helper Functions========

    private void constructorHelper(Scanner scanner, int index, int n){
        if(index < n){
            map[index] = scanner.nextLine();
            constructorHelper(scanner, ++index, n);
        }
    }

    private void insertIntoMap(String[] other,int index, int n){
        if(index < n){
            this.map[index] = other[index];
            insertIntoMap(other, ++index, n);
        }
    }

    private String toStringHelper(int index){
        if(index == map.length-1){
            return map[index];
        }
        return  map[index]+"\n"+toStringHelper(++index);
    }

    private CoordinateNode validSolutionHelper(Integer prevX, Integer prevY, LinkedList list){
        if(prevX != null && prevY != null){
            if(list.head.x - prevX > 1 || list.head.x - prevX < -1 || list.head.y - prevY > 1 || list.head.y - prevY < -1){
                return null;
            }
            if((prevX + 1 == list.head.x || prevX - 1 == list.head.x) && (prevY != list.head.y )){ //diagonal movement
                return null;
            }
    
            if((prevY + 1 == list.head.y || prevY - 1 == list.head.y) && (prevX != list.head.x )){ //diagonal movement
                return null;
            }
        }

        try{
            if(map[list.head.y].charAt(list.head.x) == 'X'){
                return null;
            }
            else{
                if(list.head.next == null){
                    return list.head;
                }

                
                CoordinateNode current = list.head;
                list.head = list.head.next;
                if(list.contains(current.x, current.y)) {
                    return null;
                }
                return validSolutionHelper(current.x, current.y, list);
            }
        }
        catch(StringIndexOutOfBoundsException se){
            return null;
        }
        catch(ArrayIndexOutOfBoundsException ae){

            return null;
        }
    }

    

    private boolean solveHelper(int startX, int startY, int x, int y, int goalX, int goalY, String[] copy, LinkedList ll) {
        
        if (x < 0 || x >= copy[0].length() || y < 0 || y >= copy.length) {
            return false;
        }

        if (copy[y].charAt(x) == 'X' || copy[y].charAt(x) == '@' || copy[y].charAt(x) =='S') {
            return false;
        }

        if(x == startX && y == startY){
            copy[y] = copy[y].substring(0, x) + "S" + copy[y].substring(x + 1);
            
        }else{
            copy[y] = copy[y].substring(0, x) + "@" + copy[y].substring(x + 1);
            
        }
        
        ll.append(x, y);
        
        if (x == goalX && y == goalY) {
            copy[y] = copy[y].substring(0, x) + "E" + copy[y].substring(x + 1);
            return true;
        }

        if (solveHelper(startX, startY, x - 1, y, goalX, goalY, copy, ll)) {
            return true;
        }

        if (solveHelper(startX, startY, x, y - 1, goalX, goalY, copy, ll)) {
            return true;
        }

        if (solveHelper(startX, startY, x, y + 1, goalX, goalY, copy, ll)) {
            return true;
        }

        if (solveHelper(startX, startY, x + 1, y, goalX, goalY, copy, ll)) {
            return true;
        }

        copy[y] = copy[y].substring(0, x) + "-" + copy[y].substring(x + 1);
        ll.delete(x, y);

        return false;
    }

    private String[] mapToCopy(int index, String[] copy){
        if(index == 0){
            copy = new String[map.length];
        }
        if(index < map.length){
            copy[index] = map[index];
            return mapToCopy(index+1, copy);
        }

        return copy;
    }

    private CoordinateNode startsHelper(int x, int y, int goalX, int goalY) {
        if (y >= map.length) {
            return null;
        }

        if (x >= map[y].length()) {
            return startsHelper( 0, y + 1, goalX, goalY);
        }

        if (solve(x,y, goalX, goalY) != "No valid solution exists") {
            CoordinateNode node = new CoordinateNode(x, y);
            node.next = startsHelper( x + 1, y, goalX, goalY);
            return node;
        }

        return startsHelper(x + 1, y, goalX, goalY);
    }


}
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
    
        String[] copyMap = new String[map.length];
        for (int i = 0; i < map.length; i++) {
            copyMap[i] = map[i];
        }

        LinkedList ll = new LinkedList();

        // Call the recursive solve function
        boolean found = solveRecursive(x, y, x, y, goalX, goalY, copyMap, ll);

        // If a valid path is found, return the modified map; otherwise, return an error message
        if(found){

            return String.join("\n", copyMap).concat("\n" + ll.toString()) ;
        }

        return "No valid solution exists";
    }

    public LinkedList validStarts(int x, int y) {
        return null;
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

                //make the head of the list head's next and search for head (look for duplicates)
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

    

    private boolean solveRecursive(int startX, int startY, int x, int y, int goalX, int goalY, String[] copyMap, LinkedList ll) {

        // Check if the current position is within the bounds of the map
        if (x < 0 || x >= copyMap[0].length() || y < 0 || y >= copyMap.length) {
            return false;
        }

        // Check if the current position is a wall or has already been visited
        if (copyMap[y].charAt(x) == 'X' || copyMap[y].charAt(x) == '@' || copyMap[y].charAt(x) =='S') {
            return false;
        }

        // Mark the current position as visited
        if(x == startX && y == startY){
            copyMap[y] = copyMap[y].substring(0, x) + "S" + copyMap[y].substring(x + 1);
            
        }else{
            copyMap[y] = copyMap[y].substring(0, x) + "@" + copyMap[y].substring(x + 1);
            
        }
        
        ll.append(x, y);
        
        // Check if we have reached the goal
        if (x == goalX && y == goalY) {
            copyMap[y] = copyMap[y].substring(0, x) + "E" + copyMap[y].substring(x + 1);
            return true;
        }

        // Try moving left
        if (solveRecursive(startX, startY, x - 1, y, goalX, goalY, copyMap, ll)) {
            return true;
        }

        // Try moving up
        if (solveRecursive(startX, startY, x, y - 1, goalX, goalY, copyMap, ll)) {
            return true;
        }

        // Try moving down
        if (solveRecursive(startX, startY, x, y + 1, goalX, goalY, copyMap, ll)) {
            return true;
        }

        // Try moving right
        if (solveRecursive(startX, startY, x + 1, y, goalX, goalY, copyMap, ll)) {
            return true;
        }

        // Backtrack: remove the "@" mark
        copyMap[y] = copyMap[y].substring(0, x) + "-" + copyMap[y].substring(x + 1);
        ll.delete(x, y);

        return false;
    }

    public String mazeString(int index){
        if(index < map.length){
            return map[index] + "\n" + mazeString(index+1);
        }

        return "";
    }

}
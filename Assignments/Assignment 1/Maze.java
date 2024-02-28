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
        return false;
    }

    public String solve(int x, int y, int goalX, int goalY) {
        return "";
    }

    public LinkedList validStarts(int x, int y) {
        return null;
    }

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

}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecursiveMazeSolver {
	
	private static char[][] maze;
	private static int startX, startY, endX, endY;
	private static int row, column;
	
	public static void mazeMaker() {
		
		Scanner fileInput = new Scanner(System.in);
    	System.out.println("Please enter the path for your maze:");
    	File fileName = new File(fileInput.nextLine());
    	fileInput.close();
    	
    	mazeMatrix(fileName);
    }
	
	public static void mazeMatrix(File fileName) {
		
		 try {
			 	Scanner scanner = new Scanner(fileName);			 
			 	
	            row = scanner.nextInt();
	            column = scanner.nextInt();
	            
	            scanner.nextLine();

	            maze = new char[row][column];

	            for (int x = 0; x < row; x++) {
	                String line = scanner.nextLine();
	                for (int y = 0; y < column; y++) {
	                    maze[x][y] = line.charAt(y);
	                    
	                    if(line.charAt(y) == '+') {
	                    	startX = x;
	                    	startY = y;
	                    }
	                    
	                    if(line.charAt(y) == '-') {
	                    	endX = x;
	                    	endY = y;
	                    }
	                }
	            }
	            scanner.close();
	        }
	        catch (FileNotFoundException e) {
	        	System.out.println("File not found.");
	        }
	}
	
	private static boolean mazeSolver(int a, int b) {
		
		if(a < 0 || b < 0 || a >= row  || b >= column || maze[a][b] == 'X' || maze[a][b] == '@') {
			return false;
		}
        if (a == endX && b == endY) {
            return true;
        }
        
        maze[a][b] = '@';

        if (mazeSolver(a, b + 1) || mazeSolver(a, b - 1) || mazeSolver(a + 1, b) || mazeSolver(a - 1, b)) {
            return true;
        } 
        else {
        	maze[a][b] = '=';
        	return false;
        }
    }	
    
    public static void printMaze() {
        
    	for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
            	if(maze[x][y] == '=') {
            		maze[x][y] = ' ';
            	}
                System.out.print(maze[x][y] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    	mazeMaker();
    	
    	if(mazeSolver(startX, startY)) {
    		System.out.println("The maze was solved.");
    	} 
    	else {
    		System.out.println("No solution found.");
    	}
    	
    	printMaze();
    }
}
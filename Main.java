//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
	public static void main( String args[] ) throws IOException
	{
		File file = new File("maze.dat");
    Scanner sc = new Scanner(file);
    //testing
    int size = sc.nextInt();
    sc.nextLine();
    Maze maze = new Maze(size, sc.nextLine());
    System.out.println(maze);

    size = sc.nextInt();
    sc.nextLine();
    maze = new Maze(size, sc.nextLine());
    System.out.println(maze);

    size = sc.nextInt();
    sc.nextLine();
    maze = new Maze(size, sc.nextLine());
    System.out.println(maze);

    size = sc.nextInt();
    sc.nextLine();
    maze = new Maze(size, sc.nextLine());
    System.out.println(maze);
    
    size = sc.nextInt();
    sc.nextLine();
    maze = new Maze(size, sc.nextLine());
    System.out.println(maze);

    size = sc.nextInt();
    sc.nextLine();
    maze = new Maze(size, sc.nextLine());
    System.out.println(maze);
	}
}

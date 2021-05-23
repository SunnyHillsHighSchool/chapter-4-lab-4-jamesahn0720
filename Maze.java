//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;

	public Maze(int size, String line)
	{
Scanner sc = new Scanner(line);
    maze = new int[size][size];
    for(int i = 0; i < size; i++)
    {
      for(int j = 0; j < size; j++)
      {
        maze[i][j] = sc.nextInt();
      }
    }

	}

	public boolean hasExitPath(int r, int c)
	{
		if(c==maze[0].length-1)
      if(maze[r][c]==1)
        return true;
    
    if(r>=0 && r<maze.length && maze[r][c]==1)
    {
        return (hasExitPath(r,c+1) || hasExitPath(r+1,c));
    }
		return false;
	}

	public String toString()
	{
	String output = "";
    for(int r = 0; r < maze.length; r++)
    {
      for(int c = 0; c < maze[0].length; c++)
      {
        output += maze[r][c]+ " ";
      }
      output+= "\n";
    }
    if(hasExitPath(0,0))
		  return output + "exit found\n";
		return output + "exit not found\n";
	}
}

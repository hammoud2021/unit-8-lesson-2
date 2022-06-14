/*
 * Unit 8 - Lesson 2 - 2-D Array Algorithms
 */


import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class U8_L2_template
{
  public static void randomizeScores(int[][] ts)
  {
    for (int r = 0; r < ts.length; r++)
    {
      for (int c = 0; c < ts[0].length; c++)
      {
        ts[r][c] = (int)(41 * Math.random()) + 60;
      }
    }
  }
  public static void print(int[][] ts)
  {
    for (int r = 0; r < ts.length; r++)
    {
      for (int c = 0; c < ts[0].length; c++)
      {
        System.out.print(ts[r][c] + " ");
      }
      System.out.println();
    }
  }
  
 public static double calcTestAvg(int[][] ts, int col)
    {
      double sum=0;
      for(int r=0;r<ts.length;r++)
      {
        sum+=ts[r][col];
      }
      return sum/ts.length;
    }
  
  public static void calcAverages(int[][] testScores,double[] average)
  {
     for (int r = 0; r < testScores.length; r++)
    {
      double sum=0;
      for (int c = 0; c < testScores[0].length; c++)
      {
        sum+=testScores[r][c];
      }
      average[r]=sum/testScores[0].length;
    }
  }
  
    
    public static boolean isImproving(int[] scores)
    {
      for(int i=1; i<scores.length; i++)
      {
        if(scores[i]<scores[i-1])
        {
          return false;
          
        }
      }
        return true;
    }
    
    public static void studentsImproving(int[][] ts, boolean[] b)
    {
      for(int r=0; r<ts.length; r++)
      {
        b[r]= isImproving(ts[r]);
      }
    }
    
  public static void main(String[] str) throws IOException
  {
    int[][] testScores = new int[25][4];
    double[] avgScores= new double [25];
    int[] scores={75,60,85,90};
    boolean[] improvement = new boolean[25];
    
    print(testScores);
    randomizeScores(testScores);
    System.out.println("Randomized: ");
    print(testScores);
    System.out.println("Calculate Averages: ");
    calcAverages(testScores,avgScores);
    for(double i:avgScores)
    {
      System.out.println(i);
    }
    System.out.println("Calculate Test 1 Average: "+ calcTestAvg(testScores,0));
    System.out.println("Calculate Test 1 Average: "+ isImproving(scores));
    System.out.println("Determine if ech student is Improving: ");
    for(boolean i: improvement)
    {
      System.out.println(i);
    }
    
  }
 
}

package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(String args[]) {
    // TODO read successive input lines until EOF, then print out in reverse order


    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      final String line = input.nextLine();


      //Mine below



      }


    }

  private static void testA(int a, int b) {
    a = 0;
    b = 0;
    if (a == b) {
      return;
    }
    StringBuilder result = new StringBuilder();
    for (int i = a; ; i += a < b ? 1 : -1) {
      result.append(i).append("\t");
      if (i == b) {
        break;
      }
    }
    System.out.println(result.deleteCharAt(result.length() - 1).toString());


  }



  }



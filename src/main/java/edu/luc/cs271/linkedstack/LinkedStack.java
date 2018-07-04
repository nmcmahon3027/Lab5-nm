package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Arrays;


public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */
  //Mine below***
  private Node<E> topOfStackRef = null;

  // *Q: TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // TODO*
    topOfStackRef = new Node<>(obj, topOfStackRef);

    return obj;
  }

  @Override
  public E peek() {
    // TODO*
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      return topOfStackRef.data;
    }

  }

  @Override
  public E pop() {
    // TODO*
    E result;
    if (isEmpty()) {
      throw new NoSuchElementException();
    } else {
      result = topOfStackRef.data;
      topOfStackRef = topOfStackRef.next;
    }
    return result;
  }



  @Override
  public boolean isEmpty() {
    // TODO*

    return topOfStackRef == null;
  }

  @Override
  public List<E> asList() {//me below
   /* String[] stackArray;
    int stackSize;
    int topOfStack = -1;

    TheStack(int size){
      stackSize = size;
      stackArray = new String[size];
      Arrays.fill(stackArray, "-1");

    }
    public void push(String input){
      if(topOfStack +1 < stackSize){
        topOfStack++;
        stackArray[topOfStack] = input;

      }else System.out.println("Stack is full!");
      displayTheStack();
      displayTheStack();
      System.out.println("PUSH" + input + "was added to the stack\n");

    }
    private void displayTheStack(){
      for(int n = 0; n< 61; n++) System.out.print("-");
      System.out.println();
      for(int n = 0; n< stackSize; n++){
        System.out.format("| %2s "+ " ", n);
      }
      System.out.println("|");
      for(int n = 0; n< 61; n++)System.out.print("-");
      System.out.println();
      for(int n= 0; n< stackSize; n++){
        if(stackArray[n].equals("-1")) System.out.print("|        ");
        else System.out.print(String.format("| %2s " + " ", stackArray[n]));
      }
      System.out.println("|");
      for(int n = 0; n< 61; n++)System.out.print("-");
      System.out.println();
    }
    public static void main(String[] args){
      TheStack theStack = new TheStack(10);
      TheStack.push("10");
      TheStack.push("15");

      */
   return null;
    }


    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this

  }



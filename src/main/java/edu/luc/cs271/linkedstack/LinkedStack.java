package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Arrays;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?
  // Answered in Answers.md file

  @Override
  public E push(final E obj) {
    // TODO
    top = new Node<>(obj, top);
    return null;
  }

  @Override
  public E peek() {
    // TODO
    if (isEmpty())
    {
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop() {
    // TODO
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
      E newTop = top.data;
      top = top.next;
      return newTop;
    }
  }

  @Override
  public boolean isEmpty() {
    // TODO
    if (top == null) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this
    List<E> preallocatedList = new ArrayList<E>();
    while (top != null) {
      preallocatedList.add(top.data);
      top = top.next;
    }
    // TODO add any instance variable(s) required to support this
    return preallocatedList;
  }
}
package org.example;

public class Main {

  public static void main(String[] args) {

    TodoManager manager = new TodoManagerImpl();

    manager.create("первая задача", false);
  }
}
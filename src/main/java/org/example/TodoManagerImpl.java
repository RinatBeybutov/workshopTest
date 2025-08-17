package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * Класс для
 *
 * @author Gaben 17.08.2025
 */
public class TodoManagerImpl implements TodoManager {

  private Map<Integer, TodoItem> map = new HashMap<>();

  private int idCounter = 0;

  @Override
  public void create(String title, boolean isCompleted) {
    TodoItem todoItem = new TodoItem(idCounter, title, isCompleted);
    map.put(idCounter, todoItem);
    System.out.printf("Создана задача %s %n", title);
  }
}

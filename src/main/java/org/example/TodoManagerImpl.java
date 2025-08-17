package org.example;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс для
 *
 * @author Gaben 17.08.2025
 */
public class TodoManagerImpl implements TodoManager {

  private Map<Integer, TodoItem> idToTask = new HashMap<>();

  private int idCounter = 0;

  @Override
  public void create(String title, boolean isCompleted, Date date) {
    TodoItem todoItem = new TodoItem(idCounter, title, isCompleted, date);
    idToTask.put(idCounter, todoItem);
    System.out.printf("Создана задача %s %n", title);
  }

  @Override
  public void delete(int id) {
    if (!idToTask.containsKey(id)) {
      throw new RuntimeException("Задача не найдена!");
    }
    idToTask.remove(id);
    System.out.printf("Задача с id %s удалена", id);
  }
}

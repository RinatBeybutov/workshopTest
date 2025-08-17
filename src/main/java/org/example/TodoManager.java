package org.example;


/**
 * Класс для управления задачами
 *
 * @author Gaben 17.08.2025
 */
public interface TodoManager {

  void create(String title, boolean isCompleted);

  void delete(int id);
}

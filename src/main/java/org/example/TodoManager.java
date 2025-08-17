package org.example;


import java.util.Date;

/**
 * Класс для управления задачами
 *
 * @author Gaben 17.08.2025
 */
public interface TodoManager {

  void create(String title, boolean isCompleted, Date date);

  void delete(int id);
}

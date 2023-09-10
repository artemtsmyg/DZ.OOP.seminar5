package Model.Core;

import Controller.Interfaces.iGetView;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс, представляющий модель с использованием HashMap для хранения информации о студентах
 */
public class ModelClassHash implements  iGetView {
    private Map<Long, Student> studentMap;

    /**
     * Конструктор по умолчанию. Инициализирует хэш-таблицу для хранения студентов
     */

    public ModelClassHash() {
        this.studentMap = new HashMap<>();
    }

    /**
     * Метод для добавления студента в хэш-таблицу
     * @param id
     * @param student
     */
    @Override
    public void addStudent(long id, Student student) {
        studentMap.put(id, student);
    }

    /**
     * Метод для удаления студента из хэш-таблицы по его идентификатору
     * @param id
     */
    @Override
    public void deleteStudent(long id) {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
        } else {

            System.out.println("Student with ID " + id + " does not exist.");
        }
    }

    /**
     * Метод для отображения информации о студентах
     * @param s
     */
    @Override
    public void display(String s) {

    }

}

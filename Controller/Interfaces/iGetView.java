package Controller.Interfaces;

import Model.Core.Student;

/**
 * Интерфейс 'iGetViev' для получения модели
 */
public interface iGetView {
    /**
     * Идентификатор студентов
     * @param id
     * @param student
     */
    void addStudent(long id, Student student);
    void deleteStudent(long id);

    /**
     * Отображение пустоты строк
     * @param s
     */
    void display(String s);
}

package View;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

/**
 * Класс, 'ViewClassEng' представляющий представление на английском языке
 */
public class ViewClassEng implements iGetView {
    /**
     * Метод для добавления студента
     * @param id
     * @param student
     */
    @Override
    public void addStudent(long id, Student student) {

    }

    /**
     * Метод для удаления студента по идентификатору
     * @param id
     */
    @Override
    public void deleteStudent(long id) {

    }

    /**
     * Метод для отображения текста на английском языке
     * @param text
     */
    @Override
    public void display(String text) {
        System.out.println("English View: " + text);
    }
}
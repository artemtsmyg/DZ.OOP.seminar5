package Model;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

import java.util.List;

public abstract class ModelClassList implements iGetView {

    private List<Student> students;

    /**
     * Список студентов
     * @param students
     */
    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает студентов
     * @return
     */
    public List<Student> getStudents() {
        return students;
    } 
}

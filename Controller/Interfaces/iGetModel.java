package Controller.Interfaces;

import Model.Core.Student;

/**
 * Интерфейс для получения модели
 */
interface iGetModel {
    void addStudent(long id, Student student);
    void deleteStudent(long id);

}

package Model.Core;

/**
 * Класс 'Student' с полем 'String name'
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    /**
     * Геттеры и сеттеры для свойств студента, если необходимо
     * @return
     */

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


}


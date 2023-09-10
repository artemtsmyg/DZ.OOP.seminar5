package Controller;

import Controller.Interfaces.iGetView;
import Model.Core.Student;

import java.util.Scanner;

public class Controller {

    /**
     * Класс 'Controller'
     */
        private iGetView view;
        private iGetView model;

        public Controller(iGetView view, iGetView model) {
            this.view = view;
            this.model = model;
        }

    /**
     * Добавляем команды в метод 'run'
     */
        public void run() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                view.display("Enter command (ADD, DELETE, EXIT): ");
                String command = scanner.next();

                switch (command) {
                    case "ADD":
                        /**
                         * Запрос у пользователя данных о студенте и вызов метода добавления модели
                         */
                        view.display("Enter student ID: ");
                        long id = scanner.nextLong();
                        view.display("Enter student name: ");
                        String name = scanner.next();
                        Student student = new Student(name);
                        model.addStudent(id, student);
                        view.display("Student added.");
                        break;

                    case "DELETE":
                        /**
                         * Запрос у пользователя номера студента на удаление и вызов метода удаления модели
                         */
                        view.display("Enter student ID to delete: ");
                        long idToDelete = scanner.nextLong();
                        model.deleteStudent(idToDelete);
                        break;

                    case "EXIT":
                        /**
                         * Завершение программы
                         */
                        scanner.close();
                        return;

                    default:
                        view.display("Invalid command. Try again.");
                        break;
                }
            }
        }
    }

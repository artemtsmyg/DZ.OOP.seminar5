import Controller.Controller;
import Controller.Interfaces.iGetView;
import Model.Core.ModelClassHash;
import View.ViewClassEng;

/**
 * Главный класс программы, содержащий точку входа.
 */
public class App {
    public static void main(String[] args) {
        /**
         * Создание объектов представления и модели
         */
        iGetView view = new ViewClassEng();
        iGetView model = new ModelClassHash();

        /**
         * Создание контроллера и запуск приложения
         */
        Controller controller = new Controller(view, model);
        controller.run();
    }
}

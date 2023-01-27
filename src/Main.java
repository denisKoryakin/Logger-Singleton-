import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.logging.Logger;

public class Main {

//    Задание по теме паттерн Singleton

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        Scanner scanner = new Scanner(System.in);

        logger.log("просим пользователя ввести входные данные");

        System.out.println("Добрый день! Прошу Вас ввести размер списка");
        int listSize = scanner.nextInt();
        System.out.println("теперь введите верхнюю границу значений элементов в списке");
        int maxValue = scanner.nextInt();

        logger.log("создаем и наполняем список");

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add((int) (Math.random() * (maxValue + 1)));
        }
        System.out.println("Получившийся список: " + list);

        System.out.println("введите число для фильтрации списка");
        int numFilter = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(numFilter);
        list = filter.filterOut(list);

        logger.log("выводим результат на экран");
        System.out.println(list);

        logger.log("завершаем программу");
    }
}

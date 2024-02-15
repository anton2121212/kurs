//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для выхода введите 'end'):");

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("end")) {
                break;
            }
            wordsList.add(word);
        }

        System.out.println("Список введенных слов:");
        for (String word : wordsList) {
            System.out.println(word);
        }



        Map<String, Cat> catMap = new HashMap<>();

        // Добавляем 10 котов в коллекцию
        catMap.put("Мурзик", new Cat("Мурзик", "Черный"));
        catMap.put("Барсик", new Cat("Барсик", "Серый"));
        catMap.put("Васька", new Cat("Васька", "Белый"));
        catMap.put("Рыжик", new Cat("Рыжик", "Рыжий"));
        catMap.put("Матроскин", new Cat("Матроскин", "Серый"));
        catMap.put("Леопольд", new Cat("Леопольд", "Коричневый"));
        catMap.put("Том", new Cat("Том", "Серый"));
        catMap.put("Гарфилд", new Cat("Гарфилд", "Рыжий"));
        catMap.put("Котофей", new Cat("Котофей", "Черный"));
        catMap.put("Базилио", new Cat("Базилио", "Белый"));

        // Выводим список ключей (имен котов)
        System.out.println("Список ключей (имен котов):");
        for (String key : catMap.keySet()) {
            System.out.println(key);
        }

        System.out.println();

        // Выводим список котов вместе с их цветом
        System.out.println("Список котов вместе с их цветом:");
        for (Cat cat : catMap.values()) {
            System.out.println("Кот: " + cat.getName() + ", Цвет: " + cat.getColor());

        }
    }
}
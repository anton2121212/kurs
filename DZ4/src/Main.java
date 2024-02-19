import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Cat> catList = new ArrayList<>();

        catList.add(new Cat("Boris"));
        catList.add(new Cat("Oleg", "Gray"));
        catList.add(new Cat("Kago", "Black", 3));
        catList.add(new Cat("Coco"));
        catList.add(new Cat("Max", "White"));
        catList.add(new Cat("Kriko", "Orange", 5));
        catList.add(new Cat("Leo"));
        catList.add(new Cat("Solik", "Yellow"));
        catList.add(new Cat("Bella", "White", 2));
        catList.add(new Cat("Oreo", "Black", 4));

        System.out.println("Aктуальное количество котов:" + Cat.getCatCount());

        Collections.sort(catList, Comparator.comparing(Cat::getName));

        System.out.println("Кошки отсортированны по имени:");
        for (Cat cat : catList) {
            System.out.println(cat.getName());
        }

        Collections.sort(catList, Comparator.comparingInt(Cat::getAge));

        System.out.println("Кошки отсортированны по возрасту:");
        for (Cat cat : catList) {
            System.out.println(cat.getAge());
        }
    }
}
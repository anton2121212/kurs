import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(77977667,"apple",12.2);
        System.out.print(phone.toString());
        phone.ring();
        LandLinePhone phone1 = new LandLinePhone();
        phone1.ring();
        System.out.print(phone1.ToString());
        MobilePhone phone2 = new MobilePhone();
    }

}
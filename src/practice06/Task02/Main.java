package practice06.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Menu menu1 = new Menu("Peperoni");
        Menu menu2 = new Menu("Chees");

        Menu[] menus = {menu1, menu2};


        String result_finding_pizza = "We dont have this pizza!!!";
        String result_havin_alcahol = "You dont have the 21";

        Person pizzaForFind = new Person("Daryn" , 21, 1000, "Peperoni", "YES");


        for(Menu menu : menus) {
            if(menu.getName_of_pizza().equals(pizzaForFind.getName_pizza())){
                result_finding_pizza = "ako";
                pizzaForFind.eat();
                if(pizzaForFind.getWant_alcahol().equals("YES") && pizzaForFind.getAge() >= 21) {
                    result_havin_alcahol = "YES";
                    pizzaForFind.drink();
                }
                break;
            }
        }
        if(!result_finding_pizza.equals("ako")){
            System.out.println(result_finding_pizza);
        }
        if(!result_havin_alcahol.equals("YES")){
            System.out.println(result_havin_alcahol);
        }

        pizzaForFind.tips(pizzaForFind.isDrunk());


    }
}

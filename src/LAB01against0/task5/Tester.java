package LAB01against0.task5;

public class Tester {
    public static void main(String[] args) {
        DragonLunch dragonLaunch = new DragonLunch();

        dragonLaunch.kidnap(new Person("Cole",Gender.BOY));
        dragonLaunch.kidnap(new Person("Daryn",Gender.BOY));

        System.out.println("List of kidnapped people:");
        dragonLaunch.allPerson();

        if (dragonLaunch.willDragonEatOrNot()) {
            System.out.println("Dragon have launch!");
        } else {
            System.out.println("Dragon have not launch.");
        }
    }
}

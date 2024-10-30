package lab02;

public class AkoTester {

        public static void main(String[] args) {
            Student akzhol = new Student("Akzhol", 2);

            Student daryn = new Student("Daryn", 3);
            System.out.println(daryn.getId());
            System.out.println(akzhol.getId());
            System.out.println(akzhol.getName());
            System.out.println(daryn.getName());
        }
}


package bonus02;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[3];

        users[0] = new User(1, "23B030391", "akosh", "Sadyk", "Akzhol");

        users[1] = new Staff(2, "23B030366", "aaaa", "Yerassyl", "Kenzhegaly",5000, new String[]{"OOP", "ADS"});

        users[2] = new Student(3, "23B030395", "nnnn", "Nurkhat", "Sarsenbay", 3.5, new String[]{"OOP", "Physics"});

        for (User user : users) {
            System.out.println(user.getData());
        }
    }
}

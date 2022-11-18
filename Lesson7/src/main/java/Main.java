public class Main {
    public static void main(String[] args) {
        User user = new User(24);
        User user1 = new User("Brian", "O'Connor");
        User user2 = new User(16, "Men", "Ivan", "Ivanov");
        System.out.println(user1.getName() + " " + user1.getSurname());
        System.out.println(user.getAge());
        System.out.println(user2);
    }

}

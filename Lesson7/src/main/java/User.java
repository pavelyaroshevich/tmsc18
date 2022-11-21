public class User {
    public int age;
    public String sex;
    public String name;
    public String surname;

    public User() {
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(int age, String sex, String name, String surname) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.surname = surname;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(int age) {
        this(age,"Paul");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Deprecated
    public int getAge() {
        return ++age;
    }

    @Override
    public String toString() {
        return "Пользователь[" +
                "Возраст=" + age +
                ", Пол='" + sex + '\'' +
                ", Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ']';
    }
}

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

    public User(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return ++age;
    }

    @Override
    public String toString() {
        return "User[" +
                "Возраст=" + age +
                ", Пол='" + sex + '\'' +
                ", Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ']';
    }
}

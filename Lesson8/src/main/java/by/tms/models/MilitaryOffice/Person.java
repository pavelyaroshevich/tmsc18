package by.tms.models.MilitaryOffice;

public class Person {
        private String name;
        private int age;
        private String sex;
        private Address address;

        public Person(String name, int age, String sex, Address address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }
}

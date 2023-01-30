package by.tms.models;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int course;
    private City city;

    public Student(int id, String name, String surname, int course, City city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.city = city;
    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public City getCityName() {
        return city;
    }

    public void setCityName(City cityName) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", city='" + city + '\'' +
                '}';
    }
}

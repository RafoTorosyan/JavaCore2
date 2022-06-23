package homework.students;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNumbers;
    private String city;
    private String lesson;

    public Student(String name, String surname, int age, String phoneNumbers, String city, String lesson) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
        this.city = city;
        this.lesson = lesson;
    }

    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumbers='" + phoneNumbers + '\'' +
                ", lesson='" + lesson + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

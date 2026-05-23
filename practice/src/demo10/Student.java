package demo10;

public class Student extends Person{
    public int score;
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", score=" + score +
                ", age=" + getAge() +
                '}';
    }
}

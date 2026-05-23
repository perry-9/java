package demo15;

public class Student implements Comparable<Student>{
    public int id;
    public String name;
    public double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(o.score !=this.score){
        return Double.compare(o.score,this.score);}
        else if (o.id!=this.id){
            return Integer.compare(this.id,o.id);
        }
        else {
            return this.name.compareTo(o.name);
        }
    }
}

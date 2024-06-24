package CodeGym.src.IOTextFile;

public class Student {
    private String name;
    private  int id;
    private double mark;

    public Student(String name, int id, double mark){
        this.name = name;
        this.id= id;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Family has : " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mark=" + mark +
                '}';
    }
}

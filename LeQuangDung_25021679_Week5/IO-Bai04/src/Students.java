import java.io.Serializable;

public class Students implements Serializable {
    private String id;
    private String name;
    private double gpa;
    public Students(String id, String name, double gpa){
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "id : "+id+", name : "+name+", gpa : "+gpa;
    }
}

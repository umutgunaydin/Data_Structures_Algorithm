package day02_collectionsReview;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode // we have to add these together
public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

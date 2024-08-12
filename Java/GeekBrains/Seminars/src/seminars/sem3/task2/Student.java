package seminars.sem3.task2;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Student {
    @Setter
    @Getter
    private String surname;
    @Setter
    @Getter
    private Integer group;
    @Setter
    @Getter
    private Integer scholarship;
    private List<Integer> grades;

    public ArrayList<Integer> getGrades() {
        return (ArrayList<Integer>) grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public boolean evenGrades() {
        Integer sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum % 2 == 0;
    }
}

package seminars.sem3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
Определить стипендии студентов, фамилии которых заканчиваются на "ова", при четной сумме баллов
 */
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                        new Student("Абрамова", 101, 5000, Arrays.asList(5, 4, 5)),
                        new Student("Кочнев", 101, 5000, Arrays.asList(3, 5, 5)),
                        new Student("Брызгалова", 101, 5000, Arrays.asList(5, 4, 5)),
                        new Student("Викторов", 121, 10000, Arrays.asList(5, 5, 5)),
                        new Student("Старовойтова", 121, 3000, Arrays.asList(3, 4, 4)),
                        new Student("Кочегаров", 121, 7500, Arrays.asList(4, 4, 5))));
        for (Student student : studentList) {
            if (student.getSurname().endsWith("ова") && student.evenGrades()) {
                System.out.println(student.getSurname() + " scholarship: " + student.getScholarship());
            }
        }
        System.out.println("Searching to scholarship field.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min scholarship: ");
        int scholarship = scanner.nextInt();

        for (Student student : studentList) {
            if (student.getScholarship() >= scholarship) {
                System.out.println(student.getSurname() + " scholarship: " + student.getScholarship());
            }
        }

    }
}


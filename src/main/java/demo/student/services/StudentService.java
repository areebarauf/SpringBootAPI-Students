package demo.student.services;

import demo.student.models.Student;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    @GetMapping
    public List<Student> getStudents (){
        return List.of(
                new Student(
                        1L,
                        "Areeba Rauf",
                        "areebarauf96@outlook.com",
                        LocalDate.of(1996, Month.NOVEMBER, 5),
                        25
                )
        );
    }
}

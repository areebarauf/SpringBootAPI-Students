package demo.student;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


//@Service and @Component are the exact same thing but service is more systematic
@Service
public class StudentServices {
    public List<Student> getStudents (){
        return List.of(
                new Student(
                        1L,
                        "Areeba Rauf",
                        "areebarauf96@outlook.com",
                        LocalDate.of(1996, Month.NOVEMBER, 5),
                        27
                )
        );
    }
}

package demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//API Layer-----Controller Class-------
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController{
    public StudentServices service ;

    @Autowired
    public StudentController(StudentServices service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents (){
        return service.getStudents();
    }
}

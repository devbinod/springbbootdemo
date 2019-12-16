package np.com.pantbinod.springbootdemo.controller;

import np.com.pantbinod.springbootdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StartController {

    List<Student> studentList = new ArrayList<Student>();

    @GetMapping("/students/{id}")
    public Student getSingleStudent(@PathVariable int id){

        return new Student(1,"Binod","Pant");
    }
    
    @GetMapping("/students")
    public List<Student> getAllStudent(){
        studentList.add(new Student(1,"sdfs","sdfs"));
        studentList.add(new Student(2,"dsfdsdfs sd","sdfs"));
        studentList.add(new Student(3,"addedd","sdfs"));
        return studentList;
    }
    
    @PostMapping("/students")
    public void addStudent(){
    }
    
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id){
        System.out.println(id);
    }
    
    @PutMapping("/students/{id}")
    public void updateStudent(@ModelAttribute Student student){
        System.out.println("student.toString() = " + student.toString());
    }

}

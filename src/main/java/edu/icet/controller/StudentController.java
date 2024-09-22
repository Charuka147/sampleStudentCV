package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class StudentController {
    final StudentService service;
    @GetMapping("/all")
    public List<Student> getStudent(){
        return  service.getStudent();
    }
    @PostMapping("/bulk")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }
    @PutMapping
    public void updateStudent(@RequestBody Student student){
        service.addStudent(student);
    }
    @GetMapping("/find-by-name/{name}")
    public List<Student> findByName(@PathVariable String name){
        return service.findByName(name);
    }
}

package com.yan.bai_tap_nop.controllers;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.yan.bai_tap_nop.models.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    //#region Fields
    private List<Student> students = new ArrayList<>();
    //#endregion

    //#region Constructors
    public StudentController(){
        students.add(new Student("Nguyễn Văn A", 20));
        students.add(new Student("Trần Văn B", 21));
    }
    //#endregion

    //#region Methods
    @GetMapping("/")
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/add")
    public List<Student> addRequestParam(@RequestParam("name") String name, @RequestParam("age") int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return students;
    }

    @GetMapping("/add/{name}/{age}")
    public List<Student> addPathVariable(@PathVariable("name") String name, @PathVariable("age") int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return students;
    }

    @PostMapping(value = "add", consumes = "application/json")
    public List<Student> add(@RequestBody Student student) {
        students.add(student);
        return students;
    }
    //#endregion
}

package com.springbootformtion.demo.rest;

import com.springbootformtion.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestcontroller {
    private List<Student> thestudents;

    @PostConstruct
    public void loadData() {
        thestudents = new ArrayList<>();
        thestudents.add(new Student("r", "s"));
        thestudents.add(new Student("r", "s"));
        thestudents.add(new Student("r", "s"));
    }

    @GetMapping("/student")
    public List<Student> getstudent() {
        List<Student> thestudents = new ArrayList<>();
        return thestudents;
    }


    @GetMapping("/student/{studentid}")
    public Student getsrudent(@PathVariable int studentid) {
if(studentid>=thestudents.size()||(studentid<0)){
    throw new StudentNotfoundexception("student id not " +
            "found"+studentid);
}
        return thestudents.get(studentid);
    }
    @ExceptionHandler
    public ResponseEntity<Studenterrorresponse> handleException(StudentNotfoundexception
                                                                exc ){
        Studenterrorresponse error =new Studenterrorresponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }
}
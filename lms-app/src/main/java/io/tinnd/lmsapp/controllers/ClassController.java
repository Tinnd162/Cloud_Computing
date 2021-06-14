package io.tinnd.lmsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tinnd.lmsapp.entities.Class;
import io.tinnd.lmsapp.services.ClassService;

@RestController
@RequestMapping("/classes")
@CrossOrigin
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("")
    public ResponseEntity<?> findAll()
    {
        List<Class> res = classService.findAll();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/{faculty_id}")
    public ResponseEntity<?> getMajorbyFaculty(@PathVariable String faculty_id)
    {
        List<Class> res= classService.getMajorbyFaculty(faculty_id);
        return ResponseEntity.ok(res);
    }
}

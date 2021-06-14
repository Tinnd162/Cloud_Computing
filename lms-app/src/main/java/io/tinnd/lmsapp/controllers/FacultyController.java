package io.tinnd.lmsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tinnd.lmsapp.entities.Faculty;
import io.tinnd.lmsapp.services.FacultyService;

@RestController
@RequestMapping("/faculties")
@CrossOrigin
public class FacultyController {
    @Autowired
    private FacultyService facultyService;

    @GetMapping("")
    public ResponseEntity<?> findAll()
    {
        List<Faculty> res= facultyService.findAll();
        return ResponseEntity.ok(res);
    }
}

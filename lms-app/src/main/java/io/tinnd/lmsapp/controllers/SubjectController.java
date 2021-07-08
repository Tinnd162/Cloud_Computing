package io.tinnd.lmsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tinnd.lmsapp.entities.Subject;
import io.tinnd.lmsapp.services.SubjectService;


@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("")
    public ResponseEntity<?> findAll()
    {
        List<Subject> res = subjectService.findAll();
        return ResponseEntity.ok(res);
    }

    // @GetMapping("/subject/{faculty}")
    // public ResponseEntity<?> getSubjectbyFaculty (@PathVariable String faculty) {
    //     List<Subject> res= subjectService.getSubjectbyFaculty(faculty);
    //     return ResponseEntity.ok(res);
    // }

    // @DeleteMapping("/subject/{id}")
    // public ResponseEntity<?> deleteSubjectbyID(@PathVariable String id)
    // {
    //     subjectService.deleteSubjectbyId(id);
    //     return ResponseEntity.ok("Xóa thành công");
    // }
}

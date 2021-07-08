package io.tinnd.lmsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.tinnd.lmsapp.entities.Semester;
import io.tinnd.lmsapp.model.DTO.SemesterDTO;
import io.tinnd.lmsapp.services.SemesterService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/semesters")
@CrossOrigin
public class SemesterController {
    @Autowired
    private SemesterService semesterSer;

    @GetMapping("")
    public ResponseEntity<?> getAll()
    {
        List<Semester> res=semesterSer.findAll();
        return ResponseEntity.ok(res);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getSemesterbyId(@PathVariable String id)
    {
        Semester res= semesterSer.getSemesterbyId(id);
        return ResponseEntity.ok(res);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<?> getDetailSemester(@PathVariable String id)
    {
        List<SemesterDTO> res=semesterSer.getDetailSemester(id);
        return ResponseEntity.ok(res);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSemesterbyId(@PathVariable String id)
    {
        semesterSer.deleteSemester(id);
        return ResponseEntity.ok("Xóa thành công");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateSemesterbyId(@PathVariable String id, @RequestBody Semester sem)
    {
        semesterSer.updateSemester(id, sem);
        return ResponseEntity.ok("Cập nhật thành công");
    }
    @PostMapping("/create/")
    public ResponseEntity<?> postMethodName(@RequestBody Semester sem) {
        semesterSer.createSemester(sem);
        return ResponseEntity.ok("Thêm thành công");
    }
}
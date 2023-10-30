package controller;

import entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CatalogService;

import java.util.List;

@RestController
public class CatalogController {
    private CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/catalog")
    public ResponseEntity<List<Student>> getAllStudents()    {
        return ResponseEntity.ok(catalogService.getAllStudents());
    }


}

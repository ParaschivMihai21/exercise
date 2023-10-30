package service;


import entity.Student;

import org.springframework.stereotype.Service;
import repository.CatalogRepository;

import java.util.List;


@Service
public class CatalogService{

private CatalogRepository catalogRepository;

public CatalogService(CatalogRepository catalogRepository){
    this.catalogRepository=catalogRepository;
}
public List<Student> getAllStudents(){
    return catalogRepository.findAll();
}

}

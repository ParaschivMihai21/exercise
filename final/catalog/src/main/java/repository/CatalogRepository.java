package repository;

import entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CatalogRepository extends JpaRepository<Student,Integer> {



}

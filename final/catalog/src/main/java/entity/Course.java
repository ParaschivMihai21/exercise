package entity;

import jakarta.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;
    @Column(name="algebra")
    private int algebraCourse;
    @Column(name="sport")
    private int sportCourse;
    @Column(name="romanian")
    private int romanianCourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlgebraCourse() {
        return algebraCourse;
    }

    public void setAlgebraCourse(int algebraCourse) {
        this.algebraCourse = algebraCourse;
    }

    public int getSportCourse() {
        return sportCourse;
    }

    public void setSportCourse(int sportCourse) {
        this.sportCourse = sportCourse;
    }

    public int getRomanianCourse() {
        return romanianCourse;
    }

    public void setRomanianCourse(int romanianCourse) {
        this.romanianCourse = romanianCourse;
    }

    public Course() {
    }

    public Course(int id, int algebraCourse, int sportCourse, int romanianCourse) {
        this.id = id;
        this.algebraCourse = algebraCourse;
        this.sportCourse = sportCourse;
        this.romanianCourse = romanianCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", algebraCourse=" + algebraCourse +
                ", sportCourse=" + sportCourse +
                ", romanianCourse=" + romanianCourse +
                '}';
    }
}

package entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

 @Column(name="id")
    private int id;
 @Column(name="first_name")
    private String firstName;
 @Column(name="last_name")
    private String lastName;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="course_id")
 private Course joining;

public Student(){

}

    public Student(int id, String firstName, String lastName, Course joining) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joining = joining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course getJoining() {
        return joining;
    }

    public void setJoining(Course joining) {
        this.joining = joining;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", joining=" + joining +
                '}';
    }
}

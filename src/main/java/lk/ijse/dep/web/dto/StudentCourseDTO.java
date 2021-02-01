package lk.ijse.dep.web.dto;

import lk.ijse.dep.web.entity.Course;
import lk.ijse.dep.web.entity.Student;
import lk.ijse.dep.web.entity.StudentCoursePK;
import lombok.AccessLevel;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

public class StudentCourseDTO {

    private String studentId;
    private String courseCode;
    private Date registeredDate;

}

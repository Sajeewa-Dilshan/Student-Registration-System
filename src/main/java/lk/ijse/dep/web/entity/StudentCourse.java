package lk.ijse.dep.web.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student_course")
public class StudentCourse implements SuperEntity{

    @EmbeddedId
    private StudentCoursePK studentCoursePK;
    @Column(name = "registered_name")
    private Date registeredDate;
    @ManyToOne
    @Setter(AccessLevel.NONE)
    @JoinColumn(name = "student_id",referencedColumnName = "id",insertable = false,updatable = false)
    private Student student;
    @ManyToOne
    @Setter(AccessLevel.NONE)
    @JoinColumn(name = "course_code",referencedColumnName = "id",insertable = false,updatable = false)
    private Course course;


}

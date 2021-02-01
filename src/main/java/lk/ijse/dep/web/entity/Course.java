package lk.ijse.dep.web.entity;


import lk.ijse.dep.web.entity.util.Audience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="course")
public class Course {

    @Id
    private String code;
    private String description;
    private String duration;
    private Audience audience;

}

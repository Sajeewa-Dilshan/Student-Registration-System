package lk.ijse.dep.web.entity;

import lk.ijse.dep.web.entity.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "student")
public class Student  implements Serializable {
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private Gender gender;
    private String contact;
    private Date date;
    @Embedded
    private Address address;


}

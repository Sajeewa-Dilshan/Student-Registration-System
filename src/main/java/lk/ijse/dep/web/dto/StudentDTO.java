package lk.ijse.dep.web.dto;


import lk.ijse.dep.web.entity.Address;
import lk.ijse.dep.web.entity.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    private int id;
    private String name;
    private Gender gender;
    private String contact;
    private Date date;
    private Address address;
}

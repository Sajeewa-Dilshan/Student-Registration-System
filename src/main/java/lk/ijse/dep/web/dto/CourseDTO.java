package lk.ijse.dep.web.dto;

import lk.ijse.dep.web.entity.util.Audience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseDTO {
    private String code;
    private String description;
    private String duration;
    private Audience audience;
}

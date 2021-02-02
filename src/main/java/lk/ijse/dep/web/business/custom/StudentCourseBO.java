package lk.ijse.dep.web.business.custom;

import lk.ijse.dep.web.business.SuperBO;
import lk.ijse.dep.web.dto.StudentCourseDTO;
import lk.ijse.dep.web.dto.StudentDTO;

import java.util.List;


public interface StudentCourseBO extends SuperBO {

    public void registerCourse(StudentDTO studentDTO) throws Exception;

    public  void updateStudentCourse(StudentDTO studentDTO) throws  Exception;

    public  void  deleteStudentCourse(String StudentCourseId) throws Exception;

    public List<StudentCourseDTO> findAllCourses() throws Exception;


}

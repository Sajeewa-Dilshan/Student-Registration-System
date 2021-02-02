package lk.ijse.dep.web.business.custom;

import lk.ijse.dep.web.business.SuperBO;
import lk.ijse.dep.web.dto.CourseDTO;

import java.util.List;

public interface CourseBO  extends SuperBO {

    public void saveCourse(CourseDTO courseDTO) throws Exception;

    public  void updateCourse(CourseDTO courseDTO) throws  Exception;

    public  void  deleteCourse(String courseCode) throws Exception;

    public  List<CourseDTO> findAllCourses() throws Exception;







}

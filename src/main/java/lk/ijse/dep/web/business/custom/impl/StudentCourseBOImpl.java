package lk.ijse.dep.web.business.custom.impl;

import lk.ijse.dep.web.business.custom.StudentCourseBO;
import lk.ijse.dep.web.dto.StudentCourseDTO;
import lk.ijse.dep.web.dto.StudentDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentCourseBOImpl implements StudentCourseBO {


    @Override
    public void setEntityManager(EntityManager em) {

    }

    @Override
    public void registerCourse(StudentDTO studentDTO) throws Exception {

    }

    @Override
    public void updateStudentCourse(StudentDTO studentDTO) throws Exception {

    }

    @Override
    public void deleteStudentCourse(String StudentCourseId) throws Exception {

    }

    @Override
    public List<StudentCourseDTO> findAllCourses() throws Exception {
        return null;
    }
}

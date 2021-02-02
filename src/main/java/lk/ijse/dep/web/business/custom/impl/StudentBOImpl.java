package lk.ijse.dep.web.business.custom.impl;

import lk.ijse.dep.web.business.custom.StudentBO;
import lk.ijse.dep.web.dto.StudentDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class StudentBOImpl implements StudentBO {
    @Override
    public void setEntityManager(EntityManager em) {

    }

    @Override
    public void saveStudent(StudentDTO studentDTO) throws Exception {

    }

    @Override
    public void updateStudent(StudentDTO studentDTO) throws Exception {

    }

    @Override
    public void deleteStudent(String studentId) throws Exception {

    }

    @Override
    public List<StudentDTO> findAllCourses() throws Exception {
        return null;
    }
}

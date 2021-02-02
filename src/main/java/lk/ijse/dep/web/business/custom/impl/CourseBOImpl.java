package lk.ijse.dep.web.business.custom.impl;

import lk.ijse.dep.web.business.SuperBO;
import lk.ijse.dep.web.business.custom.CourseBO;
import lk.ijse.dep.web.dao.DAOFactory;
import lk.ijse.dep.web.dao.DAOTypes;
import lk.ijse.dep.web.dao.custom.CourseDAO;
import lk.ijse.dep.web.dto.CourseDTO;

import javax.persistence.EntityManager;
import java.util.List;

public class CourseBOImpl implements CourseBO {

    private final CourseDAO courseDAO;
    private EntityManager em;

    public CourseBOImpl() {
        courseDAO= DAOFactory.getInstance().getDAO(DAOTypes.COURSE);

    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em=em;

    }


    @Override
    public void saveCourse(CourseDTO courseDTO) throws Exception {

    }

    @Override
    public void updateCourse(CourseDTO courseDTO) throws Exception {

    }

    @Override
    public void deleteCourse(String courseCode) throws Exception {

    }

    @Override
    public List<CourseDTO> findAllCourses() throws Exception {
        return null;
    }
}

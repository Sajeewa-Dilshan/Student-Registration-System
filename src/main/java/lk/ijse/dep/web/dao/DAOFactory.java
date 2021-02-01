package lk.ijse.dep.web.dao;


import lk.ijse.dep.web.dao.custom.impl.CourseDAOImpl;
import lk.ijse.dep.web.dao.custom.impl.StudentCourseDAOImpl;
import lk.ijse.dep.web.dao.custom.impl.StudentDAOImpl;

public class DAOFactory {

    private static DAOFactory daoFactory;


    private DAOFactory(){}

    public <T extends SuperDAO> T getDAO(DAOTypes daoType){
        switch(daoType){

            case COURSE:
                return  (T) new CourseDAOImpl();
            case STUDENT:
                return (T) new StudentDAOImpl();
            case STUDENTCOURSE:
                return (T) new StudentCourseDAOImpl();
            default:
                return null;
        }

    }

    public static   DAOFactory getInstance(){
        return (daoFactory !=null)?daoFactory : (daoFactory = new DAOFactory());
    }



}

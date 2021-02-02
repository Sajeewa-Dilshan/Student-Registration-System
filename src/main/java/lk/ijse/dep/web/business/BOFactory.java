package lk.ijse.dep.web.business;


import lk.ijse.dep.web.business.custom.impl.CourseBOImpl;
import lk.ijse.dep.web.business.custom.impl.StudentBOImpl;
import lk.ijse.dep.web.business.custom.impl.StudentCourseBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    public static BOFactory getInstance(){
        return (boFactory!=null)?boFactory: (boFactory= new BOFactory());

    }

    private  BOFactory(){

    }

    public <T extends SuperBO > T getBO(BOTypes boTypes){

        switch (boTypes){
            case COURSE:
                return (T) new CourseBOImpl();
            case STUDENT:
                return  (T) new StudentBOImpl();
            case STUDENTCOURSE:
                return (T) new StudentCourseBOImpl();
            default:
                return null;


        }

    }





}

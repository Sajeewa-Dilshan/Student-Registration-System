package lk.ijse.dep.web.business;



public class BOFactory {

    private static BOFactory boFactory;

    public static BOFactory getInstance(){
        return (boFactory!=null)?boFactory: (boFactory= new BOFactory());

    }


    public String d="SDg";





}

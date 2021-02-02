package lk.ijse.dep.web.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public interface SuperDAO {
    void setEntityManager(EntityManager em);
}

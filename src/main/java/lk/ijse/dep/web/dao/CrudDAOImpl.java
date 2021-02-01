package lk.ijse.dep.web.dao;


import lk.ijse.dep.web.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public class CrudDAOImpl<T extends SuperEntity,PK extends Serializable> implements CrudDAO<T,PK> {


    @Override
    public void save(T entity) throws Exception {

    }

    @Override
    public void update(T entity) throws Exception {

    }

    @Override
    public void delete(PK key) throws Exception {

    }

    @Override
    public List<T> getAll() throws Exception {
        return null;
    }
}

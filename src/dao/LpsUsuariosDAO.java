package dao;

import bean.LpsUsuarios;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class LpsUsuariosDAO extends DAOAbstract {

    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
    }

    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LpsUsuarios.class);
        criteria.add(Restrictions.eq("idlps_usuarios", id));
        Object result = criteria.uniqueResult();
        session.getTransaction().commit();
        return result;
    }

    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LpsUsuarios.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}

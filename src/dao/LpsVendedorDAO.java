package DAO;

import bean.LpsVendedor;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class LpsVendedorDAO extends DAOAbstract {
    private Object session;

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

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

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LpsVendedor.class);
        criteria.add(Restrictions.eq("idlps_cod_vendedor", id));  // Ajuste o nome do campo conforme o mapeamento no banco
        Object result = criteria.uniqueResult();
        session.getTransaction().commit();
        return result;
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LpsVendedor.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}

package dao;

import HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class DAOAbstract {
    // Sessão do Hibernate para interagir com o banco de dados
    protected Session session;
    
    // Construtor que inicializa a sessão
    public DAOAbstract() {
        // Obtém a SessionFactory do HibernateUtil e cria uma nova sessão
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }
    
    // Método para fechar a sessão do Hibernate
    public void closeSession() {
        // Verifica se a sessão está aberta antes de fechar
        if (session != null && session.isOpen()) {
            session.close();
        }
    }
    
    // Método para inserir um objeto no banco de dados
    public void insert(Object object) {
        try {
            // Inicia uma transação para garantir a consistência dos dados
            session.beginTransaction();
            // Salva o objeto no banco de dados
            session.save(object);
            // Commit da transação para persistir as alterações
            session.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, imprime a exceção e faz rollback da transação
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            // Fecha a sessão após a operação
            closeSession();
        }
    }
    
    // Método para atualizar um objeto no banco de dados
    public void update(Object object) {
        try {
            // Inicia uma transação para garantir a consistência dos dados
            session.beginTransaction();
            // Atualiza o objeto no banco de dados
            session.update(object);
            // Commit da transação para persistir as alterações
            session.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, imprime a exceção e faz rollback da transação
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            // Fecha a sessão após a operação
            closeSession();
        }
    }
    
    // Método para excluir um objeto do banco de dados
    public void delete(Object object) {
        try {
            // Inicia uma transação para garantir a consistência dos dados
            session.beginTransaction();
            // Exclui o objeto do banco de dados
            session.delete(object);
            // Commit da transação para persistir as alterações
            session.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, imprime a exceção e faz rollback da transação
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            // Fecha a sessão após a operação
            closeSession();
        }
    }
    
    // Método para listar um objeto específico pelo ID
    public Object list(int id, Class<?> clazz) {
        Object result = null;
        try {
            // Inicia uma transação para garantir a consistência dos dados
            session.beginTransaction();
            // Obtém o objeto pelo ID, utilizando a classe especificada
            result = session.get(clazz, id);
            // Commit da transação
            session.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, imprime a exceção e faz rollback da transação
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            // Fecha a sessão após a operação
            closeSession();
        }
        return result;
    }
    
    // Método para listar todos os objetos de uma classe
    public Object listAll(Class<?> clazz) {
        Object result = null;
        try {
            // Inicia uma transação para garantir a consistência dos dados
            session.beginTransaction();
            // Cria uma lista com todos os objetos da classe especificada
            result = session.createCriteria(clazz).list();
            // Commit da transação
            session.getTransaction().commit();
        } catch (Exception e) {
            // Em caso de erro, imprime a exceção e faz rollback da transação
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            // Fecha a sessão após a operação
            closeSession();
        }
        return result;
    }
}

package lpostula.app.square.dao;

import java.io.*;
import java.util.*;

import org.hibernate.Query;
 
public interface GenericDAO<T, ID extends Serializable> {
 
    public void save(T entity);
 
    public void merge(T entity);
 
    public void delete(T entity);
 
    public List<T> findMany(Query query);
 
    public T findOne(Query query);
 
    @SuppressWarnings({ "rawtypes" })
    public List findAll(Class clazz);
 
    @SuppressWarnings("rawtypes")
    public T findByID(Class clazz, Integer id);
}
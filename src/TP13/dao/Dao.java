package TP13.dao;

import TP13.bean.Identifiable;
import java.util.List;

/**
 * Interface CRUD générique pour toute entité avec un ID.
 */
public interface Dao<T extends Identifiable> {
    void create(T obj);           // INSERT
    T update(T obj);              // UPDATE
    boolean delete(int id);       // DELETE
    T findById(int id);           // SELECT by ID
    List<T> findAll();            // SELECT all
}


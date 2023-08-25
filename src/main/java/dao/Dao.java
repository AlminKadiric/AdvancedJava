package dao;

//CRUD
//Create
//Retrieve
//Update
//Delete

import java.util.List;

public interface Dao<E> {

    void create(E entity);

    List<E> getAll();

    E get(Long primaryKey);

    E update(E entity);

    void delete(E entity);



}

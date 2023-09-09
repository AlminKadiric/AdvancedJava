package dao;

//CRUD
//Create
//Retrieve
//Update
//Delete

import java.sql.SQLException;
import java.util.List;

public interface Dao<E > {
    String URL = "jdbc:mysql://localhost:3306/my_first_db";
    String USERNAME = "root";
    String PASSWORD = "root";

    void create(E entity);

    List<E> getAll() ;

    E get(long primaryKey);

    E update(E entity);

    void delete(E entity);


}

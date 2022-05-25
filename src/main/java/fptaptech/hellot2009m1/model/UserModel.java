package fptaptech.hellot2009m1.model;

import fptaptech.hellot2009m1.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface UserModel {

    boolean save(User user) throws SQLException;
    boolean update(int id, User updateUser);
    boolean delete(int id);
    List<User> findAll();
    User findById(int id);
}

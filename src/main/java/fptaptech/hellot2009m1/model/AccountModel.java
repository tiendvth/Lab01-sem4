package fptaptech.hellot2009m1.model;

import fptaptech.hellot2009m1.entity.Account;
import fptaptech.hellot2009m1.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface AccountModel {
    boolean save(Account account) throws SQLException;
    boolean update(int id, User updateAccount);
    boolean delete(int id);
    List<Account> findAll();
    Account findById(int id);
}

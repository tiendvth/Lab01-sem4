package fptaptech.hellot2009m1.model;

import fptaptech.hellot2009m1.entity.Account;
import fptaptech.hellot2009m1.entity.User;
import fptaptech.hellot2009m1.util.AccountConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlAccountModel implements AccountModel{


    @Override
    public boolean save(Account account) throws SQLException {

        Connection connection = AccountConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement("insert into accounts (username, email, password, fullName, phone, birthday) values (?,?,?,?,?,?)");
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getEmail());
            preparedStatement.setString(3, account.getPassword());
            preparedStatement.
            setString(4, account.getFullName());
            preparedStatement.setString(5, account.getPhone());
            preparedStatement.setString(6, account.getBirthday());
            //            preparedStatement.setInt(3, account.getStatus());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        return false;
    }

    @Override
    public boolean update(int id, User updateAccount) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(int id) {
        return null;
    }
}

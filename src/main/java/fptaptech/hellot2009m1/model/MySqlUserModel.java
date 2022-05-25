package fptaptech.hellot2009m1.model;

import fptaptech.hellot2009m1.entity.User;
import fptaptech.hellot2009m1.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySqlUserModel implements UserModel{


    @Override
    public boolean save(User user) throws SQLException {
        Connection connection = ConnectionHelper.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into users (username, passwordHash, status) values (?,?,?)");
        preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2, user.getPasswordHash());
        preparedStatement.setInt(3,user.getStatus());
        preparedStatement.execute();

        return  true;


    }

    @Override
    public boolean update(int id, User updateUser) {
        Connection connection = ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update users set username = ?, passwordHash = ?, status = ? where id = ? ");
            preparedStatement.setString(1,updateUser.getUsername());
            preparedStatement.setString(2, updateUser.getPasswordHash());
            preparedStatement.setInt(3,updateUser.getStatus());
            preparedStatement.setInt(4, id);
            preparedStatement.execute();

            return  true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        Connection connection = ConnectionHelper.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("update users set status = ?  where id = ? ");
            preparedStatement.setInt(1,-1);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();

            return  true;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }
}

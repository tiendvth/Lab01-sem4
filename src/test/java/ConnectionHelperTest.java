import fptaptech.hellot2009m1.entity.User;
import fptaptech.hellot2009m1.util.ConnectionHelper;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionHelperTest {

    @Test
    public void  test() {
        try {
            Connection connection = ConnectionHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("sellect * from users where ?,?,?");
            preparedStatement.setInt(1,1);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> users = new  ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String passwordHash = resultSet.getString("passwordHash");
                int status  = resultSet.getInt("status");

                User user = new User(id, username, passwordHash,status);
                users.add(user);
            }
            for (User user : users) {
                System.out.println(user.toString());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

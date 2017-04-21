package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sieun on 2017. 4. 22..
 */
public class DeleteStatementStrategy implements StatementStrategy {
    @Override
    public PreparedStatement makeStatement(Object object, Connection connection) throws SQLException {


             PreparedStatement preparedStatement;
        preparedStatement = connection.prepareStatement("delete from product where id = ?");
        preparedStatement.setLong(1, (long)object);
        return preparedStatement;
    }
}

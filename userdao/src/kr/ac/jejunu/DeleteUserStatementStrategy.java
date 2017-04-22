package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sieun on 2017. 4. 22..
 */
public class DeleteUserStatementStrategy implements StatementStrategy {

    private long id;

    public DeleteUserStatementStrategy(Long id) {
        this.id = id;
    }

    @Override
    public PreparedStatement makeStatement(Connection connection) throws SQLException {


             PreparedStatement preparedStatement;
        preparedStatement = connection.prepareStatement("delete from product where id = ?");
        preparedStatement.setLong(1, id);
        return preparedStatement;
    }
}

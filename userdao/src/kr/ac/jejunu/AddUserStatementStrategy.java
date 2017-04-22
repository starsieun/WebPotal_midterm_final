package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by sieun on 2017. 4. 22..
 */
public class AddUserStatementStrategy implements StatementStrategy {

    private Product product;

    public AddUserStatementStrategy(Product product) {
        this.product = product;
    }

    @Override
    public PreparedStatement makeStatement(Connection connection) throws SQLException {
        PreparedStatement preparedStatement;
             preparedStatement = connection.prepareStatement("insert into product(id, title, price) VALUE (?, ?, ?)");

             preparedStatement.setLong(1, product.getId());
            preparedStatement.setString(2, product.getTitle());
            preparedStatement.setInt(3, product.getPrice());
        return preparedStatement;
    }
}

package kr.ac.jejunu;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {

    private JdbcContext jdbcContext;

    public ProductDao(){

    }


    public Product get(Long id) throws SQLException {

        StatementStrategy statementStrategy = connection ->{

            PreparedStatement preparedStatement = connection.prepareStatement("select * from product where id = ?");

            preparedStatement.setLong(1, id);

            return preparedStatement;
        };

        return jdbcContext.jdbcContextWithStatementStrategyForQuery(id);
    }

    public void add(Product product) throws SQLException {



        StatementStrategy statementStrategy = connection ->{

            PreparedStatement preparedStatement = connection.prepareStatement("insert into product(id, title, price) VALUE (?, ?, ?)");

            preparedStatement.setLong(1, product.getId());
            preparedStatement.setString(2, product.getTitle());
            preparedStatement.setInt(3, product.getPrice());
            return preparedStatement;
        };
        jdbcContext.jdbcContextWithStatementStrategyForUpdate(statementStrategy);

    }

    public void delete(Long id) throws SQLException {

        StatementStrategy statementStrategy = connection ->{

            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement("delete from product where id = ?");
            preparedStatement.setLong(1, id);
            return preparedStatement;
        };

        jdbcContext.jdbcContextWithStatementStrategyForUpdate(statementStrategy);
    }


    public void setJdbcContext(JdbcContext jdbcContext) {
        this.jdbcContext = jdbcContext;
    }

    public JdbcContext getJdbcContext() {
        return jdbcContext;
    }
}

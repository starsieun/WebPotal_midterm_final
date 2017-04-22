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

        StatementStrategy statementStrategy = new GetUserStatementStrategy(id);

        return jdbcContext.jdbcContextWithStatementStrategyForQuery(id);
    }

    public void add(Product product) throws SQLException {

        StatementStrategy statementStrategy = new AddUserStatementStrategy(product);

        jdbcContext.jdbcContextWithStatementStrategyForUpdate(statementStrategy);


    }

    public void delete(Long id) throws SQLException {

        StatementStrategy statementStrategy = new DeleteUserStatementStrategy(id);

        jdbcContext.jdbcContextWithStatementStrategyForUpdate(statementStrategy);
    }


    public void setJdbcContext(JdbcContext jdbcContext) {
        this.jdbcContext = jdbcContext;
    }

    public JdbcContext getJdbcContext() {
        return jdbcContext;
    }
}

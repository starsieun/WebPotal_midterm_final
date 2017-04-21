package kr.ac.jejunu;

import com.mysql.jdbc.Driver;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sieun on 2017. 4. 21..
 */
public class JejuConnectionMaker extends SimpleDriverDataSource{

    public JejuConnectionMaker(){
        this.setDriverClass(Driver.class);
        this.setUrl("jdbc:mysql://117.17.102.106/jeju");
        this.setUsername("root");
        this.setPassword("1234");
    }



}

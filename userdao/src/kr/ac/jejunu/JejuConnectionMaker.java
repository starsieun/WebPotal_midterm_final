package kr.ac.jejunu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sieun on 2017. 4. 21..
 */
public class JejuConnectionMaker implements ConnectionMaker {


    String url;
    String id;
    String password;
    String getName;



    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(getName);
        return DriverManager.getConnection(url, id, password);
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

}

package kr.ac.jejunu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sieun on 2017. 4. 21..
 */

@Configuration
public class DaoFactory {

    @Bean
    public ProductDao productDao() {
        return new ProductDao(ConnectionMaker());
    }

    @Bean
    public JejuConnectionMaker ConnectionMaker() {
        return new JejuConnectionMaker();
    }
}

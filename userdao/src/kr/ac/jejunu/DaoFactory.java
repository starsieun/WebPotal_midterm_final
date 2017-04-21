package kr.ac.jejunu;

/**
 * Created by sieun on 2017. 4. 21..
 */
public class DaoFactory {

    public ProductDao getProductDao() {
        return new ProductDao(getConnectionMaker());
    }

    private JejuConnectionMaker getConnectionMaker() {
        return new JejuConnectionMaker();
    }
}

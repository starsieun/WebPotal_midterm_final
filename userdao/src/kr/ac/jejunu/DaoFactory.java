package kr.ac.jejunu;

/**
 * Created by sieun on 2017. 4. 21..
 */
public class DaoFactory {

    public ProductDao getUserDao() {
        return new ProductDao(new JejuConnectionMaker());
    }
}

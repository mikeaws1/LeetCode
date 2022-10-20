package de.leetcode.romantoint;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class DatabaseDataProvider implements DataProvider{

    private final String jdbcURL;

    private final String userName;

    private final String password;

    private final Configuration config;

    public DatabaseDataProvider(String jdbcURL, String userName, String password) {
        this.jdbcURL = jdbcURL;
        this.userName = userName;
        this.password = password;
        this.config = init();
    }


    private Configuration init() {
        Configuration config = new Configuration();

        config.setProperty(HibernateProperties.DB_USER_PROPERTY, userName);
        config.setProperty(HibernateProperties.DB_PASS_PROPERTY, password);
        config.setProperty(HibernateProperties.DB_URL_PROPERTY, jdbcURL);
        config.setProperty(HibernateProperties.DRIVER_CLASS_PROPERTY, HibernateProperties.DB_DRIVER);
        config.setProperty(HibernateProperties.DB_DIALECT_PROPERTY, HibernateProperties.DB_DIALECT);
        config.addClass(RomanIntsEntity.class);

        return config;
    }


    @Override
    public List<String> getDataBatch() {
        List<String> data = new ArrayList<>();

        try (SessionFactory factory = config.buildSessionFactory(); Session session = factory.openSession()) {

            for (int i = 0; i < FileDataProvider.MAX_DATA; i++) {
                RomanIntsEntity entity = session.get(RomanIntsEntity.class, i);
                data.add(entity.getValue());
            }
        }
        catch (Exception ex) {
        }

        return data;
    }
}

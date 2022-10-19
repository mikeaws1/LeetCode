package de.leetcode.romantoint;

import java.util.List;

public class DatabaseDataProvider implements DataProvider{

    private final String jdbcURL;

    private final String userName;

    private final String password;

    public DatabaseDataProvider(String jdbcURL, String userName, String password) {
        this.jdbcURL = jdbcURL;
        this.userName = userName;
        this.password = password;
    }




    @Override
    public List<String> getDataBatch() {
        return null;
    }
}

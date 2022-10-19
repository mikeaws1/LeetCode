package de.leetcode.romantoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class FileDataProvider implements DataProvider {

    private final String path;

    private FileInputStream fileInputStream;

    public FileDataProvider(String path) throws FileNotFoundException {
        this.path = path;
        fileInputStream = new FileInputStream(path);
    }



    @Override
    public List<String> getDataBatch() {
        return null;
    }

}

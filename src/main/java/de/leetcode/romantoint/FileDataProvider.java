package de.leetcode.romantoint;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class FileDataProvider implements DataProvider {

    public static final int MAX_DATA = 10;
    private final BufferedReader fileInputStream;

    public FileDataProvider(String path) throws FileNotFoundException {
        fileInputStream = new BufferedReader(new FileReader(path));
    }



    @Override
    public List<String> getDataBatch() {
        List<String> data = new ArrayList<>();

        for (int i = 0; i < MAX_DATA; i++) {
            try {
               data.add(fileInputStream.readLine());
            }
            catch (IOException ex) {
                break;
            }
        }

        return data;
    }

}

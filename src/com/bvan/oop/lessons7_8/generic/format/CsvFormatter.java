package com.bvan.oop.lessons7_8.generic.format;

import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class CsvFormatter<T extends Formattable> implements Formatter<T> {

    private final String delimiter;

    public CsvFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvFormatter() {
        this(",");
    }

    @Override
    public String format(T value) {
        List<String> fields = value.getFields();

        StringJoiner joiner = new StringJoiner(delimiter);
        for (String field : fields) {
            joiner.add(field);
        }
        return joiner.toString();
    }
}

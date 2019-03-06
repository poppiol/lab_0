package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    ArrayList<String> list = new ArrayList<>();

    public List<String> tails(String value) {
        if (value == null) {
            return list;
        } else {
            for (int i = 0; i < value.length()+1; i++) {
                list.add(value.substring(i));
            }
            return list;
        }
    }
}


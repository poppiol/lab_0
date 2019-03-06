package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> list = new ArrayList<>();
        if (value == null) {
            return Collections.emptyList();
        } else {
            for (int i = 0; i < value.length()+1; i++) {
                list.add(value.substring(i));
            }
            return list;
        }
    }
}


package com.company;

import java.io.Serializable;
import java.util.*;

public class setGetDeneme implements Serializable {

    private List<String> stringList=new ArrayList<>();

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}

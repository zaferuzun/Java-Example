package com.company;

import java.util.ArrayList;
import java.util.List;

public class setGetDenemeService {
    private setGetDeneme setgetDenemeObject =new setGetDeneme();

    public void setObjectDeneme(){
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        setgetDenemeObject.setStringList(list);
        for (String setgetDeneme:setgetDenemeObject.getStringList()
             ) {
            System.out.println(setgetDeneme);
        }
    }
    public void getObjectDeneme(){
        //tek eleman
//        setgetDenemeObject.getStringList().add("dasdas");

        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("axsaxasxasf");
        list.add("axsaxasxasf2");
        setgetDenemeObject.getStringList().addAll(list);
        for (String setgetDeneme:setgetDenemeObject.getStringList()
        ) {
            System.out.println(setgetDeneme);
        }
    }

}

package com.dwogus6893.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasInfor {
    // function만듬
    public HashMap<String,String> getSearchDate(){
        HashMap<String, String> searchForm = new HashMap<String,String>();
        searchForm.put("search_key","search Title");
        searchForm.put("name","요주의랩!");
        searchForm.put("id","ID0001");
        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");
        return tablesListWithString ;
    }
}

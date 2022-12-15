package com.dwogus6893.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

public class DatasInfo {
    public HashMap<String,String> getSearchFormData(){
        HashMap<String, String> searchForm = new HashMap<String,String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name","이재현");
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

    public HashMap<String, Object> getBundleData(){
        
        DatasInfo datasInfo = new DatasInfo();
        HashMap<String, String> searchForm = datasInfo.getSearchFormData();
        ArrayList<String> tablesListWithString = datasInfo.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm",searchForm);
        bundlesData.put("tablesListWithString",tablesListWithString);
        return bundlesData;
    }

}

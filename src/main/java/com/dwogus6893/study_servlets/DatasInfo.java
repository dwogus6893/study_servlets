package com.dwogus6893.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.dwogus6893.study_servlets.beans.MemberBean;

public class DatasInfo {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key","Search Title");
        searchForm.put("name","이재현");
        searchForm.put("id","ID0001");
        return searchForm;
    }

    public ArrayList<String> getTableListWithString() {
        ArrayList<String> tableListWithString = new ArrayList<String>();
        tableListWithString.add("@mdo");
        tableListWithString.add("@fat");
        tableListWithString.add("@twitter");
        return tableListWithString;
    }

    public HashMap<String, Object> getBundleData() {

        DatasInfo datasInfo = new DatasInfo();
        HashMap<String, String> searchForm = datasInfo.getSearchFormData();
        ArrayList<String> tablesListWithString = datasInfo.getTableListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        bundlesData.put("dataWithMemberBean", datasInfo.getDataWithMemberBean());
        bundlesData.put("dataListWithMemberBean", datasInfo.getDataListWithMemberBean());

        return bundlesData;
    }

    public MemberBean getDataWithMemberBean() {
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark-2022");
        memberBean.setSecondName("otto-2022");
        memberBean.setHandleName("@mdo-2022");

        return memberBean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean(){
        ArrayList<MemberBean> membersList = new ArrayList<>();
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark1");
        memberBean.setSecondName("otto1");
        memberBean.setHandleName("@mdo1");
        membersList.add(memberBean);

        MemberBean memberBean02 = new MemberBean();
        memberBean02.setFirstName("Mark2");
        memberBean02.setSecondName("otto2");
        memberBean02.setHandleName("@mdo2");
        membersList.add(memberBean02);

        MemberBean memberBean03 = new MemberBean();
        memberBean03.setFirstName("Mark3");
        memberBean03.setSecondName("otto3");
        memberBean03.setHandleName("@mdo3");
        membersList.add(memberBean03);
        return membersList;    
    }
   
}
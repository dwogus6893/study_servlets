package com.dwogus6893.study_servlets;

import java.util.ArrayList;
import java.util.HashMap;

import com.dwogus6893.study_servlets.beans.MemberBean;

public class DatasInfo {
    //데이터 넣어줌
    public HashMap<String, String> getSearchFormData1() {
        HashMap<String, String> searchForm1 = new HashMap<String, String>();
        searchForm1.put("question1", "해당 매장을 방문시 매장은 청결 하였습니까?");
        searchForm1.put("questions_uid1", "Q1");
        searchForm1.put("order1", "1");
        return searchForm1;
    }
    System.out.println(getKey(searchForm1,"question1"));

    public HashMap<String, String> getSearchFormData2() {
        HashMap<String, String> searchForm2 = new HashMap<String, String>();
        searchForm2.put("question2", "주문시 직원은 고객님께 친절 하였습니까?");
        searchForm2.put("questions_uid2", "Q2");
        searchForm2.put("order2", "2");
        return searchForm2;
    }

    public HashMap<String, String> getSearchFormData3() {
        HashMap<String, String> searchForm3 = new HashMap<String, String>();
        searchForm3.put("question3", "주문하신 음료가 나오기까지 시간이 적당하였습니까?");
        searchForm3.put("questions_uid3", "Q3");
        searchForm3.put("order3", "3");
        return searchForm3;
    }

    public HashMap<String, String> getSearchFormData4() {
        HashMap<String, String> searchForm4 = new HashMap<String, String>();
        searchForm4.put("question4", "해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");
        searchForm4.put("questions_uid4", "Q4");
        searchForm4.put("order4", "4");
        return searchForm4;
    }

    public HashMap<String, String> getSearchFormData5() {
        HashMap<String, String> searchForm5 = new HashMap<String, String>();
        searchForm5.put("question5", "직원이 제조한 음료에 대해 맛은 좋았습니까?");
        searchForm5.put("questions_uid5", "Q5");
        searchForm5.put("order5", "5");
        return searchForm5;
    }

    public HashMap<String, String> getAnswerFormData() {
        HashMap<String, String> AnswerFormData = new HashMap<String, String>();
        AnswerFormData.put("answer_uid1", "전혀 아니다");
        AnswerFormData.put("answer_uid2", "아니다");
        AnswerFormData.put("answer_uid3", "보통이다");
        AnswerFormData.put("answer_uid4", "그렇다");
        AnswerFormData.put("answer_uid5", "매우 그렇다");
        return AnswerFormData;
    }

    
}
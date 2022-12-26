package com.dwogus6893.study_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PollWithDB {
    public void getAnswer(String questionsUid){
        // SELECT ANSWERS.QUESTIONS_UID, EXAMPLE_LIST.ORDERS, EXAMPLE_LIST.EXAMPLE 
        // FROM ANSWERS 
	    // INNER JOIN EXAMPLE_LIST 
	    // ON ANSWERS.EXAMPLE_UID = EXAMPLE_LIST.EXAMPLE_UID 
	    // WHERE QUESTIONS_UID = 'Q1'
        // ORDER BY QUESTIONS_UID;
        return 0;

    }
    public HashMap<String, Object> getQuestion(String questionsUid) throws SQLException{

        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM QUESTIONS_LIST " +
                        " WHERE QUESTIONS_UID = '"+questionsUid+"'";
        
        ResultSet resultSet = statement.executeQuery(query);
        HashMap<String, Object> result = null;
        while(resultSet.next()){
            result = new HashMap<>();
            result.put("QUESTIONS_UID",resultSet.getString("QUESTIONS_UID"));
            result.put("QUESTIONS", resultSet.getString("QUESTIONS"));
            result.put("ORDERS",resultSet.getInt("ORDERS"));
        }

        return result;
    }
}
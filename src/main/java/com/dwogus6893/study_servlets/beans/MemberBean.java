package com.dwogus6893.study_servlets.beans;

public class MemberBean {
    protected String firstName;
    protected String secondName;
    protected String handleName;

    //외부에서 접근하는 function, 값을 가져오는 get
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getHandleName(){
        return this.handleName;
    }

    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public void setHandleName(String handleName){
        this.handleName = handleName;
    }

}

package com.dwogus6893.study_servlets.beans;

public class MemberBean {
    protected String question;
    protected String questions_uid;
    protected String order;

    //외부에서 접근하는 function, 값을 가져오는 get
    
    public MemberBean() {

    }

    public String getQuestion(){
        return this.question;
    }
    public String Questions_uid(){
        return this.questions_uid;
    }
    public String getOrder(){
        return this.order;
    }

    
    public void setQuestion(String question){
        this.question = question;
    }

    public void setQuestions_uid(String questions_uid){
        this.questions_uid = questions_uid;
    }

    public void setOrder(String order){
        this.order = order;
    }

}

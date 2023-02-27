package com.product.entity.Hibernate_Mappings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer1 {
	@Id
private int id;
private String answer;


@OneToOne(mappedBy="ans")
private Question1 q;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getAnswer() {
	return answer;
}


public void setAnswer(String answer) {
	this.answer = answer;
}


public Question1 getQ() {
	return q;
}


public void setQ(Question1 q) {
	this.q = q;
}


public Answer1(int id, String answer, Question1 q) {
	super();
	this.id = id;
	this.answer = answer;
	this.q = q;
}


public Answer1() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public String toString() {
	return "Answer1 [id=" + id + ", answer=" + answer + ", q=" + q + "]";
}


	
}

package com.product.entity.Hibernate_Mappings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question1 {
	@Id
private int id;
private String Question1;

@OneToOne
private Answer1 ans;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getQuestion1() {
	return Question1;
}

public void setQuestion1(String question1) {
	Question1 = question1;
}

public Answer1 getAns() {
	return ans;
}

public void setAns(Answer1 ans) {
	this.ans = ans;
}

public Question1(int id, String question1, Answer1 ans) {
	super();
	this.id = id;
	Question1 = question1;
	this.ans = ans;
}

public Question1() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Question1 [id=" + id + ", Question1=" + Question1 + ", ans=" + ans + "]";
}


}

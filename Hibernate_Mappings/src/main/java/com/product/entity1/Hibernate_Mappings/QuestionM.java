package com.product.entity1.Hibernate_Mappings;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionM {
@Id
	private int id;
	private String question;
	@OneToMany(mappedBy="q")
	private List<AnswerM> ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerM> getAns() {
		return ans;
	}
	public void setAns(List<AnswerM> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "QuestionM [id=" + id + ", question=" + question + ", ans=" + ans + "]";
	}
	
	
}

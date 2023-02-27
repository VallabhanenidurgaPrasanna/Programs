package com.product.entity1.Hibernate_Mappings;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerM {
@Id
	private int id;
	private String answer;
	
	@ManyToOne
	private QuestionM q;

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

	public QuestionM getQ() {
		return q;
	}

	public void setQ(QuestionM q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "AnswerM [id=" + id + ", answer=" + answer + ", q=" + q + "]";
	}
	
}

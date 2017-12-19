package com.lq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SJZB_JFGL")
public class SjzbJfgl {
	@Id
	@GeneratedValue(generator = "jfgl_Jfdj")
	@GenericGenerator(name = "jfgl_Jfdj", strategy = "identity")
	private Integer jfdj;
	
	@Column()
	private Integer djlc;

	@Column()
	private Integer dwjf;

	public Integer getJfdj() {
		return jfdj;
	}

	public void setJfdj(int jfdj) {
		this.jfdj = jfdj;
	}

	public Integer getDjlc() {
		return djlc;
	}

	public void setDjlc(int djlc) {
		this.djlc = djlc;
	}

	public Integer getDwjf() {
		return dwjf;
	}

	public void setDwjf(int dwjf) {
		this.dwjf = dwjf;
	}
	
	
}

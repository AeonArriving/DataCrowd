package com.lq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SJZB_SJCCZLJ")
public class SjzbSjcczlj {
	@Id
	@GeneratedValue(generator = "sjzb_sjcczlj_id")
	@GenericGenerator(name = "sjzb_sjcczlj_id", strategy = "identity")
	private int id;
	
	@Column()
	private String cczlj;
	
	@Column()
	private Integer cjsjsjjg;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCczlj() {
		return cczlj;
	}

	public void setCczlj(String cczlj) {
		this.cczlj = cczlj;
	}

	public Integer getCjsjsjjg() {
		return cjsjsjjg;
	}

	public void setCjsjsjjg(Integer cjsjsjjg) {
		this.cjsjsjjg = cjsjsjjg;
	}
	
	
}

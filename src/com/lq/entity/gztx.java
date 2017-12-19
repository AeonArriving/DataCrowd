package com.lq.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "GZTX")
public class gztx {
	@Id
	@GeneratedValue(generator = "gztx")
	@GenericGenerator(name = "gztx", strategy = "identity")
	private int id;
	
	@Column()
	private String bt;

	@Column()
	private String nr;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date ksrq;

	@Column()
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date jsrq;
	
	@Column()
	private String yxbz;

	@Column()
	private String txyhlx;
	
	@Column()
	private int txyhid;
	
	@Column()
	private String fbrid;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date fbsj;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBt() {
		return bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public Date getKsrq() {
		return ksrq;
	}

	public void setKsrq(Date ksrq) {
		this.ksrq = ksrq;
	}

	public Date getJsrq() {
		return jsrq;
	}

	public void setJsrq(Date jsrq) {
		this.jsrq = jsrq;
	}

	public String getYxbz() {
		return yxbz;
	}

	public void setYxbz(String yxBz) {
		this.yxbz = yxBz;
	}

	public String getTxyhlx() {
		return txyhlx;
	}

	public void setTxyhlx(String txyhlx) {
		this.txyhlx = txyhlx;
	}

	public int getTxyhid() {
		return txyhid;
	}

	public void setTxyhid(int txyhid) {
		this.txyhid = txyhid;
	}

	public String getFbrid() {
		return fbrid;
	}

	public void setFbrid(String fbrid) {
		this.fbrid = fbrid;
	}

	public Date getFbsj() {
		return fbsj;
	}

	public void setFbsj(Date fbsj) {
		this.fbsj = fbsj;
	}
	
	
}

package com.lq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SJZB_SCSJYHGL")
public class SjzbScsjyhgl {

	@Id
	@GeneratedValue(generator = "sjzb_scsjyhgl_Yhid")
	@GenericGenerator(name = "sjzb_scsjyhgl_Yhid", strategy = "identity")
	private Integer Yhid;
	
	@Column()
	private String Yhm;

	@Column()
	private String Mm;
	
	@Column()
	private String Sj;

	@Column()
	private String Yx;
	
	@Column()
	private int dj;
	
	@Column()
	private String Zcfs;

	@Column()
	private int Jf;
	
	@Column()
	private int yxspsl;

	@Column()
	private float Pjsd;
	
	@Column()
	private float Zlc;

	@Column()
	private float Pjlc;

	public String getSj() {
		return Sj;
	}

	public void setSj(String sj) {
		this.Sj = sj;
	}

	public String getYx() {
		return Yx;
	}

	public void setYx(String yx) {
		this.Yx = yx;
	}

	public String getZcfs() {
		return Zcfs;
	}

	public void setZcfs(String zcfs) {
		this.Zcfs = zcfs;
	}

	public Integer getYhid() {
		return Yhid;
	}

	public void setYhid(Integer yhid) {
		this.Yhid = yhid;
	}

	public String getYhm() {
		return Yhm;
	}

	public void setYhm(String yhm) {
		this.Yhm = yhm;
	}

	public String getMm() {
		return Mm;
	}

	public void setMm(String mm) {
		this.Mm = mm;
	}

	public int getDj() {
		return dj;
	}

	public void setDj(int dj) {
		this.dj = dj;
	}

	public int getJf() {
		return Jf;
	}

	public void setJf(int jf) {
		this.Jf = jf;
	}

	public int getYxspsl() {
		return yxspsl;
	}

	public void setYxspsl(int yxspsl) {
		this.yxspsl = yxspsl;
	}

	public float getPjsd() {
		return Pjsd;
	}

	public void setPjsd(float pjsd) {
		this.Pjsd = pjsd;
	}

	public float getZlc() {
		return Zlc;
	}

	public void setZlc(float zlc) {
		this.Zlc = zlc;
	}

	public float getPjlc() {
		return Pjlc;
	}

	public void setPjlc(float pjlc) {
		this.Pjlc = pjlc;
	}
	
	
}

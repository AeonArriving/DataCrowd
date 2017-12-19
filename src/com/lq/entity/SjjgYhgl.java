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
@Table(name = "SJJG_YHGL")
public class SjjgYhgl {

	@Id
	@GeneratedValue(generator = "sjjg_Yhid")
	@GenericGenerator(name = "sjjg_Yhid", strategy = "identity")
	private int Yhid;
	
	@Column()
	private String Yhm;

	@Column()
	private String Mm;
	
	@Column()
	private String sj;

	@Column()
	private String Yx;
	
	@Column()
	private int dj;

	@Column()
	private String gs;
	
	@Column()
	private String Dz;

	@Column()
	private String Lxdh;
	
	@Column()
	private String Yhms;

	@Column()
	private String Qx;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date Cjrq;

	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date Sxrq;
	
	@Column()
	private String Zt;

	@Column()
	private String Bz;

	
	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
	}

	public String getYx() {
		return Yx;
	}

	public void setYx(String yx) {
		Yx = yx;
	}

	public int getYhid() {
		return Yhid;
	}

	public void setYhid(int yhid) {
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

	public String getGs() {
		return gs;
	}

	public void setGs(String gs) {
		this.gs = gs;
	}

	public String getDz() {
		return Dz;
	}

	public void setDz(String dz) {
		this.Dz = dz;
	}

	public String getLxdh() {
		return Lxdh;
	}

	public void setLxdh(String lxdh) {
		this.Lxdh = lxdh;
	}

	public String getYhms() {
		return Yhms;
	}

	public void setYhms(String yhms) {
		this.Yhms = yhms;
	}

	public String getQx() {
		return Qx;
	}

	public void setQx(String qx) {
		this.Qx = qx;
	}

	public Date getCjrq() {
		return Cjrq;
	}
	
	public void setCjrq(Date cjrq) {
		this.Cjrq = cjrq;
	}

	public Date getSxrq() {
		return Sxrq;
	}

	public void setSxrq(Date sxrq) {
		this.Sxrq = sxrq;
	}

	public String getZt() {
		return Zt;
	}

	public void setZt(String zt) {
		this.Zt = zt;
	}

	public String getBz() {
		return Bz;
	}

	public void setBz(String bz) {
		this.Bz = bz;
	}
	
	
}

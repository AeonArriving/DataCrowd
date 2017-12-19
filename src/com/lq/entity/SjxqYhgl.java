package com.lq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SJXQ_YHGL")
public class SjxqYhgl {
	@Id
	@GeneratedValue(generator = "sjxq_Yhid")
	@GenericGenerator(name = "sjxq_Yhid", strategy = "identity")
	private Integer Yhid;
	
	@Column()
	private String Yhm;

	@Column()
	private String Mm;
	
	@Column()
	private String sj="1";

	@Column()
	private String gs="1";
	
	@Column()
	private String Dz="1";
	
	@Column()
	private String Lxdh="1";
	
	@Column()
	private String Yx="1";
	
	@Column()
	private String Yhms="1";

	@Column()
	private String Qx="1";
	
	@Column()
	private String Zt="1";

	@Column()
	private String Bz="1";

	public int getYhid() {
		return Yhid;
	}

	public void setYhid(int yhid) {
		Yhid = yhid;
	}

	public String getYhm() {
		return Yhm;
	}

	public void setYhm(String yhm) {
		Yhm = yhm;
	}

	public String getMm() {
		return Mm;
	}

	public void setMm(String mm) {
		Mm = mm;
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj;
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
		Dz = dz;
	}

	public String getLxdh() {
		return Lxdh;
	}

	public void setLxdh(String lxdh) {
		Lxdh = lxdh;
	}

	public String getYx() {
		return Yx;
	}

	public void setYx(String yx) {
		Yx = yx;
	}

	public String getYhms() {
		return Yhms;
	}

	public void setYhms(String yhms) {
		Yhms = yhms;
	}

	public String getQx() {
		return Qx;
	}

	public void setQx(String qx) {
		Qx = qx;
	}

	public String getZt() {
		return Zt;
	}

	public void setZt(String zt) {
		Zt = zt;
	}

	public String getBz() {
		return Bz;
	}

	public void setBz(String bz) {
		Bz = bz;
	}
	
	
}

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
@Table(name = "SJZB_SCSJXX")
public class SjzbScsjxx {
	@Id
	@GeneratedValue(generator = "scsjxx_id")
	@GenericGenerator(name = "scsjxx_id", strategy = "identity")
	private int id;
	
	@Column()
	private String wjm;
	
	@Column()
	private String cclj;
	
	@Column()
	private String wjlx;
	
	@Column()
	private String scbz;
	
	@Column()
	private String sjwjm;
	
	@Column()
	private String sjwjscbz;
	
	@Column()
	private String scyh;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date scsj;
	
	@Column()
	private String scfs;
	
	@Column()
	private long sc;
	
	@Column()
	private float lc;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date pssj;
	
	@Column()
	private String cfdd;
	
	@Column()
	private String jsdd;
	
	@Column()
	private String slt;
	
	@Column()
	private float hdjf;
	
	@Column()
	private String bz;
	
	@Column()
	private String sfyx;
	
	@Column()
	private String zljc;
	
	@Column()
	private Integer zljcrwid;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date zljcrq;
	
	@Column()
	private String hash;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWjm() {
		return wjm;
	}

	public void setWjm(String wjm) {
		this.wjm = wjm;
	}

	public String getCclj() {
		return cclj;
	}

	public void setCclj(String cclj) {
		this.cclj = cclj;
	}

	public String getWjlx() {
		return wjlx;
	}

	public void setWjlx(String wjlx) {
		this.wjlx = wjlx;
	}

	public String getScbz() {
		return scbz;
	}

	public void setScbz(String scbz) {
		this.scbz = scbz;
	}

	public String getSjwjm() {
		return sjwjm;
	}

	public void setSjwjm(String sjwjm) {
		this.sjwjm = sjwjm;
	}

	public String getSjwjscbz() {
		return sjwjscbz;
	}

	public void setSjwjscbz(String sjwjscbz) {
		this.sjwjscbz = sjwjscbz;
	}

	public String getScyh() {
		return scyh;
	}

	public void setScyh(String scyh) {
		this.scyh = scyh;
	}

	public Date getScsj() {
		return scsj;
	}

	public void setScsj(Date scsj) {
		this.scsj = scsj;
	}

	public String getScfs() {
		return scfs;
	}

	public void setScfs(String scfs) {
		this.scfs = scfs;
	}

	public long getSc() {
		return sc;
	}

	public void setSc(long sc) {
		this.sc = sc;
	}

	public float getLc() {
		return lc;
	}

	public void setLc(float lc) {
		this.lc = lc;
	}

	public Date getPssj() {
		return pssj;
	}

	public void setPssj(Date pssj) {
		this.pssj = pssj;
	}

	public String getCfdd() {
		return cfdd;
	}

	public void setCfdd(String cfdd) {
		this.cfdd = cfdd;
	}

	public String getJsdd() {
		return jsdd;
	}

	public void setJsdd(String jsdd) {
		this.jsdd = jsdd;
	}

	public String getSlt() {
		return slt;
	}

	public void setSlt(String slt) {
		this.slt = slt;
	}

	public float getHdjf() {
		return hdjf;
	}

	public void setHdjf(float hdjf) {
		this.hdjf = hdjf;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getSfyx() {
		return sfyx;
	}

	public void setSfyx(String sfyx) {
		this.sfyx = sfyx;
	}

	public String getZljc() {
		return zljc;
	}

	public void setZljc(String zljc) {
		this.zljc = zljc;
	}

	public Integer getZljcrwid() {
		return zljcrwid;
	}

	public void setZljcrwid(Integer zljcrwid) {
		this.zljcrwid = zljcrwid;
	}

	public Date getZljcrq() {
		return zljcrq;
	}

	public void setZljcrq(Date zljcrq) {
		this.zljcrq = zljcrq;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	
}

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
@Table(name = "SJZB_SPGL")
public class SjzbSpgl {
	@Id
	@GeneratedValue(generator = "sjzb_spgl_spid")
	@GenericGenerator(name = "sjzb_spgl_spid", strategy = "identity")
	private Integer spid;
	
	@Column()
	private String spm;
	
	@Column()
	private String sptx="";
	
	@Column()
	private Integer dhjf;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date sjsj;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date xjsj;
	
	@Column()
	private String sfyx;
	
	@Column()
	private Integer qszl;
	
	@Column()
	private Integer cl;
	
	@Column()
	private String bz;

	public Integer getSpid() {
		return spid;
	}

	public void setSpid(Integer spid) {
		this.spid = spid;
	}

	public String getSpm() {
		return spm;
	}

	public void setSpm(String spm) {
		this.spm = spm;
	}

	public String getSptx() {
		return sptx;
	}

	public void setSptx(String sptx) {
		this.sptx = sptx;
	}

	public Integer getDhjf() {
		return dhjf;
	}

	public void setDhjf(Integer dhjf) {
		this.dhjf = dhjf;
	}

	public Date getSjsj() {
		return sjsj;
	}

	public void setSjsj(Date sjsj) {
		this.sjsj = sjsj;
	}

	public Date getXjsj() {
		return xjsj;
	}

	public void setXjsj(Date xjsj) {
		this.xjsj = xjsj;
	}

	public String getSfyx() {
		return sfyx;
	}

	public void setSfyx(String sfyx) {
		this.sfyx = sfyx;
	}

	public Integer getQszl() {
		return qszl;
	}

	public void setQszl(Integer qszl) {
		this.qszl = qszl;
	}

	public Integer getCl() {
		return cl;
	}

	public void setCl(Integer cl) {
		this.cl = cl;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}
	
	
}

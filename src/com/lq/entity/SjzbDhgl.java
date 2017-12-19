package com.lq.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "SJZB_DHGL")
public class SjzbDhgl {
	@Id
	@GeneratedValue(generator = "sjzb_dhh")
	@GenericGenerator(name = "sjzb_dhh", strategy = "identity")
	private Integer dhh;
	
	@Column()
	private String dhyh;
	
	@Column()
	private Integer spid;
	
	@Column()
	private Date dhsj;
	
	@Column()
	private Integer dhsl;
	
	@Column()
	private Integer hfjf;

	public Integer getDhh() {
		return dhh;
	}

	public void setDhh(Integer dhh) {
		this.dhh = dhh;
	}

	public String getDhyh() {
		return dhyh;
	}

	public void setDhyh(String dhyh) {
		this.dhyh = dhyh;
	}

	public Integer getSpid() {
		return spid;
	}

	public void setSpid(Integer spid) {
		this.spid = spid;
	}

	public Date getDhsj() {
		return dhsj;
	}

	public void setDhsj(Date dhsj) {
		this.dhsj = dhsj;
	}

	public Integer getDhsl() {
		return dhsl;
	}

	public void setDhsl(Integer dhsl) {
		this.dhsl = dhsl;
	}

	public Integer getHfjf() {
		return hfjf;
	}

	public void setHfjf(Integer hfjf) {
		this.hfjf = hfjf;
	}
	
	
}

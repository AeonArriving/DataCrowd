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
@Table(name = "SJZB_SCSJSXXX")
public class SjzbScsjsxxx {
	@Id
	@GeneratedValue(generator = "scsjsxxx_id")
	@GenericGenerator(name = "scsjsxxx_id", strategy = "identity")
	private int id;
	
	@Column()
	private String wjm;
	
	@Column()
	private String dywjm;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date cjsj;
	
	@Column()
	private float gps_jd;
	
	@Column()
	private float gps_wd;
	
	@Column()
	private float gps_hb;
	
	@Column()
	private float gps_fx;
	
	@Column()
	private float gps_sd;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date gps_sj;
	
	@Column()
	private float gyro_x;
	
	@Column()
	private float gyro_y;
	
	@Column()
	private float gyro_z;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date gyro_sj;
	
	@Column()
	private float amter_x;
	
	@Column()
	private float amter_y;
	
	@Column()
	private float amter_z;
	
	@Column()
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date amter_sj;
	
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

	public String getDywjm() {
		return dywjm;
	}

	public void setDywjm(String dywjm) {
		this.dywjm = dywjm;
	}

	public Date getCjsj() {
		return cjsj;
	}

	public void setCjsj(Date cjsj) {
		this.cjsj = cjsj;
	}

	public float getGps_jd() {
		return gps_jd;
	}

	public void setGps_jd(float gps_jd) {
		this.gps_jd = gps_jd;
	}

	public float getGps_wd() {
		return gps_wd;
	}

	public void setGps_wd(float gps_wd) {
		this.gps_wd = gps_wd;
	}

	public float getGps_hb() {
		return gps_hb;
	}

	public void setGps_hb(float gps_hb) {
		this.gps_hb = gps_hb;
	}

	public float getGps_fx() {
		return gps_fx;
	}

	public void setGps_fx(float gps_fx) {
		this.gps_fx = gps_fx;
	}

	public float getGps_sd() {
		return gps_sd;
	}

	public void setGps_sd(float gps_sd) {
		this.gps_sd = gps_sd;
	}

	public Date getGps_sj() {
		return gps_sj;
	}

	public void setGps_sj(Date gps_sj) {
		this.gps_sj = gps_sj;
	}

	public float getGyro_x() {
		return gyro_x;
	}

	public void setGyro_x(float gyro_x) {
		this.gyro_x = gyro_x;
	}

	public float getGyro_y() {
		return gyro_y;
	}

	public void setGyro_y(float gyro_y) {
		this.gyro_y = gyro_y;
	}

	public float getGyro_z() {
		return gyro_z;
	}

	public void setGyro_z(float gyro_z) {
		this.gyro_z = gyro_z;
	}

	public Date getGyro_sj() {
		return gyro_sj;
	}

	public void setGyro_sj(Date gyro_sj) {
		this.gyro_sj = gyro_sj;
	}

	public float getAmter_x() {
		return amter_x;
	}

	public void setAmter_x(float amter_x) {
		this.amter_x = amter_x;
	}

	public float getAmter_y() {
		return amter_y;
	}

	public void setAmter_y(float amter_y) {
		this.amter_y = amter_y;
	}

	public float getAmter_z() {
		return amter_z;
	}

	public void setAmter_z(float amter_z) {
		this.amter_z = amter_z;
	}

	public Date getAmter_sj() {
		return amter_sj;
	}

	public void setAmter_sj(Date amter_sj) {
		this.amter_sj = amter_sj;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	
}

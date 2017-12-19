package com.lq.Request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class sjzbdhglSearchRequest {
	private Integer dhhsearch;
	private String dhyhsearch;
	private int page=1;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dhsjsearch;
	public Integer getDhhsearch() {
		return dhhsearch;
	}
	public void setDhhsearch(Integer dhhsearch) {
		this.dhhsearch = dhhsearch;
	}
	public String getDhyhsearch() {
		return dhyhsearch;
	}
	public void setDhyhsearch(String dhyhsearch) {
		this.dhyhsearch = dhyhsearch;
	}
	public Date getDhsjsearch() {
		return dhsjsearch;
	}
	public void setDhsjsearch(Date dhsjsearch) {
		this.dhsjsearch = dhsjsearch;
	}
	
	
}

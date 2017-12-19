package com.lq.Request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class sjzbscsjxxSearchRequest {
	private String wjmsearch;
	private String scyhsearch;
	private int page=1;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date scsjsearch;
	public String getWjmsearch() {
		return wjmsearch;
	}
	public void setWjmsearch(String wjmsearch) {
		this.wjmsearch = wjmsearch;
	}
	public String getScyhsearch() {
		return scyhsearch;
	}
	public void setScyhsearch(String scyhsearch) {
		this.scyhsearch = scyhsearch;
	}
	public Date getScsjsearch() {
		return scsjsearch;
	}
	public void setScsjsearch(Date scsjsearch) {
		this.scsjsearch = scsjsearch;
	}
	
	
}

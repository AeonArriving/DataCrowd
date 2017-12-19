package com.lq.Request;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class gztxSearchRequest {
	private String contextsearch;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date monthsearch;
	private String idsearch;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date releasesearch;
	private int page=1;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getContextsearch() {
		return contextsearch;
	}
	public void setContextsearch(String contextsearch) {
		this.contextsearch = contextsearch;
	}
	public Date getMonthsearch() {
		return monthsearch;
	}
	public void setMonthsearch(Date monthsearch) {
		this.monthsearch = monthsearch;
	}
	public String getIdsearch() {
		return idsearch;
	}
	public void setIdsearch(String idsearch) {
		this.idsearch = idsearch;
	}
	public Date getReleasesearch() {
		return releasesearch;
	}
	public void setReleasesearch(Date releasesearch) {
		this.releasesearch = releasesearch;
	}
	
}

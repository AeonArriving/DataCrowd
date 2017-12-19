package com.lq.Request;

public class sjjgyhglSearchRequest {
	private Integer yhidsearch;
	private String yhmsearch;
	private int page=1;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Integer getYhidsearch() {
		return yhidsearch;
	}
	public void setYhidsearch(Integer yhidsearch) {
		this.yhidsearch = yhidsearch;
	}
	public String getYhmsearch() {
		return yhmsearch;
	}
	public void setYhmsearch(String yhmsearch) {
		this.yhmsearch = yhmsearch;
	}
	
}

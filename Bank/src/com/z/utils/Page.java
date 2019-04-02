package com.z.utils;

public class Page {
	private int currentPageNo = 1;
	private int totalCount = 0;
	private int totalPageCount = 0;
	private int PageSize = 5;
	public Page() {
		super();
	}
	public Page(int currentPageNo, int totalCount, int totalPageCount,
			int pageSize) {
		super();
		this.currentPageNo = currentPageNo;
		this.totalCount = totalCount;
		this.totalPageCount = totalPageCount;
		PageSize = pageSize;
	}
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	public void setCurrentPageNo(int currentPageNo) {
		if (currentPageNo > 0) {
			this.currentPageNo = currentPageNo;
		}
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			this.jisuan();
		}
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		if (totalPageCount > 0) {
			this.totalPageCount = totalPageCount;
		}
	}
	public int getPageSize() {
		return PageSize;
	}
	public void setPageSize(int pageSize) {
		PageSize = pageSize;
	}
	
	public void jisuan(){
		if (this.totalCount < this.PageSize) {
			this.totalPageCount = 1;
		}else if(this.totalCount % this.PageSize == 0){
			this.totalPageCount = this.totalCount / this.PageSize;
		}else {
			this.totalPageCount = this.totalCount / this.PageSize + 1;
		}
	}
}

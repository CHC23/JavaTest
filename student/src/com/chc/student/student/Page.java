package com.chc.student.student;

import java.util.List;

/**
 * 封装分页数据
 * @author chc
 *
 */
public class Page {
	private List<Student> list;			//当前页所有学生信息
	private int currentPage;			//当前页面
	private int totalPages;				//总页面数
	private int pageRecord;				//每页学生信息总数
	private int totalRecord;			//数据库学生总数
	
	
	
	
	
	public Page() {
		super();
	}
	public Page(List<Student> list, int currentPage, int totalPages, int pageRecord, int totalRecord) {
		super();
		this.list = list;
		this.currentPage = currentPage;
		this.totalPages = totalPages;
		this.pageRecord = pageRecord;
		this.totalRecord = totalRecord;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageRecord() {
		return pageRecord;
	}
	public void setPageRecord(int pageRecord) {
		this.pageRecord = pageRecord;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	
	
	
}

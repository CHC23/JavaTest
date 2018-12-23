package com.chc.student.student;

import java.util.List;

/**
 * ��װ��ҳ����
 * @author chc
 *
 */
public class Page {
	private List<Student> list;			//��ǰҳ����ѧ����Ϣ
	private int currentPage;			//��ǰҳ��
	private int totalPages;				//��ҳ����
	private int pageRecord;				//ÿҳѧ����Ϣ����
	private int totalRecord;			//���ݿ�ѧ������
	
	
	
	
	
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

package cn.tf.csts.entity;

import java.util.List;

public class PaginationBean<T>   {
	
	private  Integer  pageSize;     //每页的数量
	private  Integer  currPage;     //当前页
	private  Integer  totalPage;    //总页数
	private  Integer  total;        //总记录数
	private  List<T>  rows;         //分页数据
	public PaginationBean(int pageSize, int currPage) {
		this.pageSize=pageSize;
		this.currPage=currPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getCurrPage() {
		return currPage;
	}
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "PaginationBean [pageSize=" + pageSize + ", currPage="
				+ currPage + ", totalPage=" + totalPage + ", total=" + total
				+ ", rows=" + rows + "]";
	}
	public PaginationBean(Integer pageSize, Integer currPage,
			Integer totalPage, Integer total, List<T> rows) {
		super();
		this.pageSize = pageSize;
		this.currPage = currPage;
		this.totalPage = totalPage;
		this.total = total;
		this.rows = rows;
	}
	public PaginationBean() {
		super();
	}
	
	
	

}

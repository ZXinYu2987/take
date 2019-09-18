package com.mr.take_domain.common;

import java.util.List;

public class DataGridVO {

	private Integer total;
	private List rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "DataGridVO [total=" + total + ", rows=" + rows + "]";
	}

}

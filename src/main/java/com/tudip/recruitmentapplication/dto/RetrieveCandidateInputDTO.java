package com.tudip.recruitmentapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class RetrieveCandidateInputDTO {

	private String searchBy;
	private String searchByValue;
	private String sortBy;
	private Integer page;

	public String getSearchBy() {
		return searchBy;
	}

	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}

	public String getSearchByValue() {
		return searchByValue;
	}

	public void setSearchByValue(String searchByValue) {
		this.searchByValue = searchByValue;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

}

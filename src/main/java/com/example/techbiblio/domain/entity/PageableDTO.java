package com.example.techbiblio.domain.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Data()
public class PageableDTO {

    //@NotEmpty
    int pageNo;
    int itemsByPage;

    //@NotEmpty
    String sortDir;

    //@NotEmpty
    String sortField="id";

    int pageSize;



    public String getSortDir() {
        return sortDir;
    }

    public String getSortField() {
        return sortField;
    }

    public int getItemsByPage() {
        return itemsByPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setItemsByPage(int itemsByPage) {
        this.itemsByPage = itemsByPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }
}

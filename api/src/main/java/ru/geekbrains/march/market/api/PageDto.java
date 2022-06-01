package ru.geekbrains.march.market.api;

import java.util.List;

public class PageDto{
    private List<ProductDto> content;
    private int totalPages;
    private int pageSize;
    private long totalElements;

    public List<ProductDto> getContent() {
        return this.content;
    }

    public int getTotalPages() {
        return this.totalPages;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public long getTotalElements() {
        return this.totalElements;
    }

    public void setContent(List<ProductDto> content) {
        this.content = content;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

}

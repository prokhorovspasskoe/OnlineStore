package ru.geekbrains.march.market.core.converters;

import org.springframework.data.domain.Page;
import ru.geekbrains.march.market.api.PageDto;
import ru.geekbrains.march.market.api.ProductDto;

public class PageConverter {
    private final PageDto pageDto;

    public PageConverter() {
        pageDto = new PageDto();
    }

    public PageDto convert(Page<ProductDto> page){
        pageDto.setContent(page.getContent());
        pageDto.setPageSize(page.getSize());
        pageDto.setTotalPages(page.getTotalPages());
        pageDto.setTotalElements(page.getTotalElements());
        return pageDto;
    }
}
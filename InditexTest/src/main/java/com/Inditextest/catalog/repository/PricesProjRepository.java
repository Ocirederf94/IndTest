// **********************************************************************
// Copyright (c) 2021 Panel Sistemas Informaticos, Spain.
// **********************************************************************
package com.Inditextest.catalog.repository;

import java.time.LocalDateTime;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.Inditextest.catalog.model.ItemPrice;
import com.Inditextest.catalog.model.projection.ItemPriceProj;

public interface PricesProjRepository extends PagingAndSortingRepository<ItemPrice, Integer>
{
    /**
     * @param date
     * @param date2
     * @param productId
     * @param brandId
     * @return
     */
    ItemPriceProj findFirstByStartDateBeforeAndEndDateAfterAndProduct_IdAndBrand_IdOrderByPriorityDesc(LocalDateTime date,
                                                                                                       LocalDateTime date2,
                                                                                                       Integer productId,
                                                                                                       Integer brandId);
}

package com.Inditextest.catalog.repository;

import java.time.LocalDateTime;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.Inditextest.catalog.model.ItemPrice;

public interface PricesRepository extends PagingAndSortingRepository<ItemPrice, Integer>
{
    /**
     * @param date
     * @param date2
     * @param productId
     * @param brandId
     * @return
     */
    ItemPrice findFirstByStartDateBeforeAndEndDateAfterAndProduct_IdAndBrand_IdOrderByPriorityDesc(LocalDateTime date,
                                                                                                   LocalDateTime date2,
                                                                                                   Integer productId,
                                                                                                   Integer brandId);
}

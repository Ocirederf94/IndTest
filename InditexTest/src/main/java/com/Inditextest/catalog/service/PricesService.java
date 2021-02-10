// **********************************************************************
// Copyright (c) 2021 Panel Sistemas Informaticos, Spain.
// **********************************************************************
package com.Inditextest.catalog.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inditextest.catalog.model.ItemPrice;
import com.Inditextest.catalog.model.projection.ItemPriceProj;
import com.Inditextest.catalog.repository.PricesProjRepository;
import com.Inditextest.catalog.repository.PricesRepository;
import com.Inditextest.catalog.service.interfaces.IPricesService;

@Service
public class PricesService implements IPricesService
{

    @Autowired
    private PricesRepository pricesRepository;
    @Autowired
    private PricesProjRepository pricesProjRepository;

    @Override
    public ItemPrice getItemPrice(LocalDateTime date, Integer productId, Integer brandId)
    {
        return pricesRepository.findFirstByStartDateBeforeAndEndDateAfterAndProduct_IdAndBrand_IdOrderByPriorityDesc(date, date, productId,
                brandId);
    }

    @Override
    public ItemPriceProj getItemPriceData(LocalDateTime date, Integer productId, Integer brandId)
    {
        return pricesProjRepository.findFirstByStartDateBeforeAndEndDateAfterAndProduct_IdAndBrand_IdOrderByPriorityDesc(date, date,
                productId, brandId);
    }

}

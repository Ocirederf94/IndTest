package com.Inditextest.catalog.service.interfaces;

import java.time.LocalDateTime;

import com.Inditextest.catalog.model.ItemPrice;
import com.Inditextest.catalog.model.projection.ItemPriceProj;

public interface IPricesService {

    /**
     * @param date
     * @param productId
     * @param brandId
     * @return
     */
    ItemPrice getItemPrice(LocalDateTime date, Integer productId, Integer brandId);
    
    /**
     * @param date
     * @param productId
     * @param brandId
     * @return
     */
    ItemPriceProj getItemPriceData(LocalDateTime date, Integer productId, Integer brandId);

}

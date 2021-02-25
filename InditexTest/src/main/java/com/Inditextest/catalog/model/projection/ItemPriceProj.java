package com.Inditextest.catalog.model.projection;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.Inditextest.catalog.model.Brand;
import com.Inditextest.catalog.model.Product;

public interface ItemPriceProj
{
    public Brand getBrand();

    public Product getProduct();

    Integer getPriceList();

    public LocalDateTime getStartDate();

    public LocalDateTime getEndDate();

    public BigDecimal getPrice();
}

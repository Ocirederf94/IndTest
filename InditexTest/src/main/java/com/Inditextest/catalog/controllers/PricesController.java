package com.Inditextest.catalog.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

import com.Inditextest.catalog.model.ItemPrice;
import com.Inditextest.catalog.model.projection.ItemPriceProj;
import com.Inditextest.catalog.service.interfaces.IPricesService;

@RestController
@Api (value = "PricesController", tags = { "Prices Controller" })
@RequestMapping ("api/v1/prices")
public class PricesController
{

    @Autowired
    private IPricesService pricesService;

    @GetMapping ()
    public ItemPrice getItemPrice(
                                  @RequestParam (name = "date",
                                          required = true) @DateTimeFormat (iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
                                  @RequestParam (name = "productId", required = true) Integer productId,
                                  @RequestParam (name = "brandId", required = true) Integer brandId)
    {

        return pricesService.getItemPrice(date, productId, brandId);
    }

    @GetMapping ("/data")
    public ItemPriceProj
           getItemPriceData(@RequestParam (name = "date",
                   required = true) @DateTimeFormat (iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
                            @RequestParam (name = "productId", required = true) Integer productId,
                            @RequestParam (name = "brandId", required = true) Integer brandId)
    {

        return pricesService.getItemPriceData(date, productId, brandId);
    }

}

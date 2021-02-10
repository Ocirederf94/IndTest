// **********************************************************************
// Copyright (c) 2021 Panel Sistemas Informaticos, Spain.
// **********************************************************************
package com.Inditextest.catalog.controllers;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Inditextest.catalog.model.ItemPrice;
import com.Inditextest.catalog.model.projection.ItemPriceProj;

@RunWith (SpringRunner.class)
@SpringBootTest ()
public class PricesControllerTest
{

    @Autowired
    private PricesController controller;

    @Test
    public void getItemPrice_withValidData_ShouldReturnCorrectPrices()
    {
        ItemPrice itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-14T10:00:00"), 35455, 1);
        assertEquals(1, itemPrice.getId());
        ItemPriceProj itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-14T10:00:00"), 35455, 1);
        assertEquals(35.50d, itemPriceData.getPrice());

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-14T16:00:00"), 35455, 1);
        assertEquals(2, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-14T16:00:00"), 35455, 1);
        assertEquals(25.45d, itemPriceData.getPrice());

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-14T21:00:00"), 35455, 1);
        assertEquals(1, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-14T21:00:00"), 35455, 1);
        assertEquals(35.50d, itemPriceData.getPrice());

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-15T10:00:00"), 35455, 1);
        assertEquals(3, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-15T10:00:00"), 35455, 1);
        assertEquals(30.50d, itemPriceData.getPrice());

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-16T21:00:00"), 35455, 1);
        assertEquals(4, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-16T21:00:00"), 35455, 1);
        assertEquals(38.95d, itemPriceData.getPrice());
    }

    @Test
    public void getItemPrice_withNonExistingData_ShouldReturnNull()
    {
        ItemPrice itemPrice = controller.getItemPrice(LocalDateTime.now(), 1, 1);
        assertNull(itemPrice);
        ItemPriceProj itemPriceData = controller.getItemPriceData(LocalDateTime.now(), 1, 1);
        assertNull(itemPriceData);
    }

}

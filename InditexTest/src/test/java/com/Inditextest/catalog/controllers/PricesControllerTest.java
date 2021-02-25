package com.Inditextest.catalog.controllers;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
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
        assertEquals(0, new BigDecimal("35.50").compareTo(itemPriceData.getPrice()));

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-14T16:00:00"), 35455, 1);
        assertEquals(2, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-14T16:00:00"), 35455, 1);
        assertEquals(0, new BigDecimal("25.45").compareTo(itemPriceData.getPrice()));

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-14T21:00:00"), 35455, 1);
        assertEquals(1, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-14T21:00:00"), 35455, 1);
        assertEquals(0, new BigDecimal("35.50").compareTo(itemPriceData.getPrice()));

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-15T10:00:00"), 35455, 1);
        assertEquals(3, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-15T10:00:00"), 35455, 1);
        assertEquals(0, new BigDecimal("30.50").compareTo(itemPriceData.getPrice()));

        itemPrice = controller.getItemPrice(LocalDateTime.parse("2020-06-16T21:00:00"), 35455, 1);
        assertEquals(4, itemPrice.getId());
        itemPriceData = controller.getItemPriceData(LocalDateTime.parse("2020-06-16T21:00:00"), 35455, 1);
        assertEquals(0, new BigDecimal("38.95").compareTo(itemPriceData.getPrice()));
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

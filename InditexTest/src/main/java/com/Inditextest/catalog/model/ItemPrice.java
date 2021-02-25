package com.Inditextest.catalog.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "item_prices")
public class ItemPrice implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn (name = "id_brand")
    private Brand brand;

    @JoinColumn (name = "start_date")
    private LocalDateTime startDate;

    @JoinColumn (name = "end_date")
    private LocalDateTime endDate;

    @JoinColumn (name = "price_list")
    private Integer priceList;

    @ManyToOne
    @JoinColumn (name = "id_product")
    private Product product;

    @JoinColumn ()
    private Integer priority;

    @JoinColumn ()
    private BigDecimal price;

    @JoinColumn ()
    private String currency;

    /**
     * @return the id
     */
    public Integer getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id)
    {
        this.id = id;
    }

    /**
     * @return the brand
     */
    public Brand getBrand()
    {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(Brand brand)
    {
        this.brand = brand;
    }

    /**
     * @return the startDate
     */
    public LocalDateTime getStartDate()
    {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(LocalDateTime startDate)
    {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public LocalDateTime getEndDate()
    {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(LocalDateTime endDate)
    {
        this.endDate = endDate;
    }

    /**
     * @return the priceList
     */
    public Integer getPriceList()
    {
        return priceList;
    }

    /**
     * @param priceList the priceList to set
     */
    public void setPriceList(Integer priceList)
    {
        this.priceList = priceList;
    }

    /**
     * @return the product
     */
    public Product getProduct()
    {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product)
    {
        this.product = product;
    }

    /**
     * @return the priority
     */
    public Integer getPriority()
    {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(Integer priority)
    {
        this.priority = priority;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice()
    {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    /**
     * @return the currency
     */
    public String getCurrency()
    {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((priceList == null) ? 0 : priceList.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ItemPrice other = (ItemPrice) obj;
        if (brand == null)
        {
            if (other.brand != null) return false;
        }
        else if (!brand.equals(other.brand)) return false;
        if (currency == null)
        {
            if (other.currency != null) return false;
        }
        else if (!currency.equals(other.currency)) return false;
        if (endDate == null)
        {
            if (other.endDate != null) return false;
        }
        else if (!endDate.equals(other.endDate)) return false;
        if (id == null)
        {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (price == null)
        {
            if (other.price != null) return false;
        }
        else if (!price.equals(other.price)) return false;
        if (priceList == null)
        {
            if (other.priceList != null) return false;
        }
        else if (!priceList.equals(other.priceList)) return false;
        if (priority == null)
        {
            if (other.priority != null) return false;
        }
        else if (!priority.equals(other.priority)) return false;
        if (product == null)
        {
            if (other.product != null) return false;
        }
        else if (!product.equals(other.product)) return false;
        if (startDate == null)
        {
            if (other.startDate != null) return false;
        }
        else if (!startDate.equals(other.startDate)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "ItemPrice [id=" + id + ", brand=" + brand + ", startDate=" + startDate + ", endDate=" + endDate + ", priceList=" + priceList
                + ", product=" + product + ", priority=" + priority + ", price=" + price + ", currency=" + currency + "]";
    }

}

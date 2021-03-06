package es.develex.domain.model;

import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;

@RedisHash("cartLine")
public class CartLine {
    private String productId;
    private String size;
    private String color;
    private BigDecimal price;
    private Integer numItems;

    public CartLine(String productId, String size, String color, BigDecimal price, Integer numItems) {
        this.productId = productId;
        this.size = size;
        this.color = color;
        this.price = price;
        this.numItems = numItems;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNumItems() {
        return numItems;
    }

    public void setNumItems(Integer numItems) {
        this.numItems = numItems;
    }

    @Override
    public String toString() {
        return "CartLine{" + "productId='" + productId + '\'' + ", size='" + size + '\'' + ", color='" + color + '\'' + ", price=" + price + ", numItems=" + numItems + '}';
    }
}

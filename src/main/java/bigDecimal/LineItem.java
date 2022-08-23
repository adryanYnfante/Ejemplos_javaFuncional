package bigDecimal;

import java.math.BigDecimal;

public class LineItem {

    private Integer id;
    private String item;
    private Integer qty;
    private BigDecimal price;
    private BigDecimal total;

    public LineItem(int i, String apple, int i1, BigDecimal bigDecimal, BigDecimal bigDecimal1) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
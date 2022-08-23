package bigDecimal;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private Integer id;
    private String invoice;
    private List<LineItem> lineItems;
    private BigDecimal total;

    public <T> Order(int i, String a0000001, List<T> asList, BigDecimal bigDecimal) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}

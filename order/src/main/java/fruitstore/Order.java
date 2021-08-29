package fruitstore;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Order_table")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    private Long prodId;
    private Long userId;
    private Long id;
    private String prodId;
    private String userId;
    private Integer qty;
    private Integer price;
    private String address;
    private String orderStatus;

    @PostPersist
    public void onPostPersist(){
        OrderPlaced orderPlaced = new OrderPlaced();
        BeanUtils.copyProperties(this, orderPlaced);
        orderPlaced.publishAfterCommit();

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        fruitstore.external.Payment payment = new fruitstore.external.Payment();
        // mappings goes here
        Application.applicationContext.getBean(fruitstore.external.PaymentService.class)
            .payment(payment);

        OrderCanceled orderCanceled = new OrderCanceled();
        BeanUtils.copyProperties(this, orderCanceled);
        orderCanceled.publishAfterCommit();

    }

    public Long getOrderId() {
        return orderId;
    public Long getId() {
        return id;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getProdId() {
    public String getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public Long getUserId() {
    public String getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }




}
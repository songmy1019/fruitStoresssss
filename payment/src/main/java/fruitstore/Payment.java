package fruitstore;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Payment_table")
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long payId;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    private Long userId;
    private Long prodId;
    private Long id;
    private String orderId;
    private String userId;
    private Integer price;
    private String orderStatus;
    private String payStatus;
    private String prodId;
    private Integer qty;
    private String payStatus;
    private String orderStatus;

    @PostPersist
    public void onPostPersist(){
        PaymentApproved paymentApproved = new PaymentApproved();
        BeanUtils.copyProperties(this, paymentApproved);
        paymentApproved.publishAfterCommit();

        PaymentCanceled paymentCanceled = new PaymentCanceled();
        BeanUtils.copyProperties(this, paymentCanceled);
        paymentCanceled.publishAfterCommit();

    }

    public Long getPayId() {
        return payId;
    public Long getId() {
        return id;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Long getUserId() {
    public String getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getQty() {
        return qty;
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    public String getOrderStatus() {
        return orderStatus;
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    public void setQty(Integer qty) {
        this.qty = qty;
    }




}
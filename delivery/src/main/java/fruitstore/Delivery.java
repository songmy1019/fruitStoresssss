package fruitstore;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
public class Delivery {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long deliveryId;
    private Long orderId;
    private Long userId;
    private Long prodId;
    private Long id;
    private String orderId;
    private String prodId;
    private String userId;
    private Integer qty;
    private String address;
    private String orderStatus;
    private String payStatus;
    private String deliveryStatus;
    private String orderStatus;

    @PostPersist
    public void onPostPersist(){
        DeliveryStarted deliveryStarted = new DeliveryStarted();
        BeanUtils.copyProperties(this, deliveryStarted);
        deliveryStarted.publishAfterCommit();

        DeliveryCanceled deliveryCanceled = new DeliveryCanceled();
        BeanUtils.copyProperties(this, deliveryCanceled);
        deliveryCanceled.publishAfterCommit();

    }

    public Long getDeliveryId() {
        return deliveryId;
    public Long getId() {
        return id;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
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
        return userId;
    public String getProdId() {
        return prodId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public Long getProdId() {
        return prodId;
    public String getUserId() {
        return userId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
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
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }




}
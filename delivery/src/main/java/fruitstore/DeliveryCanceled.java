package fruitstore;

public class DeliveryCanceled extends AbstractEvent {

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
    private String deliveryStatus;
    private String orderStatus;
    private String payStatus;
    private String orderStatus;
    private String deliveryStatus;

    public DeliveryCanceled(){
        super();
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
    public String getDeliveryStatus() {
        return deliveryStatus;
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
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
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}

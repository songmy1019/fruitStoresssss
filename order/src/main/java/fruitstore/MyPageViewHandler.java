package fruitstore;

import fruitstore.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class MyPageViewHandler {


    @Autowired
    private MyPageRepository myPageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            MyPage myPage = new MyPage();
            // view 객체에 이벤트의 Value 를 set 함
            myPage.setId(orderPlaced.getUserId());
            myPage.setOrderId(orderPlaced.getId());
            myPage.setProdId(orderPlaced.getProdId());
            myPage.setQty(orderPlaced.getQty());
            myPage.setOrderStatus(orderPlaced.getOrderStatus());
            myPage.setPrice(orderPlaced.getPrice());
            myPage.setOrderStatus("주문신청됨");
            // view 레파지 토리에 save
            myPageRepository.save(myPage);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCanceled_then_UPDATE_1(@Payload OrderCanceled orderCanceled) {
    public void whenPaymentApproved_then_UPDATE_1(@Payload PaymentApproved paymentApproved) {
        try {
            if (!orderCanceled.validate()) return;
            if (!paymentApproved.validate()) return;
                // view 객체 조회

                    List<MyPage> myPageList = myPageRepository.findByOrderId(orderCanceled.getOrderId());
                    List<MyPage> myPageList = myPageRepository.findByOrderId(paymentApproved.getOrderId());
                    for(MyPage myPage : myPageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    myPage.setOrderStatus("주문취소됨");
                // view 레파지 토리에 save
                myPageRepository.save(myPage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaymentCanceled_then_UPDATE_2(@Payload PaymentCanceled paymentCanceled) {
    public void whenOrderCanceled_then_UPDATE_2(@Payload OrderCanceled orderCanceled) {
        try {
            if (!paymentCanceled.validate()) return;
            if (!orderCanceled.validate()) return;
                // view 객체 조회

                    List<MyPage> myPageList = myPageRepository.findByOrderId(paymentCanceled.getOrderId());
                    List<MyPage> myPageList = myPageRepository.findByOrderId(orderCanceled.getId());
                    for(MyPage myPage : myPageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    myPage.setOrderStatus("결재취소됨");
                    myPage.setOrderStatus(orderCanceled.getOrderStatus());
                // view 레파지 토리에 save
                myPageRepository.save(myPage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryStarted_then_UPDATE_3(@Payload DeliveryStarted deliveryStarted) {
    public void whenPaymentCanceled_then_UPDATE_3(@Payload PaymentCanceled paymentCanceled) {
        try {
            if (!deliveryStarted.validate()) return;
            if (!paymentCanceled.validate()) return;
                // view 객체 조회

                    List<MyPage> myPageList = myPageRepository.findByOrderId(deliveryStarted.getOrderId());
                    List<MyPage> myPageList = myPageRepository.findByOrderId(paymentCanceled.getOrderId());
                    for(MyPage myPage : myPageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    myPage.setOrderStatus("배달시작됨");
                // view 레파지 토리에 save
                myPageRepository.save(myPage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryCanceled_then_UPDATE_4(@Payload DeliveryCanceled deliveryCanceled) {
    public void whenDeliveryStarted_then_UPDATE_4(@Payload DeliveryStarted deliveryStarted) {
        try {
            if (!deliveryCanceled.validate()) return;
            if (!deliveryStarted.validate()) return;
                // view 객체 조회

                    List<MyPage> myPageList = myPageRepository.findByOrderId(deliveryCanceled.getOrderId());
                    List<MyPage> myPageList = myPageRepository.findByOrderId(deliveryStarted.getOrderId());
                    for(MyPage myPage : myPageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    myPage.setOrderStatus("배달취소됨");
                // view 레파지 토리에 save
                myPageRepository.save(myPage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaymentApproved_then_UPDATE_5(@Payload PaymentApproved paymentApproved) {
    public void whenDeliveryCanceled_then_UPDATE_5(@Payload DeliveryCanceled deliveryCanceled) {
        try {
            if (!paymentApproved.validate()) return;
            if (!deliveryCanceled.validate()) return;
                // view 객체 조회

                    List<MyPage> myPageList = myPageRepository.findByOrderId(paymentApproved.getOrderId());
                    List<MyPage> myPageList = myPageRepository.findByOrderId(deliveryCanceled.getOrderId());
                    for(MyPage myPage : myPageList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    myPage.setPayStatus(paymentApproved.getPayStatus());
                    myPage.setOrderStatus("결재승인됨");
                // view 레파지 토리에 save
                myPageRepository.save(myPage);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}


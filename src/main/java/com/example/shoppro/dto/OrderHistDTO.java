package com.example.shoppro.dto;

import com.example.shoppro.constant.OrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderHistDTO {

    //구매 이력에 사용할 orderEntity에서 필요한
    //내용만을 담은 orderHistDTO 브라우저로 전달할 내용들
    //Order entity의 검색한 내용을 가지고 해당 필드값을 set

    private Long orderId;   //주문아이디

    private String orderDate;   //주문날짜

    private OrderStatus orderStatus;    //주문상태

    private List<OrderItemDTO> orderItemDTOList
            =new ArrayList<>();
    //구매이력에 담길 구매아이템들

    public void addOrderItemDTO(OrderItemDTO orderItemDTO){
        orderItemDTOList.add(orderItemDTO);
    }
}
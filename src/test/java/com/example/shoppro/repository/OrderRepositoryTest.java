package com.example.shoppro.repository;

import com.example.shoppro.dto.OrderDTO;
import com.example.shoppro.entity.Order;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Log4j2
class OrderRepositoryTest {

    @Autowired
    OrderRepository orderRepository;


//    @Test
//    @Transactional
//    public void re(){
//        Pageable pageable = PageRequest.of(0, 10);
//        List<Order> orderList = orderRepository.findOrders("test@a.a", pageable);
//
//        orderList.forEach(order -> log.info(order));
//
//        ModelMapper modelMapper = new ModelMapper();
//
//        List<OrderDTO> orderDTOList =
//                orderList.stream().map(order -> modelMapper.map(order.OrderHistDTO.class))
//
//                        .collect(Collectors.toList(
//                        ));
//    }


//    @Test
//    @Transactional
//    public void findOrderlistEmailTest(){
//        //에러나는 이유 현재 pagealbe을 안넣어줌 만들어서 넣어줄것

//        Pageable pageable
//                = PageRequest.of(0, 20);
//
//        String email = "test@a.a";
//
//        List<Order> orderList =
//                orderRepository.findByMemberEmailOrderByOrderDateDesc(email, pageable);
//        orderList.forEach(a -> log.info(a));
//        System.out.println("==================");
//        System.out.println("==================");
//        System.out.println("==================");
//
//        List<Order> orderListAAA =
//                orderRepository.findOrders(email,pageable);
//        orderList.forEach(a -> log.info(a));


//
//    }
    @Test
    @Transactional
    public void totaltest(){
        Long totalE = orderRepository.totalCount("test@a.a");
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
        System.out.println(totalE);
    }
}
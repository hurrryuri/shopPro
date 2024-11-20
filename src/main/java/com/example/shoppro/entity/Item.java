package com.example.shoppro.entity;

import com.example.shoppro.constant.ItemSellStatus;
import com.example.shoppro.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.javapoet.NameAllocator;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "item")
public class Item extends BaseEntity {

    @Id
    @Column(name = "item_id")   //테이블에서 매핑될 컬럼
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;       // 상품코드

    @Column(nullable = false, length = 50)
    private String itemNm; //상품명

    @Column(name = "price", nullable = false)
    private int price;  //가격

    @Column(nullable = false)
    private int stockNumber;    //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail;  //상품 상세설명
    //상품 판매 상태

    @Enumerated(EnumType.STRING)    // enum가지고 만듬, yes/no, sell/
    private ItemSellStatus itemSellStatus;  //상품 판매 상태

}



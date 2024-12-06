package com.example.shoppro.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Categoryso {


    @Id
    @Column(name = "categoryso_id")       //테이블에서 매핑될 컬럼
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") //매핑할 외래키지정
    private Category category;

}

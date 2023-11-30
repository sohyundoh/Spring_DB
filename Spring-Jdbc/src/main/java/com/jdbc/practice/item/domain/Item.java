package com.jdbc.practice.item.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity // jpa가 사용하는 객체라는 뜻, 이 어노테이션이 있어야 JPA가 인식할 수 있다. @Entity가 붙은 객체를 JPA에서는 엔티티라 함
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;
    public Item() {
        //JPA에서는 public또는 protected의 기본 생성자가 필수임
    }
    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    } }

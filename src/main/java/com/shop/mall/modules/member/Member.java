package com.shop.mall.modules.member;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@EqualsAndHashCode(of = "id")
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String phone;

    private String email;

    @OneToMany(mappedBy = "member")
    private List<DeliveryAddress> deliveryAddressList = new ArrayList<>();

}

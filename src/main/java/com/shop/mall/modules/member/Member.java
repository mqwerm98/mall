package com.shop.mall.modules.member;

import com.shop.mall.modules.cart.Cart;
import com.shop.mall.modules.order.Order;
import com.shop.mall.modules.wishlist.Wishlist;
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

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Wishlist> wishlists = new ArrayList<>();

}

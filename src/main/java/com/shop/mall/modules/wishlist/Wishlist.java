package com.shop.mall.modules.wishlist;

import com.shop.mall.modules.member.Member;
import com.shop.mall.modules.order.Item;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@EqualsAndHashCode(of = "id")
public class Wishlist {

    @Id
    @GeneratedValue
    @Column(name = "wishlist_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

}

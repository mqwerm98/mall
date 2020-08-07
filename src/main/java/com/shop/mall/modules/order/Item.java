package com.shop.mall.modules.order;

import com.shop.mall.modules.category.CategoryItem;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@EqualsAndHashCode(of = "id")
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private long price;

    private int stock;

    @Lob
    @Basic(fetch = FetchType.EAGER)
    private String mainImage;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private String detailImage;

    @OneToMany(mappedBy = "item")
    private List<CategoryItem> categoryItems = new ArrayList<>();

}

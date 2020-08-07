package com.shop.mall.modules.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Address {

    private String address;
    private String address2;
    private String zipcode;

//    protected Address() {
//    }

//    public Address(String address, String address2, String zipcode) {
//        this.address = address;
//        this.address2 = address2;
//        this.zipcode = zipcode;
//    }

}

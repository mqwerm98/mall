package com.shop.mall.modules.order;

public enum OrderStatus {
    // 주문 접수 > 주문 처리중 > 상품 준비중 > 배송중 > 배송완료
    RECEIVED, PROCESSING, PREPARING, SHIPPING, COMPLETED
}

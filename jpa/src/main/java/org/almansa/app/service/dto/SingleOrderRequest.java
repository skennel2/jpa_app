package org.almansa.app.service.dto;

public class SingleOrderRequest {
    private Long merchandiseId;

    private int quantity;

    public Long getMerchandiseId() {
        return merchandiseId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMerchandiseId(Long merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
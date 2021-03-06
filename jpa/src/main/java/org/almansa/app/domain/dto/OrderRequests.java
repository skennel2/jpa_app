package org.almansa.app.domain.dto;

import java.util.ArrayList;
import java.util.List;

import org.almansa.app.service.dto.SingleOrderRequest;

public class OrderRequests {
    private List<SingleOrderRequest> requests = new ArrayList<>();

    public void addRequest(SingleOrderRequest request) {

        requests.add(request);
    }

    @Override
    public String toString() {
        return "OrderRequests [requests=" + requests + "]";
    }

}
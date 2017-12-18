package com.freshspire.api.model.response;

import com.freshspire.api.model.Discount;
import com.freshspire.api.model.Product;
import com.freshspire.api.model.Distributor;

public class DiscountData {
    private Discount discount;
    private Distributor store;
    private Product product;
    private double distance;

    public DiscountData(Object[] discountData) {
        for(Object object : discountData) {

            if (object instanceof Discount) {
                this.discount = (Discount) object;
            } else if (object instanceof Distributor) {
                this.store = (Distributor) object;
            } else if (object instanceof Product) {
                this.product = (Product) object;
            } else if (object instanceof Double) {
                this.distance = (Double) object;
            }
        }
    }
}

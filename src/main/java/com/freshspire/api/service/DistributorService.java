package com.freshspire.api.service;

import com.freshspire.api.model.Discount;
import com.freshspire.api.model.Distributor;

import java.util.List;

public interface DistributorService {

    List<Distributor> getStores();
    Distributor getStoreById(int storeId);
    List<Distributor> getStoresByZipCode(int zipcode);
    List<Distributor> getStoresByLatLong(float latitude, float longitude);
    List<Discount> getDiscounts(int storeId);
    List<Discount> getDiscounts(int storeId, String query, String foodType);

    void addStore(Distributor store);
}

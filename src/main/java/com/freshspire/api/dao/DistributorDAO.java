package com.freshspire.api.dao;

import com.freshspire.api.model.Discount;
import com.freshspire.api.model.Distributor;

import java.util.List;

public interface StoreDAO {

    void addStore(Distributor store);
    void updateStore(Distributor store);
    Distributor getStoreById(int storeId);
    List<Distributor> getStoreByZip(int zipcode);
    List<Distributor> getStoreByLocation(double latitude, double longitude);
    List<Discount> getDiscountsByStoreId(int storeId);
    List<Discount> getDiscountsByStoreId(int storeId, String query, String foodType);
    List<Distributor> getStores();
}

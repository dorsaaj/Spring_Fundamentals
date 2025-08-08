package com.example.dao;

import com.example.domain.Purchase;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;
public interface PurchaseDao {
    List<Purchase> getAllPurchases();
    Purchase getPurchase(int id);
    Purchase getPurchase(String name, Date date);
	void savePurchase(Purchase purchase);
}

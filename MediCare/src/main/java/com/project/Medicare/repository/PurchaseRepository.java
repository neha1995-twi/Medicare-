package com.project.Medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medicare.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}

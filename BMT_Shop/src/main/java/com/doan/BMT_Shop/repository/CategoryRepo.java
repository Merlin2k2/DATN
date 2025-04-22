package com.doan.BMT_Shop.repository;

import com.doan.BMT_Shop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}

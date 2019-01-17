package com.fse.wttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fse.wttracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}

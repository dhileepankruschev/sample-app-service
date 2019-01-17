package com.fse.wttracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fse.wttracker.model.Category;
import com.fse.wttracker.repository.CategoryRepository;

@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping(value = "/fetchall", method = RequestMethod.GET)
	public List<Category> getAllCategory() {

		return categoryRepository.findAll();

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void saveCategory(@RequestBody Category category) {

		categoryRepository.save(category);
	}

}

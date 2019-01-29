package com.fse.wttracker.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private Integer id;
	@Column(name = "category_name")
	private String category;
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "categoryParent")
	private List<Workout> workouts;

	/**
	 * @return the workouts
	 */
	public List<Workout> getWorkouts() {
		return workouts;
	}

	/**
	 * @param workouts
	 *            the workouts to set
	 */
	public void setWorkouts(List<Workout> workouts) {
		this.workouts = workouts;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

}

package com.fse.wttracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Workout {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "workout_id")
	private Integer id;
	@Column(name = "workout_title")
	private String title;
	@Column(name = "workout_note")
	private String note;
	@Column(name = "calories_burn_per_min")
	private Float calories;
	/*
	 * @Column(name = "category_id") private Integer categoryId;
	 */
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id", nullable = false)
	private Category categoryParent;

	public Workout() {
	}

	/**
	 * @return the categoryParent
	 */
	public Category getCategoryParent() {
		return categoryParent;
	}

	/**
	 * @param categoryParent
	 *            the categoryParent to set
	 */
	public void setCategoryParent(Category categoryParent) {
		this.categoryParent = categoryParent;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the calories
	 */
	public Float getCalories() {
		return calories;
	}

	/**
	 * @param calories
	 *            the calories to set
	 */
	public void setCalories(Float calories) {
		this.calories = calories;
	}

}

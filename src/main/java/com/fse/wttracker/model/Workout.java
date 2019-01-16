package com.fse.wttracker.model;

public class Workout {

	private Integer id;
	private String summary;

	public Workout() {

	}

	public Workout(Integer id, String summary) {
		this.id = id;
		this.summary = summary;
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
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary
	 *            the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Workout [id=" + id + ", summary=" + summary + "]";
	}

}

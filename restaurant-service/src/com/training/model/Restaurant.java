package com.training.model;

public class Restaurant {
	
	
	private int id;
	private String restaurantName;
	private long pinCode;
	private String cuisine;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int id, String restaurantName, long pinCode, String cuisine) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.pinCode = pinCode;
		this.cuisine = cuisine;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}
	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	/**
	 * @return the pinCode
	 */
	public long getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	/**
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}
	/**
	 * @param cuisine the cuisine to set
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuisine == null) ? 0 : cuisine.hashCode());
		result = prime * result + id;
		result = prime * result + (int) (pinCode ^ (pinCode >>> 32));
		result = prime * result + ((restaurantName == null) ? 0 : restaurantName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		if (cuisine == null) {
			if (other.cuisine != null)
				return false;
		} else if (!cuisine.equals(other.cuisine))
			return false;
		if (id != other.id)
			return false;
		if (pinCode != other.pinCode)
			return false;
		if (restaurantName == null) {
			if (other.restaurantName != null)
				return false;
		} else if (!restaurantName.equals(other.restaurantName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", pinCode=" + pinCode + ", cuisine="
				+ cuisine + "]";
	}
	

	
}

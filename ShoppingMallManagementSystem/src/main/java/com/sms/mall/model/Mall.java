package com.sms.mall.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mall")
public class Mall{

	
	@Id
    private Long id;
	private String malladmin;
	private String mallname;
	private String location;
	private String shop_id;
	private String categories;
	
	public Mall()
	{	
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMallAdmin() {
		return malladmin;
	}

	public void setMallAdmin(String malladmin) {
		this.malladmin = malladmin;
	}

	public String getMallName() {
		return mallname;
	}

	public void setMallName(String mallname) {
		this.mallname = mallname;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getShopId() {
		return shop_id;
	}

	public void setShopId(String shop_id) {
		this.shop_id = shop_id;
	}
	
	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	@Override
	public String toString() {
		return "Mall [id=" + id + ", malladmin=" + malladmin + ", mallname=" + mallname +",location=" + location + ", shop_id=" + shop_id + ", categories=" + categories + "]";
	}
}

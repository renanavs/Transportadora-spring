package com.apitransportadora.domain;

import java.io.Serializable;

public class Transportadora implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;

    private String email;
    private String name;
    private String company;
    private String phone;
    private String modal;
    private String street_adress;
    private String number_adress;
    private String neighborhood_adress;
    private String city_adress;
    private String uf_adress;
    
    
    public Transportadora(long id, String email, String name, String company, String phone, String modal,
			String street_adress, String number_adress, String neighborhood_adress, String city_adress,
			String uf_adress) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.company = company;
		this.phone = phone;
		this.modal = modal;
		this.street_adress = street_adress;
		this.number_adress = number_adress;
		this.neighborhood_adress = neighborhood_adress;
		this.city_adress = city_adress;
		this.uf_adress = uf_adress;
	}
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Transportadora other = (Transportadora) obj;
		if (id != other.id)
			return false;
		return true;
	}

	//GETTERS AND SETTERS
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public String getStreet_adress() {
		return street_adress;
	}
	public void setStreet_adress(String street_adress) {
		this.street_adress = street_adress;
	}
	public String getNumber_adress() {
		return number_adress;
	}
	public void setNumber_adress(String number_adress) {
		this.number_adress = number_adress;
	}
	public String getNeighborhood_adress() {
		return neighborhood_adress;
	}
	public void setNeighborhood_adress(String neighborhood_adress) {
		this.neighborhood_adress = neighborhood_adress;
	}
	public String getCity_adress() {
		return city_adress;
	}
	public void setCity_adress(String city_adress) {
		this.city_adress = city_adress;
	}
	public String getUf_adress() {
		return uf_adress;
	}
	public void setUf_adress(String uf_adress) {
		this.uf_adress = uf_adress;
	}

    
}
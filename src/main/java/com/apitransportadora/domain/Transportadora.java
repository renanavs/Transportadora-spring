package com.apitransportadora.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Transportadora implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Mensagens retornadas para as validações
	final String NOT_EMPTY_MSG = "Campo Obrigatório";
	//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Email
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String email;

	@NotEmpty(message = NOT_EMPTY_MSG)
    private String name;
	
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String company;
	
	@NumberFormat
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String phone;
	
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String modal;
	
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String street_address;
	
	@NumberFormat
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String number_address;
	
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String neighborhood_address;
	
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String city_address;
	
	@Length(max = 2)
	@NotEmpty(message = NOT_EMPTY_MSG)
    private String uf_address;
   
	public Transportadora() {}
	
	public Transportadora(String email, String name, String company, String phone, String modal, String street_address,
			String number_address, String neighborhood_address, String city_address, String uf_address) {
		super();
		this.email = email;
		this.name = name;
		this.company = company;
		this.phone = phone;
		this.modal = modal;
		this.street_address = street_address;
		this.number_address = number_address;
		this.neighborhood_address = neighborhood_address;
		this.city_address = city_address;
		this.uf_address = uf_address;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getNumber_address() {
		return number_address;
	}
	public void setNumber_address(String number_address) {
		this.number_address = number_address;
	}
	public String getNeighborhood_address() {
		return neighborhood_address;
	}
	public void setNeighborhood_address(String neighborhood_address) {
		this.neighborhood_address = neighborhood_address;
	}
	public String getCity_address() {
		return city_address;
	}
	public void setCity_address(String city_address) {
		this.city_address = city_address;
	}
	public String getUf_address() {
		return uf_address;
	}
	public void setUf_address(String uf_address) {
		this.uf_address = uf_address;
	}

}
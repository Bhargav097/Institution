package com.loizenai.jwtauthentication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "username"
        }),
        @UniqueConstraint(columnNames = {
            "email"
        })
})
public class User{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=3, max = 50)
    private String inst_name;

    @NotBlank
    @Size(min=3, max = 50)
    private String fou_name;

    @NotBlank
    @Size(min=3, max = 50)
    private String affiliation;
    
    @NotBlank
    @Size(min=3, max = 50)
    private String address;
    
    @NotBlank
    @Size(min=3, max = 50)
    private String short_code;
    
    
    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String alt_email;
    
    @NotBlank
    @Size(min=3, max = 50)
    private String landline;
    
    @NotBlank
    @Size(min=3, max = 50)
    private Long contact;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", 
    	joinColumns = @JoinColumn(name = "user_id"), 
    	inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() {}

    public User(String inst_name, String fou_name, String affiliation, String address, String short_code, String email, String alt_email, String landline, Long contact, Set<Role> roles) {
    	this.inst_name = inst_name;
		this.fou_name = fou_name;
		this.affiliation = affiliation;
		this.address = address;
		this.short_code = short_code;
		this.email = email;
		this.alt_email = alt_email;
		this.landline = landline;
		this.contact = contact;
		this.roles = roles;
    }
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInst_name() {
		return inst_name;
	}

	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}

	public String getFou_name() {
		return fou_name;
	}

	public void setFou_name(String fou_name) {
		this.fou_name = fou_name;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShort_code() {
		return short_code;
	}

	public void setShort_code(String short_code) {
		this.short_code = short_code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlt_email() {
		return alt_email;
	}

	public void setAlt_email(String alt_email) {
		this.alt_email = alt_email;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(@NotBlank @Size(min = 3, max = 50) Long contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
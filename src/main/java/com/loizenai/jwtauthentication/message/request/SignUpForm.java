package com.loizenai.jwtauthentication.message.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)
    private String inst_name;

    @NotBlank
    @Size(min = 3, max = 50)
    private String fou_name;

    @NotBlank
    @Size(min = 3, max = 50)
    private String affiliation;
    
    @NotBlank
    @Size(min = 3, max = 50)
    private String address;
    
    @NotBlank
    @Size(min = 3, max = 50)
    private String short_code;
    
    @NotBlank
    @Size(max = 60)
    @Email
    private String email;
    
    @NotBlank
    @Size(max = 60)
    @Email
    private String alt_email;
    
    @NotBlank
    @Size(min = 3, max = 50)
    private String landline;
    
    @NotBlank
    @Size(min = 3, max = 50)
    private Long contact;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    public String getInst_name() {
        return inst_name;
    }

    public void setName(String name) {
        this.inst_name = name;
    }

    public String getFou_name() {
        return fou_name;
    }

    public void setUsername(String fou_name) {
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
    
    public @NotBlank @Size(min = 3, max = 50) Long getContact() {
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
    
    public Set<String> getRole() {
    	return this.role;
    }
    
    public void setRole(Set<String> role) {
    	this.role = role;
    }

	

	

	

	

	
	

	
}
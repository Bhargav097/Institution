package com.loizenai.jwtauthentication.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.loizenai.jwtauthentication.model.User;

public class UserPrinciple implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;

    private String inst_name;
    
    private String fou_name;
    
    private String affiliation;
    
    private String address;
    
    private String short_code;
    
    private String email;
    
    private String alt_email;
    
    private String landline;
    
    private Long contact;
    
    

    private Collection<? extends GrantedAuthority> authorities;
    
    
    
    public UserPrinciple(Long id, String inst_name, String fou_name, String affiliation, String address,
			String short_code, String email, String alt_email, String landline, Long contact, String password,
			List<GrantedAuthority> authorities) {
		
		this.id = id;
		this.inst_name = inst_name;
		this.fou_name = fou_name;
		this.affiliation = affiliation;
		this.address = address;
		this.short_code = short_code;
		this.email = email;
		this.alt_email = alt_email;
		this.landline = landline;
		this.contact = contact;
		this.authorities = authorities;
	}

	

    
	


	public static UserPrinciple build(User user) {
        List<GrantedAuthority> authorities = user.getRoles().stream().map(role ->
                new SimpleGrantedAuthority(role.getName().name())
        ).collect(Collectors.toList());

        return new UserPrinciple(
                user.getId(),
                user.getInst_name(),
                user.getFou_name(),
                user.getAffiliation(),
                user.getAddress(),
                user.getShort_code(),
                user.getEmail(),
                user.getAlt_email(),
                user.getLandline(),
                user.getContact(),
                user.getPassword(),
                authorities
        );
    }

    public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Long getId() {
		return id;
	}



	public String getInst_name() {
		return inst_name;
	}



	public String getFou_name() {
		return fou_name;
	}



	public String getAffiliation() {
		return affiliation;
	}



	public String getAddress() {
		return address;
	}



	public String getShort_code() {
		return short_code;
	}



	public String getEmail() {
		return email;
	}



	public String getAlt_email() {
		return alt_email;
	}



	public String getLandline() {
		return landline;
	}



	public Long getContact() {
		return contact;
	}



	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        UserPrinciple user = (UserPrinciple) o;
        return Objects.equals(id, user.id);
    }



	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}
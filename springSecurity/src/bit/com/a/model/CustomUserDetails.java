package bit.com.a.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/*
 
   CREATE TABLE USERTABLE(
  ID VARCHAR2(100) PRIMARY KEY,
  PASSWORD VARCHAR2(300) NOT NULL,
  NAME VARCHAR2(45) NOT NULL,
  AUTHORITY VARCHAR2(50) NOT NULL,
  ENABLED NUMBER(1) NOT NULL  
  ) 
   
 */

public class CustomUserDetails implements Serializable, UserDetails {
	
	private String ID;
	private String PASSWORD;
	private String NAME;
	private String AUTHORITY;     // 권한
	private boolean ENABLED;      // 접근 가능 여부 체크
	
	public CustomUserDetails() {
		
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

      ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
      auth.add(new SimpleGrantedAuthority(AUTHORITY));
		
		return auth;
	}

	@Override
	public String getPassword() {    
		// TODO Auto-generated method stub
		return PASSWORD;
	}

	@Override
	public String getUsername() { 
		// TODO Auto-generated method stub
		return ID;
	}

	@Override 
	public boolean isAccountNonExpired() {    // 계정 만료 여부

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {  // 계정 잠금 여부
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {  // 계정의 패스워드가 만료되지 않았는지
		
		return true;
	}

	@Override
	public boolean isEnabled() {   // 사용가능 여부
		
		return true;
	}
	
	

}

package com.zek.zull.example.bean;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * description：
 *
 * @author zhangkai
 * @date 2020/12/30 16:27
 */
public class SecurityUser implements Serializable, UserDetails {

    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    private static final long serialVersionUID = 1L;

    /**
     * 邮箱号码
     */
    private String email;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 使用状态(0正常使用中)
     */
    private Boolean sign;


    private List<SecurityRole> roleList;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSign() {
        return sign;
    }

    public void setSign(Boolean sign) {
        this.sign = sign;
    }

    public List<SecurityRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SecurityRole> roleList) {
        this.roleList = roleList;
    }

    public void setPassword(String password) {
        this.password = PASSWORD_ENCODER.encode(password);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //将用户角色作为权限
        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
        List<SecurityRole> roles = this.getRoleList();
        for (SecurityRole role : roles) {
            System.out.println(role.getCodeName());
            auths.add(new SimpleGrantedAuthority(role.getCodeName()));
        }
        return auths;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    //账户是否过期,过期无法验证
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //指定用户是否被锁定或者解锁,锁定的用户无法进行身份验证
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //指示是否已过期的用户的凭据(密码),过期的凭据防止认证
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //是否被禁用,禁用的用户不能身份验证
    @Override
    public boolean isEnabled() {
        return true;
    }
}

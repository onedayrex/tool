package com.git.onedayrex.tool.clone;

import com.xiaoleilu.hutool.clone.CloneRuntimeException;
import com.xiaoleilu.hutool.clone.Cloneable;

/**
 * created by onedayrex
 * 2017/10/21
 * 方法一，实现Cloneable接口，自己重写clone方法
 **/
public class User implements Cloneable<User>{

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User clone() {
        try {
            return (User)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }
}

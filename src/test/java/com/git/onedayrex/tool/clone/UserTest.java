package com.git.onedayrex.tool.clone;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by onedayrex
 * 2017/10/21
 **/
public class UserTest {
    @Test
    public void clones() throws Exception {
        User user = new User();
        user.setUsername("tom");
        user.setPassword("12345");
        System.out.println(user);
        User cloneUser = user.clone();
        user.setUsername("jack");
        System.out.println(cloneUser);
        System.out.println(user);
    }

}
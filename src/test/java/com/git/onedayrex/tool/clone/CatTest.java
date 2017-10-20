package com.git.onedayrex.tool.clone;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by onedayrex
 * 2017/10/21
 **/
public class CatTest {
    @Test
    public void clonecat() throws Exception {
        Cat cat = new Cat();
        cat.setCatname("katy");
        System.out.println(cat);
        Cat clonecat = cat.clone();
        cat.setCatname("willy");
        System.out.println(cat);
        System.out.println(clonecat);
    }

}
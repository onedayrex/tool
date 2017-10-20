package com.git.onedayrex.tool.clone;

import com.xiaoleilu.hutool.clone.CloneSupport;

/**
 * created by onedayrex
 * 2017/10/21
 * 方法二，继承CloneSupport，直接调用父类clone
 **/
public class Cat extends CloneSupport<Cat>{
    private String catname;

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catname='" + catname + '\'' +
                '}';
    }
}

package com.gb.uicollection.model;

/**
 * @author gaobo
 * @version V1.0
 * @Description: 控件模型
 * @date 16/11/10 下午3:06
 */
public class ViewModel {
    private String name;
    private String desc;

    public ViewModel(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

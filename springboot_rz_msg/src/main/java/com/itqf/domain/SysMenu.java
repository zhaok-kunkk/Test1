package com.itqf.domain;

import java.util.List;

public class SysMenu {
    private Long menuId;

    private Long parentId;

    private String name;

    private String url;

    private String perms;

    private Integer type;

    private String icon;

    private Integer orderNum;

    //新加入一个父节点字段
    private String parentName;
    
    //该菜单下的子菜单
    private List list;
    
    public void setList(List list) {
		this.list = list;
	}
    
    public List getList() {
		return list;
	}
    
    /**
	 * @param parentName the parentName to set
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
	/**
	 * @return the parentName
	 */
	public String getParentName() {
		return parentName;
	}
    
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}
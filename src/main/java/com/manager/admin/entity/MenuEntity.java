package com.manager.admin.entity;

/**
 * 菜单实体类
 */
public class MenuEntity {
    private Integer menuId;
    private String menuName;
    private Integer rootId;

    public MenuEntity(Integer menuId, String menuName, Integer rootId) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.rootId = rootId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", rootId=" + rootId +
                '}';
    }
}

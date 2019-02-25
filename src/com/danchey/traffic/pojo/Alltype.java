package com.danchey.traffic.pojo;

public class Alltype {
    private Integer id;

    private String name;

    private String typename;

    private Integer tabletypeId;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTabletypeId() {
        return tabletypeId;
    }

    public void setTabletypeId(Integer tabletypeId) {
        this.tabletypeId = tabletypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
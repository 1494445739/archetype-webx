package com.tzg.api.${package}.bean;

import java.io.Serializable;

public class FooDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    public Integer getId() { return id; }

    public void setId( Integer id ) { this.id = id; }

    public String getName() { return name; }

    public void setName( String name ) {this.name = name; }

    @Override
    public String toString() {
        return "Foo{" + " id=" + id + ", name=" + name + " }";
    }

}
package com.globallabs.springwebmvc.model;

public class Jedi {

    private String name;
    private String lastName;

    public Jedi(final String name, final String lastname) {
        this.name = name;
        this.lastName = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastname) {
        this.lastName = lastname;
    }

}

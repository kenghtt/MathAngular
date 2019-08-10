package com.math.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Project: springDB
 * Package: com.jeremy.springDB.model
 * <p>
 * User: jeremytouch
 * Date: 6/26/19
 * Time: 1:31 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="users")

public class UsersEntity {



    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private int salary;
    @Column(name = "company")
    private String company;

    public UsersEntity(){

    }

    public UsersEntity(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

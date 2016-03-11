package com.demo.myapp;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table (name="T_PERSON")
public class Person implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_person_id_seq")
    @SequenceGenerator(name="t_person_id_seq", sequenceName="t_person_id_seq", allocationSize=1)
    public Long getId() {
        return id;
    }
    
    public void setId(Long newId) {
        id = newId;
    }
    
    @Column(name="FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    
    @Column(name="LAST_NAME")
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
}

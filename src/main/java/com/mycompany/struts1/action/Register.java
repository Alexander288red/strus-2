/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.action;

import com.opensymphony.xwork2.ActionSupport;
import com.mycompany.struts1.model.Person;
/**
 *
 * @author Jeanc
 */
public class Register extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Person personBean;

    public String execute() {
        // Aquí puedes añadir lógica adicional para guardar el registro en la base de datos si es necesario
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        this.personBean = person;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Ben Kafirongo
 */
public class Personne {

    private String name;
    private String lastName;
    private int age;
    private String adresse;

    public Personne() {
    }

    public Personne(String name, String lastName, int age, String adresse) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", adresse=" + adresse + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}

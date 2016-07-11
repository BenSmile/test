/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjpa;

import entity.Personne;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ben Kafirongo
 */
public class TestJPA {

    /**
     * @param args the command line arguments
     * @throws testjpa.NameException
     */
    public static void main(String[] args) throws NameException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cl = Personne.class;
        Constructor[] constructors = cl.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }
        Field[] declaredFields = cl.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
        String name = cl.getName();
        System.out.println("name = " + name);
        
        Class<?> forName = Class.forName(name);
        Object newInstance = forName.newInstance();
        System.out.println("newInstance = " + newInstance);
}
}
class NameException extends Exception {

    public NameException() {
        System.out.println("Vouz avez entrer un nom nul");
    }

    public NameException(String message) {
        super(message);
    }
}


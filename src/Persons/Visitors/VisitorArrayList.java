/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import List.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Braya
 */
public class VisitorArrayList implements List<Visitor> {
    
    ArrayList<Visitor> Array;

    public VisitorArrayList() {
        this.Array = new ArrayList();
    }
    
    @Override
    public boolean add(Visitor t) {
        if (t != null) {
            return Array.add(t);
        }
        return false;
    }

    @Override
    public boolean delete(Visitor t) {
          return Array.remove(t); 
    }

    @Override
    public Visitor find(Object id) {
        for (Visitor t : Array) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null; // No encontrado
    }

    @Override
    public void showall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Método nuevo para obtener tamaño
    public int size() {
        return Array.size();
    }

    // Método nuevo para obtener visitante por índice
    public Visitor get(int index) {
        return Array.get(index);
    }
    
}

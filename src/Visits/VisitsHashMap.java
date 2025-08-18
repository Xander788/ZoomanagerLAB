/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import List.List;
import Persons.Visitors.Visitor;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Braya
 */
public class VisitsHashMap implements List<Visit>{
    HashMap<Visitor, Visit> visitMap;

    public VisitsHashMap() {
        this.visitMap = new HashMap();
    }

    @Override
    public boolean add(Visit t) {
        if(t != null && !visitMap.containsKey(t.getVisitor())) { // evita duplicados por visitor
            visitMap.put(t.getVisitor(), t);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Visit t) {
        if(t != null && visitMap.containsKey(t.getVisitor())) {
            visitMap.remove(t.getVisitor());
            return true;
        }
        return false;
    }

    @Override
    public Visit find(Object id) {
        for(Visitor v : visitMap.keySet()) {
            if(v.getId().equals(id)) {
                return visitMap.get(v);
            }
        }
        return null; // No encontrado
    }

    @Override
    public void showall() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Collection<Visit> values() {
        return visitMap.values();
    }
}
    


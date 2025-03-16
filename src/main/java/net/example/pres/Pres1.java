/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.example.pres;

/**
 *
 * @author bourezzoukmohamed
 */
import net.example.dao.DaoImpl;
import net.example.ext.DaoImplV2;
import net.example.metier.MetierImp;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImp metier = new MetierImp(d);
        //metier.setDao(d);// Injection des dépendances via le setter
        System.out.println("RES= "+metier.calcul());
    }
}


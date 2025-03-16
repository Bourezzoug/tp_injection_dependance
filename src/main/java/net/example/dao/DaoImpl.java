/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.example.dao;

/**
 *
 * @author bourezzoukmohamed
 */
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("d")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double t = 34;
        return t;
    }
}

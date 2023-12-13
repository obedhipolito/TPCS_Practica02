/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tpcs_practica2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author obed
 */
public class TPCS_PRACTICA2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SessionFactory sessionFactory= HiberneteUtil.getSessionFactory();
        
        Empleado emp= new Empleado();
        emp.setNombre("obed");
        emp.setDireccion("orizaba");
        emp.setTelefono("222");
        
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        
        session.save(emp);
        
        t.commit();
        session.close();
    }
}

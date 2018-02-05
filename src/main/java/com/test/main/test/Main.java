package com.test;
/*import java.util.List;*/
/*
import org.hibernate.Query;
import org.hibernate.Session;*/

public class Main {
  /*public static void main(String[] args) throws Exception {
    HibernateUtil hibernateUtil = new HibernateUtil();
    hibernateUtil
        .executeSQLCommand("create table Product(id int, name varchar, description varchar, price decimal(6,2), supplierid int)");

    hibernateUtil.executeSQLCommand("create table Supplier (id int , name varchar)");

    hibernateUtil
        .executeSQLCommand("create table Software(id int, name varchar, description varchar, price decimal(6,2), supplierid int, version varchar)");

    Session session = hibernateUtil.getSession();

    Supplier superCorp = new Supplier();
    superCorp.setName("Supplier1");
    session.save(superCorp);

    Supplier megaInc = new Supplier();
    megaInc.setName("Supplier2");
    session.save(megaInc);

    Product mouse = new Product("Product1", "first product", 20.0);
    mouse.setSupplier(superCorp);
    superCorp.getProducts().add(mouse);
    session.flush();
    Product mouse2 = new Product("Product2", "second product", 22.0);
    mouse2.setSupplier(superCorp);
    superCorp.getProducts().add(mouse2);

    Product keyboard = new Product("Product3", "third product", 30.0);
    keyboard.setSupplier(megaInc);
    megaInc.getProducts().add(keyboard);

    Software webBrowser = new Software("Web Browser", "new browser", 75.0, "2.0");
    webBrowser.setSupplier(superCorp);
    superCorp.getProducts().add(webBrowser);

    Software email = new Software("Email", "email client", 49.99, "4.1 Edition");
    email.setSupplier(megaInc);
    megaInc.getProducts().add(email);
    session.flush();
    
    Query query = session.getNamedQuery("Product.SQLpricing");
    query.setDouble("price", 30);
    
    List results = query.list();
    
    System.out.println(results);

    session.close();
    hibernateUtil.checkData("select * from Product");
    hibernateUtil.checkData("select * from Software");
    hibernateUtil.checkData("select * from Supplier");
  }*/
}
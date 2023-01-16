package com.joanmoncho.tiendavintage;

import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class TiendaVintageApplication {
    public static void main(String[] args) {
        SpringApplication.run(TiendaVintageApplication.class, args);

        //StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();

        //SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();

        //Session session = sf.openSession();

        /*User user = new User();
        user.setId(1);
        user.setUserName("Pepe");
        user.setUserMesagge("Hola mundo de Pepe");

        User user2 = new User();
        user2.setId(2);
        user2.setUserName("Juan");
        user2.setUserMesagge("Hola mundo de Juan");

        session.getTransaction().begin();

        session.save(user);
        session.save(user2);

        session.getTransaction().commit();

        session.close();
        sf.close();
         */
    }

}

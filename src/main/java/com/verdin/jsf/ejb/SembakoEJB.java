package com.verdin.jsf.ejb;

import com.verzinen.jpa.entity.Sembako;
import org.primefaces.PrimeFaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.sql.DataSource;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class SembakoEJB implements Serializable {
    static final long serialVersionUID = 1997l;
    static EntityManagerFactory factory = null;
    static EntityManager entityManager = null;

    Sembako sembako;
    List<Sembako> sembakos;
    int i = 0;
    String jenis;
    int harga, stok;

    Sembako updateSembako;

    @PostConstruct
    public void init() {
        try {
            Thread.currentThread().setContextClassLoader(Sembako.class.getClassLoader());
            factory = Persistence.createEntityManagerFactory("TrainingUnit");
            entityManager = factory.createEntityManager();
            readSembako();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void readSembako() {
        try {
            sembakos = new ArrayList<Sembako>();
            Query query = entityManager.createQuery("SELECT x FROM Sembako x");
            sembakos = query.getResultList();
            System.out.println("Isi Sembako ============= : " + sembakos);

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public void insertSembako() {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            i = i + 1;
            transaction.begin();
            sembako.setJenis(jenis);
            sembako.setHarga(harga);
            sembako.setStok(stok);
            entityManager.persist(sembako);
            transaction.commit();
            init();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                System.out.println("running .... persistCourse transaction.isActive()");
                transaction.rollback();
            }
        }
    }

    public void delSembako(int idSembako) {
        try {
            entityManager.getTransaction().begin();

            entityManager.flush();
            entityManager.clear();

            Query query = entityManager.createQuery("DELETE Sembako b WHERE id = :id", Sembako.class);
            query.setParameter("id", idSembako);
            query.executeUpdate();

            entityManager.getTransaction().commit();
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void formUpdate(int idSembako) {

        TypedQuery<Sembako> query = entityManager.createQuery("SELECT s FROM Sembako s WHERE id = :id", Sembako.class);
        query.setParameter("id", idSembako);
        updateSembako = new Sembako();
        updateSembako = query.getSingleResult();
        init();
        PrimeFaces current = PrimeFaces.current();
        current.executeScript("PF('dlg4').show();");

    }

    public void prosesUpdateSembako(int idSembako, String jenisSembako,int hargaSembako, int stokSembako) {

        try {
            Sembako sembakoUpdate = new Sembako();
            sembakoUpdate =  entityManager.find(Sembako.class, idSembako);

            entityManager.getTransaction().begin();

            sembakoUpdate.setJenis(jenisSembako);
            sembakoUpdate.setHarga(hargaSembako);
            sembakoUpdate.setStok(stokSembako);

            entityManager.getTransaction().commit();
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Sembako getSembako() {
        return sembako;
    }

    public void setSembako(Sembako sembako) {
        this.sembako = sembako;
    }

    public List<Sembako> getSembakos() {
        return sembakos;
    }

    public void setSembakos(List<Sembako> sembakos) {
        this.sembakos = sembakos;
    }

    public Sembako getUpdateSembako() {
        return updateSembako;
    }

    public void setUpdateSembako(Sembako updateSembako) {
        this.updateSembako = updateSembako;
    }
}


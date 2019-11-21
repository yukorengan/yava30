package com.verdin.jsf.ejb;

import com.verzinen.jpa.entity.Sembako;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class SembakoManager {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Sembako> loadAllSembako() {
        return this.entityManager.createQuery("SELECT c FROM Sembako c", Sembako.class).getResultList();
    }

    public void delete(Sembako sembako) {
        if (entityManager.contains(sembako)) {
            entityManager.remove(sembako);
        } else {
            Sembako sembakoBean = entityManager.find(Sembako.class, sembako.getId());
            if (sembakoBean != null) {
                entityManager.remove(sembakoBean);
            }
        }
    }

    public void addNewSembako(Sembako sembako) {
        Sembako newSembako = new Sembako();
        newSembako.setJenis(sembako.getJenis());
        newSembako.setHarga(sembako.getHarga());
        newSembako.setStok(sembako.getStok());
        this.entityManager.persist(newSembako);
    }

    public void update(List<Sembako> sembakoBean) {
        sembakoBean.forEach(entityManager::merge);
    }
}

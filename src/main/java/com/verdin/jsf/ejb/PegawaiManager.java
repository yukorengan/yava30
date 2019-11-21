package com.verdin.jsf.ejb;

import com.verdin.jsf.bean.PegawaiBean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.UUID;

@Stateless
public class PegawaiManager {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PegawaiBean> loadAllPegawai() {
        return this.entityManager.createQuery("SELECT c FROM PegawaiBean c", PegawaiBean.class).getResultList();
    }

    public void delete(PegawaiBean pegawai) {
        if (entityManager.contains(pegawai)) {
            entityManager.remove(pegawai);
        } else {
            PegawaiBean pegawaiBean = entityManager.find(PegawaiBean.class, pegawai.getId());
            if (pegawaiBean != null) {
                entityManager.remove(pegawaiBean);
            }
        }
    }

    public void addNewPegawai(PegawaiBean pegawai) {
        PegawaiBean newPegawai = new PegawaiBean();
        newPegawai.setName(pegawai.getName());
        newPegawai.setAddress(pegawai.getAddress());
        newPegawai.setRole(pegawai.getRole());
        newPegawai.setHandphone(pegawai.getHandphone());
        newPegawai.setId(UUID.randomUUID().toString().substring(0, 8));

        this.entityManager.persist(newPegawai);
    }

    public void update(List<PegawaiBean> pegawaiBeans) {
        pegawaiBeans.forEach(entityManager::merge);
    }
}

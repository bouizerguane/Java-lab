package TP13.service;

import TP13.bean.Profile;
import TP13.dao.Dao;
import TP13.dao.ListDao;
import java.util.List;

public class ProfileService {
    private final Dao<Profile> dao = new ListDao<>();

    public Profile create(String code, String desc) {
        Profile p = new Profile(code, desc);
        dao.create(p);
        return p;
    }

    public Profile update(Profile p) {
        return dao.update(p);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public Profile findById(int id) {
        return dao.findById(id);
    }

    public List<Profile> findAll() {
        return dao.findAll();
    }
}


package com.DB.IBO.ServiceClass;

import com.DB.IBO.ModelClass.Bonds;
import com.DB.IBO.Repository.BondsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BondsService {

    @Autowired
    private BondsRepository bondsRepository;

    public Bonds saveBonds(Bonds bonds) {
        return bondsRepository.save(bonds);
    }

    public List<Bonds> getAllBonds() {
        return (List<Bonds>) bondsRepository.findAll();
    }

    public Optional<Bonds> getBondById(int id) {
        return bondsRepository.findById(id);
    }

    public Bonds updateBonds(Bonds bonds) {
        return bondsRepository.save(bonds);
    }

    public void deleteBonds(int id) {
        bondsRepository.deleteById(id);
    }
}
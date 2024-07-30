package com.DB.IBO.Repository;

import com.DB.IBO.ModelClass.Bonds;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondsRepository extends CrudRepository<Bonds, Integer> {
}
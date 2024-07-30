package com.DB.IBO.Repository;

import com.DB.IBO.ModelClass.Stock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StockRepository extends CrudRepository<Stock, Integer>{

    // Find stock by name

    List<Stock> findStockByName(String name);

    @Query("Select s from Stocks WHERE s.name=?1")
    List<Stock> findStockByNameJPQL(String name);


}

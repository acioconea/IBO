package com.DB.IBO.Controller;

import com.DB.IBO.ModelClass.Bonds;
import com.DB.IBO.ServiceClass.BondsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bonds")
public class BondsController {

    @Autowired
    private BondsService bondsService;

    @PostMapping
    public ResponseEntity<Bonds> createBond(@RequestBody Bonds bonds) {
        return ResponseEntity.ok(bondsService.saveBonds(bonds));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Bonds>> getAllBonds() {
        return ResponseEntity.ok(bondsService.getAllBonds());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bonds> getBondById(@PathVariable int id) {
        return bondsService.getBondById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bonds> updateBond(@PathVariable int id, @RequestBody Bonds bonds) {
        bonds.setId(id);
        return ResponseEntity.ok(bondsService.updateBonds(bonds));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBond(@PathVariable int id) {
        bondsService.deleteBonds(id);
        return ResponseEntity.noContent().build();
    }
}
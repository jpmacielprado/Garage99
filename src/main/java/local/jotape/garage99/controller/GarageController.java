package local.jotape.garage99.controller;

import java.util.List;
import local.jotape.garage99.entities.Veiculos;
import local.jotape.garage99.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */
@RestController
public class GarageController {
    
    @Autowired
    private GarageService garageService;
    
    /**
     * Endpoint /Garage/veiculos
     * Retorna TODOS os veículos 
     * @Return
     */
    @GetMapping("/veiculos")
    public List<Veiculos> findAll() {
        List<Veiculos> result = garageService.findAll();
        return result;
    }
    
    
    /**
     * EndPoint /veiculos/cor/{cor}
     * @param cor
     * @return
     */
    @GetMapping("/veiculos/{cor}")
    public ResponseEntity<List<Veiculos>> findByCorIgnoreCose(@PathVariable String cor) {
        List<Veiculos> result = garageService.findByCor(cor);
        
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
            
        }else{
            return ResponseEntity.ok(result);
        }

    }
}

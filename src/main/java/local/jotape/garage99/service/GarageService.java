
package local.jotape.garage99.service;

import java.util.List;
import local.jotape.garage99.entities.Veiculos;
import local.jotape.garage99.repositories.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class GarageService {
    @Autowired
    private GarageRepository garageRepository;
    
    public List<Veiculos> findAll() {
        
        List<Veiculos> result = garageRepository.findAll();
        return result;
    }
    
    
    /**
     * retorna veiculos filtrados por cor
     * @param cor
     * @return
     */
    public List<Veiculos> findByCor(String cor){
        List<Veiculos> result = garageRepository.findByCorIgnoreCase(cor);
        return result;
    }
    
    
    /**
     * retorna veiculos filtrados por ano
     * @param ano
     * @return
     */
    public List<Veiculos> findByAno(int ano){
        List<Veiculos> result = garageRepository.findByAno(ano);
        return result;
    }
}

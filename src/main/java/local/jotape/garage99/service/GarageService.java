
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
    
}

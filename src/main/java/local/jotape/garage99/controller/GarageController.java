package local.jotape.garage99.controller;

import java.util.List;
import local.jotape.garage.DTO.VeiculoDTO;
import local.jotape.garage99.entities.Veiculo;
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
     * Endpoint /Garage/forsale
     * Retorna TODOS os veículos 
     * @Return
     */
    @GetMapping("/forsale")
    public List<VeiculoDTO> findAll() {
        List<VeiculoDTO> result = garageService.findAll();
        return result;
    }
    
    
    
    /**
     * Endpoint /Forsale/id
     * Retorna o veiculo do respectivo id
     * @param id
     *@return
     */
    @GetMapping("/forsale/{id}")
    public ResponseEntity<List<Veiculo>> findById(@PathVariable long id) {
        List<Veiculo> result = garageService.findById(id);
        
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
            
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
    
    /**
     * EndPoint /veiculos/cor/{cor}
     * @param cor
     * @return
     */
    @GetMapping("/color/{cor}")
    public ResponseEntity<List<VeiculoDTO>> findByCorIgnoreCose(@PathVariable String cor) {
        List<VeiculoDTO> result = garageService.findByCor(cor);
        
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
            
        }else{
            return ResponseEntity.ok(result);
        }

    }
    
    /**
     * EndPoint /veiculos/ano/{ano}
     * @param ano
     * @return 
     */
    @GetMapping("/year/{ano}")
    public ResponseEntity<List<VeiculoDTO>> findByAnoIgnoreCase(@PathVariable int ano) {
        List<VeiculoDTO> result = garageService.findByAno(ano);
        
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
            
        }else{
            return ResponseEntity.ok(result);
        }
    }
    
}

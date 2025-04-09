
package local.jotape.garage99.service;

import java.util.List;
import static java.util.stream.Collectors.toList;
import local.jotape.garage.DTO.VeiculoDTO;
import local.jotape.garage99.entities.Veiculo;
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
    
    
    public List<VeiculoDTO> findAll() {    
        List<Veiculo> resultGarage = garageRepository.findAll();
        
        List<VeiculoDTO> resultDTO = resultGarage.stream()
                .map (x -> new VeiculoDTO(x)).toList();
                
        return resultDTO;
    }
    
    
    /**
     * retorna veiculos filtrados por id
     * @param id
     * @return
     */
    public List<Veiculo> findById(long id){
        List<Veiculo> result = garageRepository.findById(id);
        return result;
    }
    
    /**
     * retorna veiculos filtrados por cor
     * @param cor
     * @return
     */
    public List<VeiculoDTO> findByCor(String cor){
        List<Veiculo> resultGarage = garageRepository.findByCorIgnoreCase(cor);
        
        List<VeiculoDTO> resultDTO = resultGarage.stream()
                .map(x -> new VeiculoDTO(x)).toList();
        
        return resultDTO;
    }
    
    
    /**
     * retorna veiculos filtrados por ano
     * @param ano
     * @return
     */
    public List<VeiculoDTO> findByAno(int ano){
        List<Veiculo> resultGarage = garageRepository.findByAno(ano);
        
        List<VeiculoDTO> resultDTO = resultGarage.stream()
                .map(x -> new VeiculoDTO(x)).toList();
        
        return resultDTO;
    }
    
}

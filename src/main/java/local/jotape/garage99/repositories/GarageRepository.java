/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.jotape.garage99.repositories;

import java.util.List;
import local.jotape.garage99.entities.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface GarageRepository  extends JpaRepository<Veiculos, Long> {
    
    List<Veiculos> findByCorIgnoreCase(String cor);
    
}
    


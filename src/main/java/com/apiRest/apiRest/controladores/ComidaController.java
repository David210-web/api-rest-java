package com.apiRest.apiRest.controladores;

import com.apiRest.apiRest.entidades.ComidaEntity;
import com.apiRest.apiRest.servicio.ComidaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comidas")
public class ComidaController {
    private final ComidaService comidaService;

    public ComidaController(ComidaService comidaService) {
        this.comidaService = comidaService;
    }

    @GetMapping
    public List<ComidaEntity> obtenerComidas(){
        return comidaService.obtenerTodo();
    }

    @PostMapping
    public ComidaEntity agregarComida(@RequestBody ComidaEntity comida){
        return comidaService.agregarComida(comida);
    }

    @PutMapping("/{id}")
    public ComidaEntity actualizarComida(@PathVariable Long id, @RequestBody ComidaEntity comida){
        return comidaService.actualizarComida(id,comida);
    }

    @DeleteMapping("/{id}")
    public void eliminarComida(@PathVariable Long id){
        comidaService.EliminarComida(id);
    }
}

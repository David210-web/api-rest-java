package com.apiRest.apiRest.servicio;

import com.apiRest.apiRest.entidades.ComidaEntity;
import com.apiRest.apiRest.repositorios.ComidaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ComidaServiceImpl implements ComidaService{
    private final ComidaDAO comidaDAO;

    @Autowired
    public ComidaServiceImpl(ComidaDAO comidaDAO) {
        this.comidaDAO = comidaDAO;
    }

    @Override
    public List<ComidaEntity> obtenerTodo() {
        return comidaDAO.findAll();
    }

    @Override
    public ComidaEntity agregarComida(ComidaEntity comida) {
        return comidaDAO.save(comida);
    }

    @Override
    @Transactional
    public ComidaEntity actualizarComida(Long id,ComidaEntity comida) {
        ComidaEntity comidaExistente = comidaDAO.findById(id).orElseThrow(()->new RuntimeException("Comida no encontrada"));
        comidaExistente.setNombre(comida.getNombre());
        comidaExistente.setDescripcion(comida.getDescripcion());
        comidaExistente.setPrecio(comida.getPrecio());
        comidaExistente.setCalorias(comida.getCalorias());

        return comidaDAO.save(comidaExistente);
    }

    @Override
    @Transactional
    public void EliminarComida(Long id) {
        if(!comidaDAO.existsById(id)){
            throw new RuntimeException("No se puede eliminar, comida no existente");
        }
        comidaDAO.deleteById(id);
    }
}

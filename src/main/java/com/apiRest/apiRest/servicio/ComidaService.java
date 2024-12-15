package com.apiRest.apiRest.servicio;

import com.apiRest.apiRest.entidades.ComidaEntity;

import java.util.List;

public interface ComidaService {
    List<ComidaEntity> obtenerTodo();
  //  ComidaEntity obtenerByNombre(String nombre);
    ComidaEntity agregarComida(ComidaEntity comida);
    ComidaEntity actualizarComida(Long id,ComidaEntity comida);
    void EliminarComida(Long id);
}

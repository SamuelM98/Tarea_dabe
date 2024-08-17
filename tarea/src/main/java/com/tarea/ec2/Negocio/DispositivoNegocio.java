package com.tarea.ec2.Negocio;

import com.tarea.ec2.Entidades.Dispositivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispositivoNegocio {
    @Autowired
    private com.tarea.ec2.Repositorio.DispositivoRepositorio dispositivoRepositorio;

    public Dispositivo grabar(Dispositivo dispositivo) {
        return dispositivoRepositorio.save(dispositivo);
    }

    public List<Dispositivo> obtenerDispositivo(){
        return (List<Dispositivo>) dispositivoRepositorio.findAll();
    }

    public Dispositivo actualizar(Dispositivo dispositivo){
        Dispositivo d = dispositivoRepositorio.findById(dispositivo.getIdDispositivo()).get();
        if (d!= null){
            return dispositivoRepositorio.save(dispositivo);
        }else {
            return null;
        }
    }

    public Dispositivo borrarDispositivo(Long idDispositivo) {
        Dispositivo d = dispositivoRepositorio.findById(idDispositivo).get();
        if (d!= null) {
            dispositivoRepositorio.delete(d);
        } else {
            return null;
        }
        return d;
    }
}

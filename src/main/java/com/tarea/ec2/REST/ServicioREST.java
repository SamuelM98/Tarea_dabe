package com.tarea.ec2.REST;
import com.tarea.ec2.Entidades.Dispositivo;
import com.tarea.ec2.Negocio.DispositivoNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController
@RequestMapping("tarea")

public class ServicioREST {
    @Autowired
    private DispositivoNegocio dispositivoNegocio;
    @PostMapping("/dispositivo")
    public Dispositivo grabar(@RequestBody Dispositivo dispositivo){
        return dispositivoNegocio.grabar(dispositivo);
    }
    @GetMapping("dispositivos")
    public List<Dispositivo> obtenerDispositivo(){
        try{
            return dispositivoNegocio.obtenerDispositivo();
        }
        catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No es posible obtener los datos");
        }
    }
    @PutMapping("/actualizar")
    public Dispositivo actualizar(@RequestBody Dispositivo dispositivo){
        try{
            return dispositivoNegocio.actualizar(dispositivo);
        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"No es posible actualizar");
        }
    }
    @DeleteMapping("/dispositivo/{idDispositivo}")
    public Dispositivo borrarDispositivo(@PathVariable(value = "idDispositivo") Long idDispositivo){
        return dispositivoNegocio.borrarDispositivo(idDispositivo);
    }
}

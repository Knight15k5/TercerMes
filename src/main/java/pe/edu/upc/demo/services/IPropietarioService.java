package pe.edu.upc.demo.services;

import pe.edu.upc.demo.entities.Propietario;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IPropietarioService {
    public void insertar(Propietario propietario);
    List<Propietario> listar();

    public void eliminar(int id);

    public Optional<Propietario> listarId(int id);

    List<Propietario> buscarTitulo(String title);

    List<Propietario> findBydate(Date date);


}

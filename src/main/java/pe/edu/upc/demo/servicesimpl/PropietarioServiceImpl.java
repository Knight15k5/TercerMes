package pe.edu.upc.demo.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo.entities.Propietario;
import pe.edu.upc.demo.repositories.IPropietarioDAO;
import pe.edu.upc.demo.services.IPropietarioService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
@Autowired
    private IPropietarioDAO dPropietario;
    @Override
    public void insertar(Propietario propietario) {
        dPropietario.save(propietario);
    }

    @Override
    public List<Propietario> listar() {
        return dPropietario.findAll();
    }

    @Override
    public void eliminar(int id) {
        dPropietario.deleteById(id);
    }

    @Override
    public Optional<Propietario> listarId(int id) {
        return dPropietario.findById(id);
    }


    @Override
    public List<Propietario> buscarTitulo(String title) {
        return dPropietario.buscarTitulo(title);
    }

    @Override
    public List<Propietario> findBydate(Date date) {
        return dPropietario.findBydate(date);
    }


}

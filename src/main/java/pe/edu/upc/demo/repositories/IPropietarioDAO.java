package pe.edu.upc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo.entities.Propietario;

import java.util.Date;
import java.util.List;

@Repository
public interface IPropietarioDAO extends JpaRepository<Propietario,Integer> {

    @Query("from Propietario p where p.title like %:title%")
    List<Propietario> buscarTitulo(@Param("title") String title);

    List<Propietario> findBydate(Date date);
}

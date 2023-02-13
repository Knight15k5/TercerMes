package pe.edu.upc.demo.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Citas")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title",length = 35,nullable = false)
    private  String title;

    @Column(name = "dates")
    @JsonSerialize(using = ToStringSerializer.class)
    private LocalDate date;

    @Column(name = "descripcion",length = 200,nullable = false)
    private String descripcion;

    public Propietario() {
    }

    public Propietario(int id, String title, LocalDate date, String descripcion) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

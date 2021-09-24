/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.estudiantesLab.sessionentities;

import co.estudiantesLab.entidades.Curso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface CursoFacadeLocal {

    void create(Curso curso);

    void edit(Curso curso);

    void remove(Curso curso);

    Curso find(Object id);

    List<Curso> findAll();

    List<Curso> findRange(int[] range);

    int count();
    
    boolean addCurso(Curso curso);

    boolean editCurso(Curso curso);

    boolean deleteCurso(String codigo);

    Curso getCurso(String codigo);

    List<Curso> getAllCursos();
}

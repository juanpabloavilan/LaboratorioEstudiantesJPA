package co.estudiantesLab.entidades;

import co.estudiantesLab.entidades.Curso;
import co.estudiantesLab.entidades.Estudiante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-24T15:49:55")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, Curso> codigocurso;
    public static volatile SingularAttribute<Registro, Estudiante> codigoestudiante;
    public static volatile SingularAttribute<Registro, Integer> id;

}
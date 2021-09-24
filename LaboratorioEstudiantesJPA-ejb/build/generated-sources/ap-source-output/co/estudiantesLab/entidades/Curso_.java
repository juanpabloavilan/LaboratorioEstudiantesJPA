package co.estudiantesLab.entidades;

import co.estudiantesLab.entidades.Registro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-09-24T15:49:55")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, Integer> totalestudiantes;
    public static volatile SingularAttribute<Curso, String> codigo;
    public static volatile CollectionAttribute<Curso, Registro> registroCollection;
    public static volatile SingularAttribute<Curso, Integer> creditos;
    public static volatile SingularAttribute<Curso, Integer> semestre;
    public static volatile SingularAttribute<Curso, String> nombre;

}
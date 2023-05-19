package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        // Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba que
        //instancie objetos de los distintos tipos y pruebe los métodos desarrollados

        Estudiante e1 = new Estudiante("Matias", "Dupont", 44242242, EstadoCivil.SOLTERO);
        //Hago una matriculacion en la materia "IDIOMAS" al alumno a1
        e1.matriculacionNuevoCurso(Curso.IDIOMAS);
        //Vuelvo a hacer una matriculacion de la misma materia al mismo alumno a1 por lo que deberia devolver un cartel diciendo el "error"
        e1.matriculacionNuevoCurso(Curso.IDIOMAS);
        //Hago una matriculacion en la materia "INFORMATICA" al alumno a1
        e1.matriculacionNuevoCurso(Curso.INFORMATICA);
        //Hago una modificacion en el estado civil al alumno a1
        e1.setEstadoCivil(EstadoCivil.UNION_LIBRE);
        //Vuelvo a hacer una modificacion en el estado civil al alumno a1 por lo que deberia devolver un cartel diciendo el "error"
        e1.setEstadoCivil(EstadoCivil.UNION_LIBRE);
        System.out.println(e1);

        System.out.println();

        Profesor p1 = new Profesor("Carlo", "Ancelotti", 12098803, EstadoCivil.CASADO, 2020, Departamento.QUIMICA);
        p1.setNumeroDespacho(2);
        //Realizo el cambio de departamento al profesor p1
        p1.setDepartamento(Departamento.CIENCIAS_DE_LA_ADMINISTRACION);
        //Vuelvo a realizar un cambio del mismo departamento al mismo profesor p1 por lo que deberia devolver un cartel diciendo el "error"
        p1.setDepartamento(Departamento.CIENCIAS_DE_LA_ADMINISTRACION);
        //Realizo un ultimo cambio de departamento al mismo profesor p1
        p1.setDepartamento(Departamento.ARQUITECTURA);
        //Hago una modificacion en el estado civil al profesor p1
        p1.setEstadoCivil(EstadoCivil.COMPROMETIDO);
        //Vuelvo a hacer una modificacion en el estado civil al profesor p1 por lo que deberia devolver un cartel diciendo el "error"
        p1.setEstadoCivil(EstadoCivil.COMPROMETIDO);
        System.out.println(p1);

        System.out.println();

        PersonalServicio pds1 = new PersonalServicio("Juan", "Gutis", 34988006, EstadoCivil.EN_PAREJA, 2017, Seccion.DECANATO);
        //Dado que ese numero de despacho ya existe, arrojara un 'error' y el sistema le asignara uno de manera automatica
        pds1.setNumeroDespacho(2);
        //Hago el traslado del personal de servicio pds1
        pds1.trasladoDeSeccion(Seccion.LABORATORIOS);
        //Vuelvo a hacer el traslado del mismo personal de servicio pds1 a la misma Seccion por lo que deberia devolver un cartel diciendo el "error"
        pds1.trasladoDeSeccion(Seccion.LABORATORIOS);
        //Hago un ultimo traslado del mismo personal de servicio pds1
        pds1.trasladoDeSeccion(Seccion.SECRETARIA);
        //Como este numero de despacho no lo tiene ningun tipo de empleado por el momento, se le asignara correctamente
        pds1.setNumeroDespacho(3);
        pds1.setNumeroDespacho(4);
        //Hago una modificacion en el estado civil al profesor pds1
        pds1.setEstadoCivil(EstadoCivil.OTRO);
        //Vuelvo a hacer una modificacion en el estado civil al profesor pds1 por lo que deberia devolver un cartel diciendo el "error"
        pds1.setEstadoCivil(EstadoCivil.OTRO);
        System.out.println(pds1);

        System.out.println();
        PersonalServicio pds2 = new PersonalServicio("Juan", "Gutis", 34988006, EstadoCivil.EN_PAREJA, 2017, Seccion.DECANATO);
        pds2.setNumeroDespacho(3);
        System.out.println(pds2);
    }
}

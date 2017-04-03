package domain;


import javax.ejb.EJB;
import javax.ejb.Stateless;

import domain.Alumno;
import service.AlumnoEJB;

@Stateless
public class Main {
	
	@EJB
	private static AlumnoEJB alumnoEjb;

	public static void main (String[] args)
	{
		Alumno alumnoPrueba2= new Alumno("Adrian", "33551492N", 28, "aasdf@gmail.com", "BernardoCahcha", 32004, "Ourense", "Ourense", 646867768,"Ramon" ,"33551498P" ,"30%" , "Prueba1");
		Alumno alumnoPrueba= alumnoEjb.createAlumno("Adrian", "33551492N", 28, "aasdf@gmail.com", "BernardoCahcha", 32004, "Ourense", "Ourense", 646867768,"Ramon" ,"33551498P" ,"30%" , "Prueba1");
		System.out.println(alumnoPrueba.getDni());
		System.out.println(alumnoPrueba2.getDni());
	}
}

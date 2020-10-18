package controller;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Metodos {
	
	public static calculoEdad (String fechaNacimiento){
	    
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        return periodo.getYears();
    //    System.out.printf("Tienes: %s años",periodo.getYears());
        }
       
        

        }



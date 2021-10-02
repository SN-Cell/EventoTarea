package Modelo;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class ConvYearsEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01/01/2000
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNac = LocalDate.parse("15/08/1993", fmt);
		LocalDate Actualidad = LocalDate.now();

		Period periodo = Period.between(fechaNac, Actualidad);
		System.out.printf("La edad del cliente es: %s años",
		                    periodo.getYears());
	}

}

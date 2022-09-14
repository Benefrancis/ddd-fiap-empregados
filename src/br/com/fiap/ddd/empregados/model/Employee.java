package br.com.fiap.ddd.empregados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Modelo que representará um empregado
 * 
 * @author Francis
 * 
 *         Depende da instalação do lombok (ele gera os getters and setters)
 * 
 * @see "https://projectlombok.org/"
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private String title;
	private int yearOfJoining;
	private double salary;

}

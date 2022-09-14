package br.com.fiap.ddd.empregados;

import java.util.List;
import java.util.Map;

import br.com.fiap.ddd.empregados.model.Employee;
import br.com.fiap.ddd.empregados.repository.EmpregadoRepository;

public class App {
	public static void main(String[] args) {

		List<Employee> empregados = EmpregadoRepository.findAll();

		Map<String, List<Employee>> resultado = EmpregadoRepository.groupByJobTitle(empregados);

		for (String title : resultado.keySet()) {
			// @formatter:off
 			System.out.println("CARGO: " + title+ "  ------------------------------------------------------------------------------------------------  ");
 			// @formatter:on

			for (Employee e : resultado.get(title)) {
				System.out.println(e);
			}
		}
	}

	@SuppressWarnings("unused")
	private static void printAll(List<Employee> empregados) {
		for (Employee employee : empregados) {
			System.out.println(employee);
		}
	}
}

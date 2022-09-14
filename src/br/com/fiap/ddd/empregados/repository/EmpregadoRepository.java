package br.com.fiap.ddd.empregados.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.fiap.ddd.empregados.model.Employee;

/**
 * Repositório com métodos funcionais ( adequados para uso em Java a partir da
 * versão 8)
 * 
 * @author Francis
 *
 */
public class EmpregadoRepository extends Repository {

	/**
	 * Código funcional para retorno da média de salário dos empregados
	 * 
	 * @param employeeList
	 * @return
	 */
	public static double calculateAverage(List<Employee> employeeList) {
		return employeeList.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
	}

	public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.groupingBy(Employee::getTitle));
	}

}

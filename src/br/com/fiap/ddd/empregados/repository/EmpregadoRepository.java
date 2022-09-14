package br.com.fiap.ddd.empregados.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.fiap.ddd.empregados.model.Employee;

/**
 * Reposit�rio com m�todos funcionais ( adequados para uso em Java a partir da
 * vers�o 8)
 * 
 * @author Francis
 *
 */
public class EmpregadoRepository extends Repository {

	/**
	 * C�digo funcional para retorno da m�dia de sal�rio dos empregados
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

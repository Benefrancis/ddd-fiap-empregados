package br.com.fiap.ddd.empregados.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.ddd.empregados.model.Employee;

/**
 * Reposit�rio com m�todos procedurais A Classe EmpregadoRepository executa as
 * mesmas a��es utilizando a nova API Stream do Java 8
 * 
 * @see EmpregadoRepository#calculateAverage(List)
 * 
 * @author Francis
 *
 */
public class OldEmpregadoRepository extends Repository {

	/**
	 * C�digo procedural para retorno da m�dia de sal�rio dos empregados
	 * 
	 * @see EmpregadoRepository#calculateAverage(List)
	 * 
	 * @param employeeList
	 * @return
	 */
	public static double calculateAverage(List<Employee> employeeList) {
		int sum = 0;
		int count = 0;

		for (int i = 0; i < employeeList.size(); i++) {
			Employee emp = employeeList.get(i);
			sum += emp.getSalary();
			count++;
		}
		return (double) sum / count;
	}

	/**
	 * C�digo procedural para retorno do agrupamento de empregados pelo cargo
	 * 
	 * @see EmpregadoRepository#groupByJobTitle
	 * @param employeeList
	 * @return
	 */
	public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
		Map<String, List<Employee>> resultMap = new HashMap<>();
		for (int i = 0; i < employeeList.size(); i++) {
			Employee employee = employeeList.get(i);
			List<Employee> empSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
			empSubList.add(employee);
			resultMap.put(employee.getTitle(), empSubList);
		}
		return resultMap;
	}

}

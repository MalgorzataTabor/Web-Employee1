package pl.java.web.employee.service;



import pl.java.web.employee.model.Employee;

import java.util.List;

public class EmployeeService extends ServiceDao {


    public List<Employee> employeeList() {
        return this.executeForList("Select e from Employee e", Employee.class);

    }

    public List<Employee> listEmployees(int offset, int limit){
        return this.executeForList("Select e from Employee e", Employee.class, offset, limit);
    }


   /* public List<Employee> listEmployees() {
        Operation<List<Employee>> operation = (session -> {
            Query<Employee> query = session.createQuery("SELECT d from Employee d", Employee.class);
            List<Employee> resultList = query.getResultList();
            return resultList;
        });
        return (List<Employee>) executeOperation(operation);


    }*/

}
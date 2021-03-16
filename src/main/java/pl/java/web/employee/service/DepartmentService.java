package pl.java.web.employee.service;

import pl.java.web.employee.model.Department;

import java.util.List;

public class DepartmentService extends ServiceDao{

    public List<Department> getAllDepartments(){
        return  this.executeForList("SELECT d from Department d", Department.class);

    }

   /*public Department find(String deptNo) {
        return this.execute
        Operation<Department> operation = (session -> {
            Query<Department> query = session.createQuery(
                    "SELECT d FROM Department d WHERE d.deptNo=:deptNo", Department.class);
            query.setParameter("deptNo", deptNo);
            return query.uniqueResult();
        });
        return executeOperation(operation);
    }*/
}
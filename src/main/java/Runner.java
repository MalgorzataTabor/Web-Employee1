import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import pl.java.web.employee.model.Department;
import pl.java.web.employee.model.Employee;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        final StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
        try(SessionFactory sessionFactory = new MetadataSources(standardServiceRegistry).buildMetadata().buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Query<Department> query = session.createQuery("SELECT d from Department d", Department.class);
            List<Department> resultList = query.getResultList();
            System.out.println(resultList);


            Query<Employee> queryEmployee = session.createQuery("SELECT e from Employee e", Employee.class);
            List<Employee> employeeList = queryEmployee.getResultList();
            System.out.println(employeeList.size());

            transaction.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

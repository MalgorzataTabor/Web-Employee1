package pl.java.web.employee.servlet;

import pl.java.web.employee.model.Employee;
import pl.java.web.employee.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name="employees", urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {

    EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeService.employeeList();

        req.setAttribute("employees", employees);
        req.getRequestDispatcher("/WEB-INF/jsp/employees.jsp").forward(req,resp);


    }
}

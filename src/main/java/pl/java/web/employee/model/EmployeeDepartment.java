package pl.java.web.employee.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dept_emp")
@IdClass(EmployeeDepartmentId.class)
public class EmployeeDepartment {
    @Id
    @OneToOne
    @JoinColumn(name = "emp_no")
    private Employee employee;

    @Id
    @OneToOne
    @JoinColumn(name = "dept_no", columnDefinition = "char")
    private Department department;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;
}

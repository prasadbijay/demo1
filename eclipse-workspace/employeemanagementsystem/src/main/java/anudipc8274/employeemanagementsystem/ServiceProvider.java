package anudipc8274.employeemanagementsystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import java.util.Scanner;

public class ServiceProvider {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Admin.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Attendance.class)
                .addAnnotatedClass(Leavess.class)
                .addAnnotatedClass(Payroll.class)
                .addAnnotatedClass(Role.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Scanner sc = new Scanner(System.in);

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Admin admin = new Admin();
            admin.setUsername("bijay");
            admin.setPassword("121bijay");
            admin.setRole("Manager");

            session.save(admin);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Session session = sessionFactory.openSession()) {
            System.out.println("Please enter username to verify: ");
            String str1 = sc.nextLine();

            System.out.println("Please enter password to verify: ");
            String str2 = sc.nextLine();

            Admin a1 = session.get(Admin.class, 1L);
            if (a1 != null && str1.equals(a1.getUsername()) && str2.equals(a1.getPassword())) {
                System.out.println("Authentication successful!"+"\n select options :\n1".toUpperCase()+". Create Employee\n2. Read Employee Details\n3. Update Employee Details\n4. Delete Employee");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        createEmployee(session, sc);
                        break;
                    case 2:
                        readEmployee(session, sc);
                        break;
                    case 3:
                        updateEmployee(session, sc);
                        break;
                    case 4:
                        deleteEmployee(session, sc);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            } else {
                System.out.println("Invalid credentials! Access denied.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
            sc.close();
        }
    }

    private static void createEmployee(Session session, Scanner sc) {
        Transaction transaction = session.beginTransaction();
        try {
            Department department = new Department();
            department.setName("Maintenance");
            department.setManagerId("MGR001");

            Employee employee = new Employee();
            System.out.println("Please enter employee name: ");
            employee.setName(sc.nextLine());

            System.out.println("Enter employee Email: ");
            employee.setEmail(sc.nextLine());

            System.out.println("Enter employee phone number: ");
            employee.setPhone(sc.nextLine());

            System.out.println("Enter employee address: ");
            employee.setAddress(sc.nextLine());

            System.out.println("Enter employee status: ");
            employee.setStatus(sc.nextLine());

            employee.setDateOfJoining(new Date());

            System.out.println("Enter employee designation: ");
            employee.setDesignation(sc.nextLine());

            System.out.println("Enter employee salary: ");
            employee.setSalary(sc.nextDouble());
            sc.nextLine();  // Consume newline

            employee.setDepartment(department);

            // Handling Attendance
            Attendance attendance = new Attendance();
            attendance.setEmployee(employee);
            attendance.setDate(new Date());
            System.out.println("Enter Attendance Status (Present/Absent): ");
            attendance.setStatus(sc.nextLine());

            // Handling Leave
            Leavess leave = new Leavess();
            System.out.println("Enter Leave Start Date (yyyy-MM-dd): ");
            String startDate = sc.nextLine();
            leave.setStartDate(java.sql.Date.valueOf(startDate));

            System.out.println("Enter Leave End Date (yyyy-MM-dd): ");
            String endDate = sc.nextLine();
            leave.setEndDate(java.sql.Date.valueOf(endDate));
            leave.setEmployee(employee);

            System.out.println("Enter Leave Type: ");
            leave.setLeaveType(sc.nextLine());

            System.out.println("Enter Leave Status: ");
            leave.setStatus(sc.nextLine());

            // Handling Payroll
            Payroll payroll = new Payroll();
            payroll.setEmployee(employee);
            System.out.println("Enter Basic Salary: ");
            payroll.setBasicSalary(sc.nextDouble());

            System.out.println("Enter Bonuses: ");
            payroll.setBonuses(sc.nextDouble());

            System.out.println("Enter Deductions: ");
            payroll.setDeductions(sc.nextDouble());

            payroll.setNetSalary(
                    payroll.getBasicSalary() + payroll.getBonuses() - payroll.getDeductions()
            );
            payroll.setPaymentDate(new Date());
            sc.nextLine();  // Consume newline

            // Handling Role
            Role role = new Role();
            System.out.println("Enter Role Name: ");
            role.setRoleName(sc.nextLine());

            System.out.println("Enter Role Description: ");
            role.setDescription(sc.nextLine());

            session.save(department);
            session.save(employee);
            session.save(attendance);
            session.save(leave);
            session.save(payroll);
            session.save(role);

            transaction.commit();
            System.out.println("Employee created successfully!");
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    private static void readEmployee(Session session, Scanner sc) {
        System.out.println("Enter employee ID to view details: ");
        Long id = sc.nextLong();
        sc.nextLine();
        Employee e1 = session.get(Employee.class, id);
        if (e1 != null) {
            System.out.println("Details: " + e1.getName() + " " + e1.getPhone() + " " + e1.getStatus() + " " + e1.getDesignation());
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void updateEmployee(Session session, Scanner sc) {
        Transaction transaction = session.beginTransaction();
        try {
            System.out.println("Enter employee ID to update: ");
            Long id = sc.nextLong();
            sc.nextLine();
            Employee e1 = session.get(Employee.class, id);
            if (e1 != null) {
                System.out.println("Enter new phone number: ");
                e1.setPhone(sc.nextLine());
                System.out.println("Enter new designation: ");
                e1.setDesignation(sc.nextLine());
                session.update(e1);
                transaction.commit();
                System.out.println("Employee updated successfully!");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    private static void deleteEmployee(Session session, Scanner sc) {
        Transaction transaction = session.beginTransaction();
        try {
            System.out.println("Enter employee ID to delete: ");
            Long id = sc.nextLong();
            sc.nextLine();
            Employee e1 = session.get(Employee.class, id);
            if (e1 != null) {
                session.delete(e1);
                transaction.commit();
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }
}

package esercizio_18;

import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        Random random = new Random();
        String randomCode1 = String.format("%03d", random.nextInt(1000));
        String randomCode2 = String.format("%03d", random.nextInt(1000));
        return randomCode1 + employee.getName() + employee.getSurname() + randomCode2;
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }

    public void showBadgeDetails() {
        System.out.println("Numero totale di dipendenti monitorati dai badge: " + totalNumberOfEmployees);
        System.out.println("Dati del dipendente:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }
}
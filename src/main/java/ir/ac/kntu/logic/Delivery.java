package ir.ac.kntu.logic;
import ir.ac.kntu.Enums.DaysOfWeek;
import ir.ac.kntu.Enums.SalaryType;
import ir.ac.kntu.Enums.Transport;

public class Delivery {

    private double rate;
    private Transport transport;
    private SalaryType salaryType;
    private int salary;
    private DaysOfWeek presence;

    public Delivery(double rate, Transport transport, SalaryType salaryType, int salary, DaysOfWeek presence) {
        this.rate = rate;
        this.transport = transport;
        this.salaryType = salaryType;
        this.salary = salary;
        this.presence = presence;
    }

    public Delivery() {
    }
}

package entities;

import entities.enums.WorkerLevel;

import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> hourContracts;

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department, List<HourContract> hourContracts) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.hourContracts = hourContracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getHourContracts() {
        return hourContracts;
    }

    public void setHourContracts(List<HourContract> hourContracts) {
        this.hourContracts = hourContracts;
    }
}

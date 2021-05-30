package com.sophon.demeter.improve;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {
    public static void main(String[] args) {
        CollegeManager collegeManager = new CollegeManager();
        UniversityManager universityManager = new UniversityManager();
        universityManager.printAllEmployees(collegeManager);
    }
}


class UniversityEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollegeManager {
    public List<CollegeEmployee> getAllEmployees() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId(Integer.toString(i));
            list.add(collegeEmployee);
        }
        return list;
    }

    public void printAllEmployees() {
        for (CollegeEmployee collegeEmployee : this.getAllEmployees()) {
            System.out.println("College employee with ID: " + collegeEmployee.getId());
        }
    }
}

class UniversityManager {
    public List<UniversityEmployee> getAllEmployees() {
        ArrayList<UniversityEmployee> list = new ArrayList<UniversityEmployee>();
        for(int i = 0; i< 5;i++) {
            UniversityEmployee universityEmployee = new UniversityEmployee();
            universityEmployee.setId(Integer.toString(i));
            list.add(universityEmployee);
        }
        return list;
    }

    public void printAllEmployees(CollegeManager collegeManager) {
        System.out.println("--------------- College Employees -------------------");
        collegeManager.printAllEmployees();

        System.out.println("-------------- University Employees ------------------");
        for (UniversityEmployee universityEmployee : this.getAllEmployees()) {
            System.out.println("University employee with ID: " + universityEmployee.getId());
        }
    }
}

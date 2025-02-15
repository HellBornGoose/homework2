package com.hellborngoose.homework2.task1;

public class Builder extends Human {
    private String specialization;

    public Builder(String name, String gender, String specialization) {
        super(name, gender);
        this.specialization = specialization;
        
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Specialization: " + specialization);
    }
    
}

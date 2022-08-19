package services;

import java.util.ArrayList;

public class EmployeeServiceImpl<E> {
    private String empName;
    private String empDate;
    private boolean empGender;
    private String empAddress;
    private String empPhoneNum;
    private String empID;

    public EmployeeServiceImpl(){

    }

    public EmployeeServiceImpl(String empName, String empDate, boolean empGender, String empAddress, String empPhoneNum, String empID) {
        this.empName = empName;
        this.empDate = empDate;
        this.empGender = empGender;
        this.empAddress = empAddress;
        this.empPhoneNum = empPhoneNum;
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }

    public boolean isEmpGender() {
        return empGender;
    }

    public void setEmpGender(boolean empGender) {
        this.empGender = empGender;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPhoneNum() {
        return empPhoneNum;
    }

    public void setEmpPhoneNum(String empPhoneNum) {
        this.empPhoneNum = empPhoneNum;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "Employee ID: " + getEmpID()
                + "\nEmployee name: " + getEmpName()
                + "\nEmployee date of birth: " + getEmpDate()
                + "\nEmployee gender: " + isEmpGender()
                + "\nEmployee address: " + getEmpAddress()
                + "\nEmployee phone number: " + getEmpPhoneNum();
    }

    public void addNewCustomer(){
    }
}

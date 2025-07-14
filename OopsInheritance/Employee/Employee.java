public class Employee extends Person {
  double annualSalary;
  int startYear;
  int nationalInsuranceNumber;

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

  public void setStartYear(int startYear) {
    this.startYear = startYear;
  }

  public void setNationalInsuranceNumber(int nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public int getStartYear() {
    return startYear;
  }

  public int getNationalInsuranceNumber() {
    return nationalInsuranceNumber;
  }

  @Override
  public String toString() {
    return "Employee: Name- " + getName() + ", Annual Salary" + getAnnualSalary() + ", Start Year: " + getStartYear() + ", National Security Number: " + getNationalInsuranceNumber();
  }
}

package entities;

public class User {
     int id;
     String lastName;
     String firstName;
     String email;
     int salary;
     int propretyId;

    public User(){

    }
    public User(int id, String lastName, String firstName, String email, int salary, int propretyId) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.salary = salary;
        this.propretyId = propretyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPropretyId() {
        return propretyId;
    }

    public void setPropretyId(int propretyId) {
        this.propretyId = propretyId;
    }
}

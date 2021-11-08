package model.customer;


public class Customer {

    private String firstName;
    private String lastName;
    private String number;
    private String email;

    public Customer(String s) {
        String input[] = s.split(" ");
        this.firstName = input[0];
        this.lastName = input[1];
        this.number = input[2];
       
    }
    
    public String getName() {
    	return firstName + " " + lastName;
    }
    
    public String getNumber() {
    	return number;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + "\r\n"
                + "Last Name: " + this.lastName + "\r\n"
                + " Email: " + this.email;
    }
}
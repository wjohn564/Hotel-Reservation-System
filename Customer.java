public class Customer {
    private String firstName;
    private String secondName;
    private int phone;
    private String email;

    Customer(String firstName, String secondName, int phone, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = phone;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

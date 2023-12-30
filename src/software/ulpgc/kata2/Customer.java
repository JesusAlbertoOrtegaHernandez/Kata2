package software.ulpgc.kata2;

public class Customer {
    private final String customerId;
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String city;
    private final String country;
    private final String phone1;
    private final String phone2;
    private final String email;
    private final String subscriptionDate;
    private final String website;

    public Customer(String customerId, String firstName, String lastName, String company, String city, String country, String phone1, String phone2, String email, String subscriptionDate, String website) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.city = city;
        this.country = country;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.subscriptionDate = subscriptionDate;
        this.website = website;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCompany() {
        return this.company;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPhone1() {
        return this.phone1;
    }

    public String getPhone2() {
        return this.phone2;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public String getWebsite() {
        return this.website;
    }

    public String toString() {
        return "Customer{customerId='" + this.customerId + "', firstName='" + this.firstName + "', lastName='" + this.lastName + "', company='" + this.company + "', city='" + this.city + "', country='" + this.country + "', phone1='" + this.phone1 + "', phone2='" + this.phone2 + "', email='" + this.email + "', subscriptionDate='" + this.subscriptionDate + "', website='" + this.website + "'}";
    }
}
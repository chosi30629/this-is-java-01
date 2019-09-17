package _13_lambda_expressions.api_functional_interface.andThen_compose_example;

public class Address {
    private String country;
    private String city;


    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }


    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

}

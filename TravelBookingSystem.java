import java.time.LocalDate;

class User {
    private String firstName, lastName, mobileNumber, gender, email, password, accountStatus;
    private int failedCount;

    public User(String firstName, String lastName, String mobileNumber, String gender, String email, String password, int failedCount, String accountStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.failedCount = failedCount;
        this.accountStatus = accountStatus;
    }
    
    @Override
    public String toString() {
        return "User: " + firstName + " " + lastName + ", Email: " + email + ", Status: " + accountStatus;
    }
}

class Journey {
    private LocalDate journeyDate;
    private int numberOfPassengers;

    public Journey(LocalDate journeyDate, int numberOfPassengers) {
        this.journeyDate = journeyDate;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Journey on " + journeyDate + " for " + numberOfPassengers + " passengers";
    }
}

class Route {
    private Integer routeId;
    private String source, destination;
    private LocalDate journeyDate;
    private double ticketPricePerPassenger;
    private Integer noOfSeatsAvailable;

    public Route(Integer routeId, String source, String destination, LocalDate journeyDate, double ticketPrice, Integer noOfSeatsAvailable) {
        this.routeId = routeId;
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.ticketPricePerPassenger = ticketPrice;
        this.noOfSeatsAvailable = noOfSeatsAvailable;
    }

    @Override
    public String toString() {
        return "Route: " + source + " to " + destination + " on " + journeyDate + ", Price: " + ticketPricePerPassenger;
    }
}

class Order {
    private Integer orderId;
    private Route route;
    private Journey journey;
    private Double orderAmount;
    private String orderStatus;

    public Order(Integer orderId, Route route, Journey journey, Double orderAmount, String orderStatus) {
        this.orderId = orderId;
        this.route = route;
        this.journey = journey;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", " + route + ", " + journey + ", Amount: " + orderAmount + ", Status: " + orderStatus;
    }
}

public class TravelBookingSystem {
    public static void main(String[] args) {
        User user = new User("John", "Doe", "9876543210", "Male", "john.doe@example.com", "password", 0, "Active");
        Route route = new Route(101, "New York", "Los Angeles", LocalDate.of(2025, 3, 15), 150.0, 30);
        Journey journey = new Journey(LocalDate.of(2025, 3, 15), 2);
        Order order = new Order(1, route, journey, 300.0, "Confirmed");
        
        System.out.println(user);
        System.out.println(order);
        System.out.println(route);
        System.out.println(journey);
    }
}

import java.util.Scanner;

// Class representing the weather information
class WeatherData {
    // Private variables to store weather parameters (Encapsulation)
    private double temperature;
    private double humidity;

    // Constructor to initialize temperature and humidity values
    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Method to check weather conditions and generate alerts
    public String checkAlert() {
        StringBuilder alertMessage = new StringBuilder();

        // Alert logic based on predefined thresholds
        if (temperature > 40) {
            alertMessage.append("High Temperature Alert ");
        } else if (temperature < 10) {
            alertMessage.append("Low Temperature Alert ");
        }

        if (humidity > 80) {
            if (alertMessage.length() > 0) {
                alertMessage.append("and ");
            }
            alertMessage.append("High Humidity Alert");
        }

        // Otherwise, weather is normal
        if (alertMessage.length() == 0) {
            alertMessage.append("Weather is Normal"); 
        }

        return alertMessage.toString().trim();
    }

    // Method to display the weather report
    public void displayReport() {
        System.out.println("\nWeather Report");
        System.out.println("Temperature: " + temperature + "°C"); 
        System.out.println("Humidity: " + humidity + "%"); 
        System.out.println("Alert: " + checkAlert());
    }
}

// Main class for testing the application
public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature and humidity values
        System.out.print("Enter Temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter Humidity: ");
        double hum = scanner.nextDouble();

        // Create WeatherData object
        WeatherData weather = new WeatherData(temp, hum);

        // Display the complete weather report
        weather.displayReport();

        scanner.close();
    }
}

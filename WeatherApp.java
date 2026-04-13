import java.util.Scanner;

// Class representing the weather information
class WeatherData {
    [span_4](start_span)// Private variables to store weather parameters (Encapsulation)[span_4](end_span)
    private double temperature;
    private double humidity;

    [span_5](start_span)// Constructor to initialize temperature and humidity values[span_5](end_span)
    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    [span_6](start_span)// Method to check weather conditions and generate alerts[span_6](end_span)
    public String checkAlert() {
        StringBuilder alertMessage = new StringBuilder();

        [span_7](start_span)// Alert logic based on predefined thresholds[span_7](end_span)
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

        [span_8](start_span)// Otherwise, weather is normal[span_8](end_span)
        if (alertMessage.length() == 0) {
            alertMessage.append("Weather is Normal"); 
        }

        return alertMessage.toString().trim();
    }

    [span_9](start_span)// Method to display the weather report[span_9](end_span)
    public void displayReport() {
        System.out.println("\nWeather Report");
        System.out.println("Temperature: " + temperature + "°C"); 
        System.out.println("Humidity: " + humidity + "%"); 
        System.out.println("Alert: " + checkAlert());
    }
}

[span_10](start_span)// Main class for testing the application[span_10](end_span)
public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        [span_11](start_span)// Input temperature and humidity values[span_11](end_span)
        System.out.print("Enter Temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter Humidity: ");
        double hum = scanner.nextDouble();

        [span_12](start_span)// Create WeatherData object[span_12](end_span)
        WeatherData weather = new WeatherData(temp, hum);

        [span_13](start_span)// Display the complete weather report[span_13](end_span)
        weather.displayReport();

        scanner.close();
    }
}

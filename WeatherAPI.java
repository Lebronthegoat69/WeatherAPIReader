
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class WeatherAPI {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("Weather Data API Reader");
        System.out.println("-----------------------");
        System.out.println();
        System.out.println("Location: West Bend, Wisconsin");
        System.out.println();
        System.out.println("Connecting to weather API...");
        System.out.println();

        // Open-Meteo API URL for West Bend
        String apiUrl = "https://api.open-meteo.com/v1/forecast"
                + "?latitude=43.4253"
                + "&longitude=-88.1834"
                + "&current=temperature_2m,wind_speed_10m"
                + "&temperature_unit=fahrenheit"
                + "&wind_speed_unit=mph";

        try {
            // Create an HTTP client
            HttpClient client = HttpClient.newHttpClient();

            // Create the API request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            // Send the request and receive the response
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            // Check whether the request succeeded
            if (response.statusCode() == 200) {

                System.out.println("API Response:");
                System.out.println(response.body());

                System.out.println();
                System.out.println("Weather data retrieved successfully.");

            } else {
                System.out.println("The API request failed.");
                System.out.println("HTTP Status Code: " + response.statusCode());
            }

        } catch (IOException e) {
            // Handle connection or network errors
            System.out.println("Unable to connect to the weather API.");
            System.out.println("Please check your internet connection.");

        } catch (InterruptedException e) {
            // Handle interrupted requests
            System.out.println("The weather request was interrupted.");
            Thread.currentThread().interrupt();

        } catch (IllegalArgumentException e) {
            // Handle an invalid API URL
            System.out.println("The API URL is invalid.");
        }
    }
}

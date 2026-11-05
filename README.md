# Weather Data API Reader

## Project Description

Weather Data API Reader is a Java console application that connects to the Open-Meteo weather API to retrieve current weather information for West Bend, Wisconsin.

The program displays the current temperature and wind speed returned by the API.

## Features

- Connects to a public weather API.
- Retrieves current weather information.
- Displays temperature in Fahrenheit.
- Displays wind speed in miles per hour.
- Handles network errors using try-catch blocks.
- Displays the API response in the console.

## Technologies Used

- Java
- IntelliJ IDEA
- Java HttpClient
- Open-Meteo API

## API Used

Open-Meteo Forecast API:

https://api.open-meteo.com/v1/forecast?latitude=43.4253&longitude=-88.1834&current=temperature_2m,wind_speed_10m&temperature_unit=fahrenheit&wind_speed_unit=mph

No API key is required.

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a compatible JDK is installed (Java 11 or newer).
4. Open `WeatherAPI.java`.
5. Run the `main` method.
6. The program will connect to Open-Meteo and display the weather response.



The screenshot below shows the program successfully connecting to the weather API and displaying current weather information.

<img width="975" height="387" alt="image" src="https://github.com/user-attachments/assets/128c0580-c601-4797-9fa8-eec9204c6a46" />


Sam

import java.util.Scanner;

public class HalloFarenheit {

    public static float readTemperatureInCelsius() {
        Scanner console = new Scanner(System.in);
        System.out.print("Bitte gib einen Temperaturwert in Celsius ein: ");
        return console.nextFloat();
    }

    public static void main(String[] args) {
        float temperatureInCelsius = readTemperatureInCelsius();
        float temperatureInFahrenheit = (temperatureInCelsius * 1.8f) + 32;
        System.out.println(temperatureInCelsius + "°C entsprechen " + temperatureInFahrenheit + "°F");
    }
}

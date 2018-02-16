package pl.narodzinyprogramisty;

public class Lesson1 {
    public static void main(String[] args) {
        //zad1.
        int x = 2;
        System.out.println(x);
        x = 10;
        System.out.println(x);

        System.out.println("\n\n");

        //zad2.
        float zm1 = 15.5F;
        float zm2 = 10.25F;

        System.out.println("dodawanie");
        System.out.println(zm1 + zm2);
        System.out.println("odejmowanie");
        System.out.println(zm1 - zm2);
        System.out.println("mnozenie");
        System.out.println(zm1 * zm2);
        System.out.println("dzielenie");
        System.out.println(zm1 / zm2);
        System.out.println("zmienne ");
        System.out.println(zm1);
        System.out.println(zm2);

        System.out.println("\n\n");

        //zad3.
        String name = "Paweł";
        String lastName = "Kuklicz";
        byte age = 25;
        byte day = 6;
        String month = "Maj";
        short year = 1993;

        System.out.println("Cześć " + name + " " + lastName + " mam " + age + " lat.");
        System.out.println("Data urodzenia " + day + " " + month + " " + year);


        System.out.println("\n\n");

        //zad4
        float heightInMeter = 1.93F;
        float weightInKG = 80.5F;
        double BMI = weightInKG / (heightInMeter * heightInMeter);
        System.out.println("moje BMI to " + BMI);


        System.out.println("\n\n");

        //zad5
        long tempInCelsius = 1_500_000L;
        long tempInFahrenheit = 150000L;

        double celsiusToFahrenheits = (tempInCelsius * 1.8) + 32; // napisac wzór
        double fahrenheitToCelsius = (tempInFahrenheit - 32) / 1.8;

        System.out.println("temp " + tempInCelsius + "st celcjusza to : " + celsiusToFahrenheits + "st farenhaita");
        System.out.println("temp " + tempInFahrenheit + "st farenhaita to : " + fahrenheitToCelsius + "st celcsjusza");

        System.out.println("\n\n");

        //zad 6
        int a = 2;
        int b = 8;
        int c = 5;
        int delta = (b * b) - (4 * a * c);

        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.println("pierwsze miejsce zerowe " + x1);
        System.out.println("drugie miejsce zerowe " + x2);

    }
}

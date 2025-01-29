import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Name> users = Arrays.asList(
            new Name("Connor", "Hacker90"),
            new Name("Cheesy", "Sock"),
            new Name("Parham", "Rostami")
        );

        users.forEach(Main::greetUser);
    }

    private static void greetUser(Name user) {
        String greeting = getGreetingMessage();
        String compliment = getRandomCompliment();
        System.out.println(greeting + " " + user.getFullName() + "! " + compliment);
    }

    private static String getGreetingMessage() {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if (hour >= 5 && hour < 12) {
            return "Good Morning";
        } else if (hour >= 12 && hour < 17) {
            return "Good Afternoon";
        } else if (hour >= 17 && hour < 21) {
            return "Good Evening";
        } else {
            return "Hello";
        }
    }

    private static String getRandomCompliment() {
        List<String> compliments = Arrays.asList(
            "You're a genius!",
            "Keep being awesome!",
            "Your energy is contagious!",
            "You're an absolute legend!",
            "That was an epic move!"
        );
        Random random = new Random();
        return compliments.get(random.nextInt(compliments.size()));
    }

}

import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Name totallyRadName1 = new Name("Connor", "Hacker90");
        Name totallyRadName2 = new Name("Cheesy", "Sock");
        Name totallyRadName3 = new Name("Parham", "Rostami");
        
        greetUser(totallyRadName1);
        greetUser(totallyRadName2);
        greetUser(totallyRadName3);
    }

    private static void greetUser(Name user) {
        String greeting = getGreetingMessage();
        System.out.println(greeting + " " + user.getFullName() + "!");
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

    // Assuming the Name class looks something like this
    static class Name {
        private String firstName;
        private String nickname;

        public Name(String firstName, String nickname) {
            this.firstName = firstName;
            this.nickname = nickname;
        }

        public String getFullName() {
            return firstName + " \"" + nickname + "\"";
        }
    }
}

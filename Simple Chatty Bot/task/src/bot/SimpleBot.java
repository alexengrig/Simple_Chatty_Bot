package bot;

import java.time.Year;

public class SimpleBot {
    public static void main(String[] args) {
        Bot bot = new Bot("Aid");
        bot.greeting();
    }

    static class Bot {
        private String name;
        private Year birthYear;

        public Bot(String name) {
            this.name = name;
            this.birthYear = Year.now();
        }

        public void greeting() {
            System.out.printf("Hello! My name is %s\nI was created in %d\n", name, birthYear.getValue());
        }
    }
}

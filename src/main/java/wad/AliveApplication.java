package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/Janzu93/Set04_04.Alive";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/Janzu93/Set04_04.Alive";
    }

    public static String herokuUrl() {
        return "https://gentle-plains-58690.herokuapp.com/";
    }
}

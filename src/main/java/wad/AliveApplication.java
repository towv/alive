package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/towv/alive"+"https://travis-ci.org/towv/alive"+"https://wepalive.herokuapp.com/";
    }

    public static String travisUrl() {
<<<<<<< HEAD
        return "https://travis-ci.org/towv/alive";
    }

    public static String herokuUrl() {
        return "https://wepalive.herokuapp.com/";
=======
        return "https://github.com/towv/alive";
    }

    public static String herokuUrl() {
        return "https://github.com/towv/alive";
>>>>>>> c68f1e619b99b9cac073439795c9954bdce83cd9
    }
}

package wad;

import fi.helsinki.cs.tmc.edutestutils.Points;
import org.junit.*;
import static org.junit.Assert.assertTrue;

public class AliveTest {

    @Points("04-04.1")
    @Test
    public void hasGithub() {
        assertTrue(AliveApplication.githubUrl().contains("github.com/"));
    }

    @Points("04-04.2")
    @Test
    public void hasTravis() {
<<<<<<< HEAD
        assertTrue(AliveApplication.travisUrl().contains("travis-ci.org/"));
=======
        assertTrue(AliveApplication.githubUrl().contains("travis-ci.org/"));
>>>>>>> c68f1e619b99b9cac073439795c9954bdce83cd9
    }

    @Points("04-04.3")
    @Test
    public void hasHerokuapp() {
<<<<<<< HEAD
        assertTrue(AliveApplication.herokuUrl().contains("herokuapp.com"));
=======
        assertTrue(AliveApplication.githubUrl().contains("herokuapp.com"));
>>>>>>> c68f1e619b99b9cac073439795c9954bdce83cd9
    }

}

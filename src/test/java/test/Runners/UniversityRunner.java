package test.Runners;

import com.intuit.karate.junit5.Karate;

public class UniversityRunner {

    @Karate.Test
    Karate testUniversity() {
        return Karate.run("classpath:university");
    }
}
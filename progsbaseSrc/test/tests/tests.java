package tests;

import static PNTest.PNTest.testPostNummer;

public class tests {
    public static double test(){
        double failures;
        failures = 0d;

        failures = failures + testPostNummer();

        return failures;
    }
}

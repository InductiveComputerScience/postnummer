package PNTest;

import postnummer.postnummer.Success;
import references.references.DoubleReference;

import static postnummer.postnummer.postnummer.hentPoststed;
import static testing.testing.testing.assertStringEquals;
import static testing.testing.testing.assertTrue;

public class PNTest {
    public static double testPostNummer(){
        Success success;
        char [] poststed;
        DoubleReference failures;

        success = new Success();
        poststed = hentPoststed("9790".toCharArray(), success);

        failures = new DoubleReference();
        failures.doubleValue = 0d;

        assertTrue(success.success, failures);
        assertStringEquals(poststed, "KJ\u00D8LLEFJORD".toCharArray(), failures);

        return failures.doubleValue;
    }
}

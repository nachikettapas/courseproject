package sec.hackmypassword;

import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;
import fi.helsinki.cs.tmc.edutestutils.Reflex;
import org.junit.Test;

@Points("S4.01.1 S4.01.2 S4.01.3 S4.01.4 S4.01.5")
public class HackMyPasswordTest {

    @Test
    public void noTests() throws Throwable {
        Reflex.reflect("sec.hackmypassword.IFiguredItOut").staticMethod("thePassword").returning(String.class).takingNoParams().requireExists();
    }
}

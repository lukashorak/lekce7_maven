import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testSum(){
        MavenMain mavenMain = new MavenMain();

        assertEquals(7, mavenMain.sum(2, 5));

    }
}

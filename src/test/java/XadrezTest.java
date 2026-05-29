import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XadrezTest {

    @Test
    void verificarPeca() {

        Peca peca = new Peca();

        Assertions.assertNotNull(peca);
    }
}
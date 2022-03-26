import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class HelloWorldTest {
    @Test
    void shouldPrintHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();

        String outPut=helloWorld.print();

        assertThat(outPut,is(equalTo("HelloWorld")));


    }
}

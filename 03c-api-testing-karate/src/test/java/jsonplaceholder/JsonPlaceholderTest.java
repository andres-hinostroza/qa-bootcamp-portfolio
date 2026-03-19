package jsonplaceholder;

import com.intuit.karate.junit5.Karate;

class JsonPlaceholderTest {
    @Karate.Test
    Karate testAll() {
        return Karate.run("usuarios").relativeTo(getClass());
    }
}

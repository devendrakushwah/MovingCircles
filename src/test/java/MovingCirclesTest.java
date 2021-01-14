import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

class MovingCirclesTest {
    @Test
    void shouldRunProceduralWhenOneisEntered() {
        assertThat("abc", startsWith("a"));
        assert 1==1;
        assertEquals(1,2);
    }
}
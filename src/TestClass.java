import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    SymbolCounter counter = new SymbolCounter();

    @Test
    public void SymbolCounterTest(){
        assertEquals("a3b2c4",counter.count("aaabbcccc"));
        assertEquals("a2b1c2f1",counter.count("aabccf"));
        assertEquals("c5",counter.count("ccccc"));
    }
    @Test(expected = NullPointerException.class)
    public void SymbolCounterTest_NullPointerException(){
        counter.count(null);
    }
}

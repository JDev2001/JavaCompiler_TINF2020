package ParserTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

record R(List<Integer> a)
{

}
public class test
{
    @Test
    public void Test()
    {
        R r = new R(List.of(1239,29));
        R r3 = new R(List.of(1239,29));
        Assertions.assertEquals(r,r3);
    }
}
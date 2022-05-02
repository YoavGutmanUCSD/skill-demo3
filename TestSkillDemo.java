import static org.junit.Assert.*;
import org.junit.*;
public class TestSkillDemo {
    @Test
    public void additionTest(){
        assertEquals(2, SkillDemo.add(1, 1));
    }
}
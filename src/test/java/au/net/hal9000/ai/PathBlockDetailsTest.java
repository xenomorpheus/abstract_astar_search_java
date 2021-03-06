package au.net.hal9000.ai;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import au.net.hal9000.units.Position;


/**
 * Test PathBlockDetails class.
 * 
 * @author bruins
 *
 */
public class PathBlockDetailsTest {

    /**
     * Test Blocker class.
     */
    @Test
    public void test() {
        final Position position = new Position(1, 2);
        final String string = "something";
        final PathBlockDetails blocker = new PathBlockDetails(position, string);
        assertTrue(position.equals(blocker.getBlockingPoint()));
        assertTrue(string.equals(blocker.getBlocker()));
    }

}

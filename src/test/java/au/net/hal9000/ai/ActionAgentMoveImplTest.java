package au.net.hal9000.ai;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import au.net.hal9000.ai.ActionMoveImpl;
import au.net.hal9000.ai.api.Action;
import au.net.hal9000.units.Position;

/**
 */
public class ActionAgentMoveImplTest {

    /**
     * test equals.
     */
    @Test
    public void testEquals() {
        // compare both label and xyz.
        Action action1 = new ActionMoveImpl(new Position(1, 2));
        Action action2 = new ActionMoveImpl(new Position(1, 2));
        assertTrue(action1.equals(action2));

    }

    
}

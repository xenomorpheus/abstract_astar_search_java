package au.net.hal9000.ai.api;

import java.util.Queue;

/**
 * Generate all possible ModelState objects from current ModelState object.
 * 
 * @author bruins
 * @version $Revision: 1.0 $
 */
public interface SuccessorFunction {

    /**
     * Generate a list of Successors, each being an action
     * for the agent and a new ModelState that is the result of taking that
     * action.
     * 
     * @param modelState
     *            current ModelState before performing an action.
    
     * @return return a list of Successor objects. */
    Queue<Successor> generateSuccessors(ModelState modelState);
}

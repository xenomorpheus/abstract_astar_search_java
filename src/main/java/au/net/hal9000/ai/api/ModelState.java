package au.net.hal9000.ai.api;


/**
 * A Model State is simplification of the real world holding only the relevant
 * details to perform the search.<br>
 * This is a very simple model state. It only holds the Agent position.
 * 
 * @author bruins
 * @version $Revision: 1.0 $
 */

public interface ModelState {

    /**
     * Similar to clone, but no exceptions.
     */
    ModelState duplicate();
    
    /**
     * Method toString.
     * 
     * @return String
     */
    @Override
    public String toString();

}

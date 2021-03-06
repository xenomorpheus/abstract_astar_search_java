package au.net.hal9000.ai.api;

import au.net.hal9000.units.Position;

/**
 * Very simple actions - Agent movement only.
 * 
 * @author bruins
 * @version $Revision: 1.0 $
 */

public interface ActionMove extends Action {

    /**
     * @return the amount of movement.
     */
    Position getPositionDelta();

    /**
     * @param position
     *            the amount of movement to set.
     */
    void setPositionDelta(Position position);

}

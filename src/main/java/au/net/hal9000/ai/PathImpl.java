package au.net.hal9000.ai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import au.net.hal9000.ai.api.Action;
import au.net.hal9000.ai.api.Path;

/**
 * AI path of Action objects. <br>
 * 
 * @version $Revision: 1.0 $
 * @author bruins
 */
class PathImpl implements Path {

    /** a list of actions. */
    private List<Action> actions = new ArrayList<Action>();

    /**
     * Constructor.
     * 
     */
    public PathImpl() {
        super();
    }

    /**
     * add action to path.
     * 
     * @param action
     *            action to add.
     */
    @Override
    public void add(Action action) {
        actions.add(action);
    }

    /**
     * Method hashCode.
     * 
     * @see java.lang.Object#hashCode()
     * 
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((null == actions) ? 0 : actions.hashCode());
        return result;
    }

    /**
     * Method equals.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param obj
     *            Object
     * 
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (!(obj instanceof PathImpl)) {
            return false;
        }
        final PathImpl other = (PathImpl) obj;
        if (size() != other.size()) {
            return false;
        }
        // Compare each element
        Iterator<Action> otherIterator = other.iterator();
        for (Action action : this) {
            Action otherAction = otherIterator.next();
            if (!action.equals(otherAction)) {
                return false;
            }
        }
        return true;
    }

    /** {@inheritDoc} */
    @Override
    public int size() {
        return actions.size();
    }

    /** {@inheritDoc} */
    @Override
    public Iterator<Action> iterator() {
        return actions.iterator();
    }

    /**
     * Method toString.
     * 
     * @return String
     */
    @Override
    public String toString() {
        final int stringsPerAction = 3;
        StringBuilder string = new StringBuilder(actions.size() * stringsPerAction + 3);
        string.append(getClass().getSimpleName()+"=[");
        String join = "";
        for (Action action : actions) {
            string.append(join);
            string.append(action.toString());
            join = ", ";
        }
        string.append(']');
        return string.toString();
    }

    /** {@inheritDoc} */
    @Override
    public PathImpl duplicate() {
        PathImpl path = new PathImpl();
        path.actions = new ArrayList<Action>();
        for (Action action : actions) {
            path.add(action);
        }
        return path;
    }

}

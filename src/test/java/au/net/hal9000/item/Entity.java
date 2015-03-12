package au.net.hal9000.item;

import au.net.hal9000.ai.MemoryImpl;
import au.net.hal9000.ai.MemorySetImpl;
import au.net.hal9000.ai.api.MemorySet;
import au.net.hal9000.units.Position;

public class Entity {

    private Position position;
    private MemorySetImpl memorySet;

    /**
     * 
     * 
     * @return return the position.
     */
    public Position getPosition() {
        return position;
    }

    /**
     * set the position of the item.
     * 
     * @param position
     *            the position object.
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    
    
    /**
     * The Entity object has learnt a new Memory.
     * 
     * @param skill
     *            The freshly learnt Memory.
     */
    public final void memoryAdd(final MemoryImpl memory) {
        if (null == memorySet) {
            memorySet = new MemorySetImpl();
        }
        memorySet.add(memory);
    }
    

    public MemorySet getMemorySet() {
        return memorySet;
    }

}

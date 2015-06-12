package by.prigozhiy.workthread;
/**
 *
 * @author Sergey_Prig
 */
public class ObjectCount implements IObjectCount{
    
    private int count;

    @Override
    public synchronized void counting() {
            count++;
    }

    @Override
    public int getCount() {
        return count;
    }
    
}

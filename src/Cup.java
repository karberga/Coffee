/**
 * 
 */

/**
 * @author grant
 *
 */
public class Cup
{
    private int sips = 21;

    public Cup()
    {
    }

    public void takeOneSip()
    {
        --sips;
    }
    
    public boolean isEmpty() 
    {
        return sips == 0;
    }
    
    public int getSips() {
        return sips;
    }
}

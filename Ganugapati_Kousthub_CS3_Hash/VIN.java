public class VIN
{
    String vID;
    public VIN(String vID)
    {
        this.vID = vID;
    }
    
    public boolean equals(VIN vinObj)
    {
        if(this.vID.hashCode() == vinObj.vID.hashCode())
        {
            return true;
        }
        return false;
    }
    public int hashCode()
    {
        return this.vID.hashCode();
    }
    
    
}
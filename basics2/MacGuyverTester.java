
/**
 * MacGuyverTester tests the MacGuyver class.
 * MacGuyver needs to collect the proper items from the house and
 * bring them to the EngineRoom so that he can build the VeryCleverDevice
 * 
 * @author ace  
 * @version 5 April 2010
 */
public class MacGuyverTester
{

    /**
     * Constructor for objects of class MacGuyverTester
     */
    public MacGuyverTester(){
    }

    /**
     * MacGuyver needs to assemble items needed to make the Very Clever Device
     * in the EngineRoom.
     */
    public void MacGuyver(){
        MacGuyver macGuyver = new MacGuyver();
        Device device = macGuyver.buildDevice();
        if(device.getName().equals("Very Clever")){
            System.out.println("test MacGuyver passes!");
        } else {
            System.out.println("test MacGuyver fails");
        }
    }
}

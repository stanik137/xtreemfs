package org.xtreemfs.interfaces.OSDInterface;

import org.xtreemfs.*;
import org.xtreemfs.common.buffer.ReusableBuffer;
import org.xtreemfs.interfaces.*;
import org.xtreemfs.interfaces.utils.*;
import yidl.Marshaller;
import yidl.Struct;
import yidl.Unmarshaller;




public class xtreemfs_lock_checkResponse extends org.xtreemfs.interfaces.utils.Response
{
    public static final int TAG = 2009082969;
    
    public xtreemfs_lock_checkResponse() { returnValue = new Lock();  }
    public xtreemfs_lock_checkResponse( Lock returnValue ) { this.returnValue = returnValue; }

    public Lock getReturnValue() { return returnValue; }
    public void setReturnValue( Lock returnValue ) { this.returnValue = returnValue; }

    // java.io.Serializable
    public static final long serialVersionUID = 2009082969;    

    // yidl.Object
    public int getTag() { return 2009082969; }
    public String getTypeName() { return "org::xtreemfs::interfaces::OSDInterface::xtreemfs_lock_checkResponse"; }
    
    public int getXDRSize()
    {
        int my_size = 0;
        my_size += returnValue.getXDRSize();
        return my_size;
    }    
    
    public void marshal( Marshaller marshaller )
    {
        marshaller.writeStruct( "returnValue", returnValue );
    }
    
    public void unmarshal( Unmarshaller unmarshaller ) 
    {
        returnValue = new Lock(); unmarshaller.readStruct( "returnValue", returnValue );    
    }
        
    

    private Lock returnValue;    

}

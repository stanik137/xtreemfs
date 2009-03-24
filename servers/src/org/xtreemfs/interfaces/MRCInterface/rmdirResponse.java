package org.xtreemfs.interfaces.MRCInterface;

import org.xtreemfs.interfaces.*;
import java.util.HashMap;
import org.xtreemfs.interfaces.utils.*;
import org.xtreemfs.foundation.oncrpc.utils.ONCRPCBufferWriter;
import org.xtreemfs.common.buffer.ReusableBuffer;




public class rmdirResponse implements org.xtreemfs.interfaces.utils.Response
{
    public rmdirResponse() {  }
    public rmdirResponse( Object from_hash_map ) {  this.deserialize( from_hash_map ); }
    public rmdirResponse( Object[] from_array ) { this.deserialize( from_array ); }

    public String getTypeName() { return "org::xtreemfs::interfaces::MRCInterface::rmdirResponse"; }    
    public long getTypeId() { return 15; }

    public String toString()
    {
        return "rmdirResponse()";
    }


    public void deserialize( Object from_hash_map )
    {
        this.deserialize( ( HashMap<String, Object> )from_hash_map );
    }
        
    public void deserialize( HashMap<String, Object> from_hash_map )
    {

    }
    
    public void deserialize( Object[] from_array )
    {
        
    }

    public void deserialize( ReusableBuffer buf )
    {

    }

    public Object serialize()
    {
        HashMap<String, Object> to_hash_map = new HashMap<String, Object>();
return to_hash_map;        
    }

    public void serialize( ONCRPCBufferWriter writer ) 
    {

    }
    
    public int calculateSize()
    {
        int my_size = 0;

        return my_size;
    }

    // Response
    public int getOperationNumber() { return 15; }


}


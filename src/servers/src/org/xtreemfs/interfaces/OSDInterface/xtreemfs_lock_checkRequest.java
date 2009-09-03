package org.xtreemfs.interfaces.OSDInterface;

import org.xtreemfs.*;
import org.xtreemfs.common.buffer.ReusableBuffer;
import org.xtreemfs.interfaces.*;
import org.xtreemfs.interfaces.utils.*;
import yidl.Marshaller;
import yidl.Struct;
import yidl.Unmarshaller;




public class xtreemfs_lock_checkRequest extends org.xtreemfs.interfaces.utils.Request
{
    public static final int TAG = 2009082969;
    
    public xtreemfs_lock_checkRequest() { file_credentials = new FileCredentials();  }
    public xtreemfs_lock_checkRequest( FileCredentials file_credentials, String client_uuid, int client_pid, String file_id, long offset, long length, boolean exclusive ) { this.file_credentials = file_credentials; this.client_uuid = client_uuid; this.client_pid = client_pid; this.file_id = file_id; this.offset = offset; this.length = length; this.exclusive = exclusive; }

    public FileCredentials getFile_credentials() { return file_credentials; }
    public void setFile_credentials( FileCredentials file_credentials ) { this.file_credentials = file_credentials; }
    public String getClient_uuid() { return client_uuid; }
    public void setClient_uuid( String client_uuid ) { this.client_uuid = client_uuid; }
    public int getClient_pid() { return client_pid; }
    public void setClient_pid( int client_pid ) { this.client_pid = client_pid; }
    public String getFile_id() { return file_id; }
    public void setFile_id( String file_id ) { this.file_id = file_id; }
    public long getOffset() { return offset; }
    public void setOffset( long offset ) { this.offset = offset; }
    public long getLength() { return length; }
    public void setLength( long length ) { this.length = length; }
    public boolean getExclusive() { return exclusive; }
    public void setExclusive( boolean exclusive ) { this.exclusive = exclusive; }

    // Request
    public Response createDefaultResponse() { return new xtreemfs_lock_checkResponse(); }


    // java.io.Serializable
    public static final long serialVersionUID = 2009082969;    

    // yidl.Object
    public int getTag() { return 2009082969; }
    public String getTypeName() { return "org::xtreemfs::interfaces::OSDInterface::xtreemfs_lock_checkRequest"; }
    
    public int getXDRSize()
    {
        int my_size = 0;
        my_size += file_credentials.getXDRSize();
        my_size += ( ( client_uuid.getBytes().length + Integer.SIZE/8 ) % 4 == 0 ) ? ( client_uuid.getBytes().length + Integer.SIZE/8 ) : ( client_uuid.getBytes().length + Integer.SIZE/8 + 4 - ( client_uuid.getBytes().length + Integer.SIZE/8 ) % 4 );
        my_size += ( Integer.SIZE / 8 );
        my_size += ( ( file_id.getBytes().length + Integer.SIZE/8 ) % 4 == 0 ) ? ( file_id.getBytes().length + Integer.SIZE/8 ) : ( file_id.getBytes().length + Integer.SIZE/8 + 4 - ( file_id.getBytes().length + Integer.SIZE/8 ) % 4 );
        my_size += ( Long.SIZE / 8 );
        my_size += ( Long.SIZE / 8 );
        my_size += 4;
        return my_size;
    }    
    
    public void marshal( Marshaller marshaller )
    {
        marshaller.writeStruct( "file_credentials", file_credentials );
        marshaller.writeString( "client_uuid", client_uuid );
        marshaller.writeInt32( "client_pid", client_pid );
        marshaller.writeString( "file_id", file_id );
        marshaller.writeUint64( "offset", offset );
        marshaller.writeUint64( "length", length );
        marshaller.writeBoolean( "exclusive", exclusive );
    }
    
    public void unmarshal( Unmarshaller unmarshaller ) 
    {
        file_credentials = new FileCredentials(); unmarshaller.readStruct( "file_credentials", file_credentials );
        client_uuid = unmarshaller.readString( "client_uuid" );
        client_pid = unmarshaller.readInt32( "client_pid" );
        file_id = unmarshaller.readString( "file_id" );
        offset = unmarshaller.readUint64( "offset" );
        length = unmarshaller.readUint64( "length" );
        exclusive = unmarshaller.readBoolean( "exclusive" );    
    }
        
    

    private FileCredentials file_credentials;
    private String client_uuid;
    private int client_pid;
    private String file_id;
    private long offset;
    private long length;
    private boolean exclusive;    

}

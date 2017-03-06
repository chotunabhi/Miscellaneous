/**
 * 
 */
package xml;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Abhi
 *
 */
@XStreamAlias("RequestorObject")
public class RequestorObject implements Serializable {
    private String Type;

    private String Id;

    public Integer getType ()
    {
        return (Type == null || Type.isEmpty())? null : Integer.parseInt(Type);
    }

    public Integer getId ()
    {
        return (Id == null || Id.isEmpty())? null : Integer.parseInt(Id);
    }
}

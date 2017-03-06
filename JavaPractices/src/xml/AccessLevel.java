package xml;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("AccessLevel")
public class AccessLevel implements Serializable{
	@XStreamImplicit
	private List<RequestorObject> RequestorObject;

	/*public List<RequestorObject> getRequestorObject ()
	{
		return RequestorObject;
	}

	public void setRequestorObject (List<RequestorObject> RequestorObject)
	{
		this.RequestorObject = RequestorObject;
	}*/
}

package xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("WatchListMetaData")
@XmlRootElement(name="WatchListMetaData")
public class WatchListMetaData implements Serializable {
//	@XStreamImplicit(itemFieldName = "AccessLevel")
	private AccessLevel AccessLevel;
	
//	@XStreamImplicit(itemFieldName = "WatchListInfo")
	private WatchListInfo WatchListInfo;

	public AccessLevel getAccessLevel ()
	{
		return AccessLevel;
	}

	public void setAccessLevel (AccessLevel AccessLevel)
	{
		this.AccessLevel = AccessLevel;
	}

	public WatchListInfo getWatchListInfo ()
	{
		return WatchListInfo;
	}

	public void setWatchListInfo (WatchListInfo WatchListInfo)
	{
		this.WatchListInfo = WatchListInfo;
	}

}

package xml.objectModels.research;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Geographies")
public class Geographies {
	@XStreamImplicit(itemFieldName = "Geography")
	private List<Geography> Geography;

	public List<Geography> getGeography() {
		return Geography;
	}

	public void setGeography(List<Geography> geography) {
		Geography = geography;
	}
}

package xml.objectModels.research;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Industries")
public class Industries {
	@XStreamImplicit(itemFieldName = "Industry")
	private List<Industry> Industry;

	public List<Industry> getIndustry() {
		return Industry;
	}

	public void setIndustry(List<Industry> industry) {
		Industry = industry;
	}
}

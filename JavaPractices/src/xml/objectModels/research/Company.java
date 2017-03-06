package xml.objectModels.research;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Company {
	@XStreamAsAttribute
	public Integer id;
	@XStreamAsAttribute
	public Integer primary;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrimary() {
		return primary;
	}

	public void setPrimary(Integer primary) {
		this.primary = primary;
	}

}

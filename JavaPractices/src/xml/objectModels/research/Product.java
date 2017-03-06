package xml.objectModels.research;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Product {
	@XStreamAsAttribute
	public Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

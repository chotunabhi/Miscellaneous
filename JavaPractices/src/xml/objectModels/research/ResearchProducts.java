package xml.objectModels.research;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ResearchProducts {
	@XStreamImplicit(itemFieldName = "Product")
	private List<Product> Products;

	public List<Product> getProducts() {
		return Products;
	}

	public void setProducts(List<Product> products) {
		Products = products;
	}
}

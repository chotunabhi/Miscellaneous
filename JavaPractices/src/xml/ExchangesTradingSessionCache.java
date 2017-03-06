package xml;

import java.util.ArrayList;
import java.util.List;

public class ExchangesTradingSessionCache {
 private List<Exchange> Exchange = new ArrayList<Exchange>();

public List<Exchange> getExchanges() {
	return Exchange;
}

public void setExchanges(List<Exchange> exchanges) {
	Exchange = exchanges;
}
 
}

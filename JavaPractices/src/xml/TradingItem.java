package xml;

import java.util.List;

public class TradingItem {
	List<TradingItemDetail> TradingItemDetail;

	public List<TradingItemDetail> getTradingItemDetail() {
		return TradingItemDetail;
	}

	public void setTradingItemDetail(List<TradingItemDetail> tradingItemDetail) {
		TradingItemDetail = tradingItemDetail;
	}
}

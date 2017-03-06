package xml;
/**
 * @author Abhi
 *
 */
public class PricingCache {
	private String rawData;
	
	private Double priceopen;

	private Double priceclose;

	private Double pricelow;

	private Integer currencyId;

	private Double divAdjFactor;

	private Integer exchangeid;

	private String pricingdate;

	private Double adjustmentFactor;

	private Integer tradingitemid;

	private Double pricehigh;

	public String getRawData() {
		return rawData;
	}


	public void setRawData(String rawData) {
		this.rawData = rawData;
	}


	public Double getPriceopen() {
		return priceopen;
	}


	public void setPriceopen(Double priceopen) {
		this.priceopen = priceopen;
	}


	public Double getPriceclose() {
		return priceclose;
	}


	public void setPriceclose(Double priceclose) {
		this.priceclose = priceclose;
	}


	public Double getPricelow() {
		return pricelow;
	}


	public void setPricelow(Double pricelow) {
		this.pricelow = pricelow;
	}


	public Integer getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}


	public Double getDivAdjFactor() {
		return divAdjFactor;
	}


	public void setDivAdjFactor(Double divAdjFactor) {
		this.divAdjFactor = divAdjFactor;
	}


	public Integer getExchangeid() {
		return exchangeid;
	}


	public void setExchangeid(Integer exchangeid) {
		this.exchangeid = exchangeid;
	}


	public String getPricingdate() {
		return pricingdate;
	}


	public void setPricingdate(String pricingdate) {
		this.pricingdate = pricingdate;
	}


	public Double getAdjustmentFactor() {
		return adjustmentFactor;
	}


	public void setAdjustmentFactor(Double adjustmentFactor) {
		this.adjustmentFactor = adjustmentFactor;
	}


	public Integer getTradingitemid() {
		return tradingitemid;
	}


	public void setTradingitemid(Integer tradingitemid) {
		this.tradingitemid = tradingitemid;
	}


	public Double getPricehigh() {
		return pricehigh;
	}


	public void setPricehigh(Double pricehigh) {
		this.pricehigh = pricehigh;
	}


	@Override
	public String toString()
	{
		return "[priceopen = "+getPriceopen()+", priceclose = "+getPriceclose()+", pricelow = "+getPricelow()+", currencyId = "+getCurrencyId()+", divAdjFactor = "+getDivAdjFactor()+", exchangeid = "+getExchangeid()+", pricingdate = "+getPricingdate()+", adjustmentFactor = "+getAdjustmentFactor()+", tradingitemid = "+getTradingitemid()+", pricehigh = "+getPricehigh()+"]";
	}
}

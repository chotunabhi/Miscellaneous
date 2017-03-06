package xml;

public class Exchange {
	private String AlteredCloseLocalTime;

	private String Offset;

	private Integer EmbargoMinutes;

	private Integer AssetClassID;

	private String EventDate;

	private String EventDescription;

	private String ExchangeSessionName;

	private String ExchangeName;

	private String PublishedMIC;

	private String TradingEndLocalTime;

	private Integer ExchangeID;

	private String PrimaryTimeZoneID;

	private String AlteredOpenLocalTime;

	private String TradingStartLocalTime;
	
	private String Type;

	public String getType() {
		return Type ;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getAlteredCloseLocalTime() {
		return AlteredCloseLocalTime;
	}

	public void setAlteredCloseLocalTime(String alteredCloseLocalTime) {
		AlteredCloseLocalTime = alteredCloseLocalTime;
	}

	public String getOffset() {
		return Offset == null ? "" : Offset;
	}

	public void setOffset(String offset) {
		Offset = offset;
	}

	public Integer getEmbargoMinutes() {
		return EmbargoMinutes == null ? -1 : EmbargoMinutes;
	}

	public void setEmbargoMinutes(Integer embargoMinutes) {
		EmbargoMinutes = embargoMinutes;
	}

	public Integer getAssetClassID() {
		return AssetClassID == null ? -1 : AssetClassID;
	}

	public void setAssetClassID(Integer assetClassID) {
		AssetClassID = assetClassID;
	}

	public String getEventDate() {
		return EventDate == null ? "" : EventDate;
	}

	public void setEventDate(String eventDate) {
		EventDate = eventDate;
	}

	public String getEventDescription() {
		return EventDescription == null ? "" : EventDescription;
	}

	public void setEventDescription(String eventDescription) {
		EventDescription = eventDescription;
	}

	public String getExchangeSessionName() {
		return ExchangeSessionName == null ? "" : ExchangeSessionName;
	}

	public void setExchangeSessionName(String exchangeSessionName) {
		ExchangeSessionName = exchangeSessionName;
	}

	public String getExchangeName() {
		return ExchangeName == null ? "" : ExchangeName;
	}

	public void setExchangeName(String exchangeName) {
		ExchangeName = exchangeName;
	}

	public String getPublishedMIC() {
		return PublishedMIC == null ? "" : PublishedMIC;
	}

	public void setPublishedMIC(String publishedMIC) {
		PublishedMIC = publishedMIC;
	}

	public String getTradingEndLocalTime() {
		return TradingEndLocalTime == null ? "" : TradingEndLocalTime;
	}

	public void setTradingEndLocalTime(String tradingEndLocalTime) {
		TradingEndLocalTime = tradingEndLocalTime;
	}

	public Integer getExchangeID() {
		return ExchangeID == null ? -1 : ExchangeID;
	}

	public void setExchangeID(Integer exchangeID) {
		ExchangeID = exchangeID;
	}

	public String getPrimaryTimeZoneID() {
		return PrimaryTimeZoneID == null ? "" : PrimaryTimeZoneID;
	}

	public void setPrimaryTimeZoneID(String primaryTimeZoneID) {
		PrimaryTimeZoneID = primaryTimeZoneID;
	}

	public String getAlteredOpenLocalTime() {
		return AlteredOpenLocalTime;
	}

	public void setAlteredOpenLocalTime(String alteredOpenLocalTime) {
		AlteredOpenLocalTime = alteredOpenLocalTime;
	}

	public String getTradingStartLocalTime() {
		return TradingStartLocalTime;
	}

	public void setTradingStartLocalTime(String tradingStartLocalTime) {
		TradingStartLocalTime = tradingStartLocalTime;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [AlteredCloseLocalTime = "+AlteredCloseLocalTime+", Offset = "+Offset+", EmbargoMinutes = "+EmbargoMinutes+", AssetClassID = "+AssetClassID+", EventDate = "+EventDate+", EventDescription = "+EventDescription+", ExchangeSessionName = "+ExchangeSessionName+", ExchangeName = "+ExchangeName+", PublishedMIC = "+PublishedMIC+", TradingEndLocalTime = "+"TradingEndLocalTime"+", ExchangeID = "+ExchangeID+", PrimaryTimeZoneID = "+PrimaryTimeZoneID+", AlteredOpenLocalTime = "+"AlteredOpenLocalTime"+	", TradingStartLocalTime = "+"TradingStartLocalTime"+"]";
	}
}

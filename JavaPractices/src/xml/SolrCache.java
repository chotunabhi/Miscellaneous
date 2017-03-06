package xml;

import java.text.ParseException;

public class SolrCache {
	private String TranType;

	private String SecurityId;

	private String SecurityGroupId;

	private String CUSIPList;

	private String IssuerName;

	private String PriorAdjustmentDate;

	private String ExchangeCountryId;

	private String CompanyId;

	private String Asset_Spl_Flag;

	private String IndexList;


	private String msgQHID;
	
	private String QHID;

	private String RtUniqueId;

	private String CurrentAdjustmentFactor;

	private String InternalEntitlementID;

	private String TradingItemId;
	
	private String msgTradingItemId;

	private String internalSourceId;

	private String ISINList;

	private String PriorAdjustmentFactor;

	private String IndexType;

	private String MaturityDate;

	private String SequenceId;

	private String Ticker;

	private String IsPrimaryTradingItem;

	private String AdjustmentFanOutTradingItemID;

	private String SEDOL;

	private String CurrentAdjustmentDate;

	private String InternalEntitlementIdList;

	private String ExchangeGeographyId;

	private String OfferCoupon;

	private String SecurityName;

	private String CompanyName;

	private String IssueName;

	private String ISIN;

	private String IsPrimarySecurity;

	private String SecurityGroupName;

	private String CUSIP;

	private String ExchangeSymbol;

	private String TranUTCDateTime;

	private String ISOCurrencyCode;

	private String SecuritySubType;

	public String getTranType() {
		return TranType == null ? "" : TranType;
	}

	public void setTranType(String tranType) {
		TranType = tranType;
	}

	public String getSecurityId() {
		return SecurityId == null ? "" : SecurityId;
	}

	public void setSecurityId(String securityId) {
		SecurityId = securityId;
	}

	public String getSecurityGroupId() {
		return SecurityGroupId == null ? "" : SecurityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		SecurityGroupId = securityGroupId;
	}

	public String getCUSIPList() {
		return CUSIPList == null ? "" : CUSIPList;
	}

	public void setCUSIPList(String cUSIPList) {
		CUSIPList = cUSIPList;
	}

	public String getIssuerName() {
		return IssuerName == null ? "" : IssuerName;
	}

	public void setIssuerName(String issuerName) {
		IssuerName = issuerName;
	}

	public String getPriorAdjustmentDate() {
		return PriorAdjustmentDate == null ? "" : PriorAdjustmentDate;
	}

	public void setPriorAdjustmentDate(String priorAdjustmentDate) {
		PriorAdjustmentDate = priorAdjustmentDate;
	}

	public String getExchangeCountryId() {
		return ExchangeCountryId == null ? "" : ExchangeCountryId;
	}

	public void setExchangeCountryId(String exchangeCountryId) {
		ExchangeCountryId = exchangeCountryId;
	}

	public String getCompanyId() {
		return CompanyId == null ? "" : CompanyId;
	}

	public void setCompanyId(String companyId) {
		CompanyId = companyId;
	}

	public String getAsset_Spl_Flag() {
		return Asset_Spl_Flag == null ? "" : Asset_Spl_Flag;
	}

	public void setAsset_Spl_Flag(String asset_Spl_Flag) {
		Asset_Spl_Flag = asset_Spl_Flag;
	}

	public String getIndexList() {
		return IndexList == null ? "" : IndexList;
	}

	public void setIndexList(String indexList) {
		IndexList = indexList;
	}

	public String getMsgQHID() {
		return msgQHID == null ? "" : msgQHID;
	}

	public void setMsgQHID(String msgQHID) {
		this.msgQHID = msgQHID;
	}

	public String getQHID() {
		return QHID == null ? "" : QHID;
	}

	public void setQHID(String qHID) {
		QHID = qHID;
	}

	public String getRtUniqueId() {
		return RtUniqueId == null ? "" : RtUniqueId;
	}

	public void setRtUniqueId(String rtUniqueId) {
		RtUniqueId = rtUniqueId;
	}

	public String getCurrentAdjustmentFactor() {
		return CurrentAdjustmentFactor == null ? ""
				: CurrentAdjustmentFactor;
	}

	public void setCurrentAdjustmentFactor(String currentAdjustmentFactor) {
		CurrentAdjustmentFactor = currentAdjustmentFactor;
	}

	public String getInternalEntitlementID() {
		return InternalEntitlementID == null ? "" : InternalEntitlementID;
	}

	public void setInternalEntitlementID(String internalEntitlementID) {
		InternalEntitlementID = internalEntitlementID;
	}

	public String getTradingItemId() {
		return TradingItemId == null ? "" : TradingItemId;
	}

	public void setTradingItemId(String tradingItemId) {
		TradingItemId = tradingItemId;
	}

	public String getMsgTradingItemId() {
		return msgTradingItemId == null ? "" : msgTradingItemId;
	}

	public void setMsgTradingItemId(String msgTradingItemId) {
		this.msgTradingItemId = msgTradingItemId;
	}

	public String getInternalSourceId() {
		return internalSourceId == null ? "" : internalSourceId;
	}

	public void setInternalSourceId(String internalSourceId) {
		this.internalSourceId = internalSourceId;
	}

	public String getISINList() {
		return ISINList == null ? "" : ISINList;
	}

	public void setISINList(String iSINList) {
		ISINList = iSINList;
	}

	public String getPriorAdjustmentFactor() {
		return PriorAdjustmentFactor == null ? "" : PriorAdjustmentFactor;
	}

	public void setPriorAdjustmentFactor(String priorAdjustmentFactor) {
		PriorAdjustmentFactor = priorAdjustmentFactor;
	}

	public String getIndexType() {
		return IndexType == null ? "" : IndexType;
	}

	public void setIndexType(String indexType) {
		IndexType = indexType;
	}

	public String getMaturityDate() {
		return MaturityDate == null ? "" : MaturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		MaturityDate = maturityDate;
	}

	public String getSequenceId() {
		return SequenceId == null ? "" : SequenceId;
	}

	public void setSequenceId(String sequenceId) {
		SequenceId = sequenceId;
	}

	public String getTicker() {
		return Ticker == null ? "" : Ticker;
	}

	public void setTicker(String ticker) {
		Ticker = ticker;
	}

	public String getIsPrimaryTradingItem() {
		return IsPrimaryTradingItem == null ? "" : IsPrimaryTradingItem;
	}

	public void setIsPrimaryTradingItem(String isPrimaryTradingItem) {
		IsPrimaryTradingItem = isPrimaryTradingItem;
	}

	public String getAdjustmentFanOutTradingItemID() {
		return AdjustmentFanOutTradingItemID == null ? ""
				: AdjustmentFanOutTradingItemID;
	}

	public void setAdjustmentFanOutTradingItemID(
			String adjustmentFanOutTradingItemID) {
		AdjustmentFanOutTradingItemID = adjustmentFanOutTradingItemID;
	}

	public String getSEDOL() {
		return SEDOL == null ? "" : SEDOL;
	}

	public void setSEDOL(String sEDOL) {
		SEDOL = sEDOL;
	}

	public String getCurrentAdjustmentDate() {
		return CurrentAdjustmentDate == null ? "" : CurrentAdjustmentDate;
	}

	public void setCurrentAdjustmentDate(String currentAdjustmentDate) {
		CurrentAdjustmentDate = currentAdjustmentDate;
	}

	public String getInternalEntitlementIdList() {
		return InternalEntitlementIdList == null ? ""
				: InternalEntitlementIdList;
	}

	public void setInternalEntitlementIdList(String internalEntitlementIdList) {
		InternalEntitlementIdList = internalEntitlementIdList;
	}

	public String getExchangeGeographyId() {
		return ExchangeGeographyId == null ? "" : ExchangeGeographyId;
	}

	public void setExchangeGeographyId(String exchangeGeographyId) {
		ExchangeGeographyId = exchangeGeographyId;
	}

	public String getOfferCoupon() {
		return OfferCoupon == null ? "" : OfferCoupon;
	}

	public void setOfferCoupon(String offerCoupon) {
		OfferCoupon = offerCoupon;
	}

	public String getSecurityName() {
		return SecurityName == null ? "" : SecurityName;
	}

	public void setSecurityName(String securityName) {
		SecurityName = securityName;
	}

	public String getCompanyName() {
		return CompanyName == null ? "" : CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getIssueName() {
		return IssueName == null ? "" : IssueName;
	}

	public void setIssueName(String issueName) {
		IssueName = issueName;
	}

	public String getISIN() {
		return ISIN == null ? "" : ISIN;
	}

	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}

	public String getIsPrimarySecurity() {
		return IsPrimarySecurity == null ? "" : IsPrimarySecurity;
	}

	public void setIsPrimarySecurity(String isPrimarySecurity) {
		IsPrimarySecurity = isPrimarySecurity;
	}

	public String getSecurityGroupName() {
		return SecurityGroupName == null ? "" : SecurityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		SecurityGroupName = securityGroupName;
	}

	public String getCUSIP() {
		return CUSIP == null ? "" : CUSIP;
	}

	public void setCUSIP(String cUSIP) {
		CUSIP = cUSIP;
	}

	public String getExchangeSymbol() {
		return ExchangeSymbol == null ? "" : ExchangeSymbol;
	}

	public void setExchangeSymbol(String exchangeSymbol) {
		ExchangeSymbol = exchangeSymbol;
	}

	public String getTranUTCDateTime() {
		return TranUTCDateTime == null ? "" : TranUTCDateTime;
	}

	public void setTranUTCDateTime(String tranUTCDateTime) {
		TranUTCDateTime = tranUTCDateTime;
	}

	public String getISOCurrencyCode() {
		return ISOCurrencyCode == null ? "" : ISOCurrencyCode;
	}

	public void setISOCurrencyCode(String iSOCurrencyCode) {
		ISOCurrencyCode = iSOCurrencyCode;
	}

	public String getSecuritySubType() {
		return SecuritySubType == null ? "" : SecuritySubType;
	}

	public void setSecuritySubType(String securitySubType) {
		SecuritySubType = securitySubType;
	}
	
}
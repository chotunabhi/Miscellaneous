package xml;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WatchListConstituent")
@XmlRootElement(name="WatchListConstituent")
public class WatchListConstituent {
	private int WatchListId;
	private int ConstituentId;
	private String SecurityId;
	private String ConstituentName;
	private String QuanthouseInstrumentId;
	private String CompanyId;
	private String SortOrder;
	private String ConstituentType;
	private String CIQTradingItemId;
	private String SecuritySubTypeId;
	private String TranType;
	public String getTranType() {
		return TranType == null ? "" : TranType;
	}
	private final List<Integer> validSecuritySubtypes = Arrays.asList(1,2,3,7,10,12,22,25,37,60,62);
	private Set<Integer> internalEntitlementIds = new HashSet<>();

	public Integer getSecuritySubTypeId() {
		return SecuritySubTypeId == null || SecuritySubTypeId.isEmpty() ? null : Integer.parseInt(SecuritySubTypeId);
	}
	public int getWatchListId() {
		return WatchListId;
	}
	public int getConstituentId() {
		return ConstituentId;
	}
	public String getSecurityId() {
		return SecurityId == null ? "" : SecurityId;
	}
	public String getConstituentName() {
		return ConstituentName == null ? "" : ConstituentName;
	}
	public Integer getQuanthouseInstrumentId() {
		return QuanthouseInstrumentId == null || QuanthouseInstrumentId.isEmpty() ? null : Integer.parseInt(QuanthouseInstrumentId);
	}
	public Set<Integer> getInternalEntitlementIds() {
		return internalEntitlementIds;
	}
	public void setInternalEntitlementIds(Set<Integer> internalEntitlementIds) {
		this.internalEntitlementIds = internalEntitlementIds;
	}
	public Integer getCompanyId() {
		return CompanyId == null || CompanyId.isEmpty() ? null : Integer.parseInt(CompanyId);
	}
	public Integer getSortOrder() {
		return SortOrder == null || SortOrder.isEmpty() ? null : Integer.parseInt(SortOrder);
	}
	public String getConstituentType() {
		return ConstituentType == null ? "" : ConstituentType;
	}
	public Integer getCIQTradingItemId() {
		return CIQTradingItemId == null || CIQTradingItemId.isEmpty() ? null : Integer.parseInt(CIQTradingItemId);
	}
	public Integer getObjectId(){
		return getCIQTradingItemId() != null ? getCIQTradingItemId() : getQuanthouseInstrumentId();
	}
	public Boolean isPrivate(){
		return getSecuritySubTypeId() != null && validSecuritySubtypes.contains(getSecuritySubTypeId()) ? Boolean.TRUE : Boolean.FALSE;
	}
}

package xml;

import java.io.Serializable;
import java.util.Date;

import org.joda.time.DateTime;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WatchListInfo")
public class WatchListInfo implements Serializable {
	private String CompanyConstituentCount;
	
	private String CreationDateUTC;

	private String Description;

	private String TickerSymbol;

	private String SubEmailUpdates;

	private String ActiveFlag;

	private String IsTemp;

	private String CreatedByUserObjectID;

	private String SecurityConstituentCount;

	private String RefreshDate;

	private String ConstituentCount;

	private String WeightTypeID;

	private int WatchListId;

	private String UserCompanyId;

	private String BenchMarkCompanyID;

	private String PricingConstituentCount;

	private String StartDateUTC;

	private String LastModifiedDateUTC;

	private String WatchListName;

	private String HasAggregateFinancials;

	private String EmailUpdates;

	private String CompanyListId;

	public Integer getCompanyConstituentCount() {
		return (CompanyConstituentCount == null || CompanyConstituentCount.isEmpty())? null : Integer.parseInt(CompanyConstituentCount);
	}

	public Date getCreationDateUTC() {
		return (CreationDateUTC == null || CreationDateUTC.isEmpty())? null : new DateTime(CreationDateUTC).toDate();
	}

	public String getDescription() {
		return Description;
	}

	public String getTickerSymbol() {
		return TickerSymbol;
	}

	public boolean getSubEmailUpdates() {
		return (SubEmailUpdates == null || SubEmailUpdates.isEmpty() || SubEmailUpdates.equals("0")) ? Boolean.FALSE : Boolean.TRUE;
	}

	public boolean getActiveFlag() {
		return (ActiveFlag == null || ActiveFlag.isEmpty() || ActiveFlag.equals("0")) ? Boolean.FALSE : Boolean.TRUE;
	}

	public boolean getIsTemp() {
		return (IsTemp == null || IsTemp.isEmpty() || IsTemp.equals("0")) ? Boolean.FALSE : Boolean.TRUE;
	}

	public Integer getCreatedByUserObjectID() {
		return (CreatedByUserObjectID == null || CreatedByUserObjectID.isEmpty())? null : Integer.parseInt(CreatedByUserObjectID);
	}

	public Integer getSecurityConstituentCount() {
		return (SecurityConstituentCount == null || SecurityConstituentCount.isEmpty())? null : Integer.parseInt(SecurityConstituentCount);
	}

	public Date getRefreshDate() {
		return (RefreshDate == null || RefreshDate.isEmpty())? null : new DateTime(RefreshDate).toDate();
	}

	public Integer getConstituentCount() {
		return (ConstituentCount == null || ConstituentCount.isEmpty())? null : Integer.parseInt(ConstituentCount);
	}

	public Integer getWeightTypeID() {
		return (WeightTypeID == null || WeightTypeID.isEmpty())? null : Integer.parseInt(WeightTypeID);
	}

	public int getWatchListId() {
		return WatchListId;
	}

	public Integer getUserCompanyId() {
		return (UserCompanyId == null || UserCompanyId.isEmpty())? null : Integer.parseInt(UserCompanyId);
	}

	public Integer getBenchMarkCompanyID() {
		return (BenchMarkCompanyID == null || BenchMarkCompanyID.isEmpty())? null : Integer.parseInt(BenchMarkCompanyID);
	}

	public Integer getPricingConstituentCount() {
		return (PricingConstituentCount == null || PricingConstituentCount.isEmpty())? null : Integer.parseInt(PricingConstituentCount);
	}

	public Date getStartDateUTC() {
		return (StartDateUTC == null || StartDateUTC.isEmpty())? null : new DateTime(StartDateUTC).toDate();
	}

	public Date getLastModifiedDateUTC() {
		return (LastModifiedDateUTC == null || LastModifiedDateUTC.isEmpty())? null : new DateTime(LastModifiedDateUTC).toDate();
	}

	public String getWatchListName() {
		return WatchListName;
	}

	public Integer getHasAggregateFinancials() {
		return (HasAggregateFinancials == null || HasAggregateFinancials.isEmpty())? null : Integer.parseInt(HasAggregateFinancials);
	}

	public boolean getEmailUpdates() {
		return (EmailUpdates == null || EmailUpdates.isEmpty() || EmailUpdates.equals("0")) ? Boolean.FALSE : Boolean.TRUE;
	}

	public Integer getCompanyListId() {
		return (CompanyListId == null || CompanyListId.isEmpty())? null : Integer.parseInt(CompanyListId);
	}
}

package xml;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.joda.time.DateTime;

import com.thoughtworks.xstream.XStream;


public class XmlParser {
	private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat actualFormat1 = new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat actualFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
	public static void main(String[] args) throws IOException, ParseException,Exception{
		// TODO Auto-generated method stub
		XStream xStream = new XStream();
		String wlConstituents = "<WatchListConstituent><WatchListId>60571161</WatchListId><ConstituentId>2586084</ConstituentId><ConstituentType>0</ConstituentType><ConstituentName>POPEYES LOUISIANA KITCHEN, INC. COMMON STOCK</ConstituentName><CIQTradingItemId>2585881</CIQTradingItemId><CompanyId>10</CompanyId><SecurityId>2590818</SecurityId><QuanthouseInstrumentId>669492750</QuanthouseInstrumentId><TranType>I</TranType><SortOrder>0</SortOrder></WatchListConstituent>";
		xStream.processAnnotations(WatchListConstituent.class);
		xStream.ignoreUnknownElements();
		WatchListConstituent wm = (WatchListConstituent) xStream.fromXML(wlConstituents);
		
System.out.println(wm.getWatchListId());		
		
	/*	BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\asrinivasa\\Desktop\\Save_1.xml"));
		TradingItem tidSave[] = new TradingItem[9];
		TradingItem tidGet[] = new TradingItem[9];
		
		
		
		xStream.alias("TradingItems", TradingItem.class);
		xStream.alias("TradingItemDetail", TradingItemDetail.class);
		xStream.addImplicitCollection(TradingItem.class, "TradingItemDetail");
		
		for(int i = 0;i<9;i++){
			bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\asrinivasa\\Desktop\\SAVE_"+(i+1)+".xml"));
			int ch=-1;
			StringBuffer save = new StringBuffer();
			while((ch = bufferedInputStream.read()) != -1)
				save.append((char)ch);
			
			tidSave[i] =  (TradingItem)xStream.fromXML(save.toString());
		}
		
		for(int i = 0;i<3;i++){
			bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\asrinivasa\\Desktop\\GET_"+(i+1)+".xml"));
			int ch=-1;
			StringBuffer save = new StringBuffer();
			while((ch = bufferedInputStream.read()) != -1)
				save.append((char)ch);
			
			tidGet[i] =  (TradingItem)xStream.fromXML(save.toString());
		}
//		tidSave[0].getTradingItemDetail().forEach(x -> System.out.println(x.getId()));
//	 showDiffs(tidSave[7],tidSave[8]);
//	 showDiffs(tidSave[1],tidSave[2]);
	 showDiffs(tidSave[8],tidGet[2]);*/
//	 showDiffs(tidGet[0],tidGet[1]);
//	 showDiffs(tidGet[1],tidSave[3]);
//	 showDiffs(tidSave[3],tidGet[4]);
	 
	}

	public static void showDiffs(TradingItem save,TradingItem get){
		List<String> saveList = new ArrayList<>();
		List<String> getList = new ArrayList<>();
		
		List<String> addList = new ArrayList<>();
		List<String> removeList = new ArrayList<>();
		
//		save.getTradingItemDetail().forEach(ti -> saveList.add(ti.getId()));
//		get.getTradingItemDetail().forEach(ti -> getList.add(ti.getId()));
		
		System.out.println(save.getTradingItemDetail().size());
		System.out.println(get.getTradingItemDetail().size());
				
		for (TradingItemDetail tidSave : save.getTradingItemDetail()) {
			boolean exist = false;
			for (TradingItemDetail tidGet : get.getTradingItemDetail()) {
				if(tidSave.getId().trim().isEmpty() || tidSave.getId().trim().equalsIgnoreCase(tidGet.getId().trim()))
					exist = true;
			}
			if(!exist)
				addList.add(tidSave.getId());
		}
		
		for (TradingItemDetail tidGet : get.getTradingItemDetail()) {
			boolean exist = false;
			for (TradingItemDetail tidSave : save.getTradingItemDetail()) {
				if(tidSave.getId().trim().isEmpty() || tidSave.getId().trim().equalsIgnoreCase(tidGet.getId().trim()))
					exist = true;
			}
			if(!exist)
				removeList.add(tidGet.getId());
		}
		
		System.out.println(addList);
		System.out.println(removeList);
		
	}
	
	private static void print(SolrCache solrCache)  {
		try{
			// TODO Auto-generated method stub
			System.out.println("RTUniqueId:: "+ (solrCache.getRtUniqueId().isEmpty()?null:solrCache.getRtUniqueId()));
			System.out.println("TranType :: "+ (solrCache.getTranType().isEmpty()?null:solrCache.getTranType()));
			System.out.println("rowId: : "+(solrCache.getSequenceId().isEmpty()?null:Integer.parseInt(solrCache.getSequenceId()))); //need to add
			System.out.println("CompanyId :: "+(solrCache.getCompanyId().isEmpty()?null:Integer.parseInt(solrCache.getCompanyId())));
			System.out.println("QHID : : "+( solrCache.getQHID().isEmpty()?null:Integer.parseInt(solrCache.getQHID())));//prob
			System.out.println("Company Name : "+(solrCache.getCompanyName().isEmpty()?null:solrCache.getCompanyName()));
			System.out.println("ciqPrefixedSecurityId : : "+"IQ: "+ ((solrCache.getSecurityId().isEmpty()?null:solrCache.getSecurityId())));
			System.out.println(("securitySubType : "+ (solrCache.getSecuritySubType().isEmpty()?null:(solrCache.getSecuritySubType()).replace(" ", "_").toUpperCase())));
			System.out.println("securityId: "+(solrCache.getSecurityId().isEmpty()?null:Integer.parseInt(solrCache.getSecurityId())));
			//System.out.println(type.name() + "\"", solrCache.getType()));
			if (!solrCache.getSecuritySubType().isEmpty())
				System.out.println("securitySubType: "+((solrCache.getSecuritySubType()).replace(" ", "_").toUpperCase()));
			System.out.println("tidTicker: "+(solrCache.getTicker().isEmpty()?null:solrCache.getTicker()));
			if (!solrCache.getTradingItemId().isEmpty())
				System.out.println("iqtPrefixedTID: "+ "IQT: "+( solrCache.getTradingItemId()));
			System.out.println("tid: "+(solrCache.getTradingItemId().isEmpty()?null:Integer.parseInt(solrCache.getTradingItemId())));
			System.out.println("securityName: "+((solrCache.getSecurityName().isEmpty()?null:solrCache.getSecurityName())));
			System.out.println("tidExchangeSymbol: "+((solrCache.getExchangeSymbol().isEmpty()?null:solrCache.getExchangeSymbol())));
			if (solrCache.getExchangeSymbol().isEmpty() || solrCache.getTicker() .isEmpty())
				System.out.println("tidExchangeTicker : ");
			else
				System.out.println("tidExchangeTicker: "+(solrCache.getExchangeSymbol() + ":: "+ solrCache.getTicker()));
			System.out.println("isoCode: "+ ((solrCache.getISOCurrencyCode().isEmpty()?null:solrCache.getISOCurrencyCode())));
			if (!solrCache.getIsPrimaryTradingItem().isEmpty())
				System.out.println("isPrimaryTID: "+ (Integer.parseInt(solrCache.getIsPrimaryTradingItem())));
			System.out.println("cusipPrimary: "+((solrCache.getCUSIP().isEmpty()?null:solrCache.getCUSIP())));
			System.out.println("isinPrimary: "+((solrCache.getISIN().isEmpty()?null:solrCache.getISIN())));
			//update.with(QueryBuilder.set(Columns.QHIDS_I.name(), solrCache.getQhid()));
			System.out.println("qhPrefixedQHID: "+"QH: "+( (solrCache.getQHID().isEmpty()?null:solrCache.getQHID())));
			System.out.println("indicesList: "+(solrCache.getIndexList().isEmpty()?null:solrCache.getIndexList()));
			System.out.println("isPrimarySecurity: "+(solrCache.getIsPrimarySecurity().isEmpty()?null:Integer.parseInt(solrCache.getIsPrimarySecurity())));
			System.out.println("assetClassName: "+(solrCache.getSecurityGroupName().isEmpty()?null:solrCache.getSecurityGroupName())); //Need to add
			System.out.println("assetClassId: "+(solrCache.getSecurityGroupId().isEmpty()?null:Integer.parseInt(solrCache.getSecurityGroupId().toString())));//need to add
			System.out.println("exchangeGeographyId: "+(solrCache.getExchangeGeographyId().isEmpty()?null:Integer.parseInt(solrCache.getExchangeGeographyId())));
			System.out.println("exchangeCountryId: "+(solrCache.getExchangeCountryId().isEmpty()?null:Integer.parseInt(solrCache.getExchangeCountryId())));
			System.out.println("securityRank: "+"0"); //TODO change this
			System.out.println("isLinked: "+ (!solrCache.getTradingItemId().isEmpty()? 1 : 0));
			System.out.println("internalSourceId: "+(solrCache.getInternalSourceId().isEmpty()?null:Integer.parseInt(solrCache.getInternalSourceId())));
			System.out.println("tranUTCDateTime: "+(solrCache.getTranUTCDateTime().isEmpty() ?null:dateTimeFormat.format(actualFormat.parse(solrCache.getTranUTCDateTime()))));
			System.out.println("isinList: "+(solrCache.getISINList().isEmpty()?null:solrCache.getISINList()));
			System.out.println("cusipList: "+ (solrCache.getCUSIPList().isEmpty()?null:solrCache.getCUSIPList()));
			System.out.println("currentAdjFactor: "+(solrCache.getCurrentAdjustmentFactor().isEmpty()?null:Double.parseDouble(solrCache.getCurrentAdjustmentFactor())));
			System.out.println("currentAdjDate: "+ (solrCache.getCurrentAdjustmentDate().isEmpty()?null:dateFormat.format(dateFormat.parse(solrCache.getCurrentAdjustmentDate()))));
			System.out.println("priorAdjFactor: "+ (solrCache.getPriorAdjustmentFactor().isEmpty()?null:Double.parseDouble(solrCache.getPriorAdjustmentFactor())));
			System.out.println("priorAdjDate: "+ (solrCache.getPriorAdjustmentDate().isEmpty()?null:dateFormat.format(dateFormat.parse(solrCache.getPriorAdjustmentDate()))));
			System.out.println("internalEntitlementId: "+ (solrCache.getInternalEntitlementID().isEmpty()?null:solrCache.getInternalEntitlementID()));
			System.out.println("internalEntitlementIdList: "+ (solrCache.getInternalEntitlementIdList().isEmpty()?null:solrCache.getInternalEntitlementIdList()));
			System.out.println("adjFanoutTID: "+ ( solrCache.getAdjustmentFanOutTradingItemID().isEmpty()?null:Integer.parseInt(solrCache.getAdjustmentFanOutTradingItemID())));
			System.out.println("assetClassType: "+(solrCache.getAsset_Spl_Flag()));
			System.out.println("IssuerName"+ (solrCache.getIssuerName().isEmpty()?null:solrCache.getIssuerName())); //Need tp add
			System.out.println("IssueName"+ (solrCache.getIssueName().isEmpty()?null:solrCache.getIssueName())); //Need tp add
			System.out.println("IndexType"+ (solrCache.getIndexType().isEmpty()?null:solrCache.getIndexType())); //Need tp add
			//		System.out.println(MaturityDate.name() + "\"", solrCache.getMaturityDate().isEmpty()?null:dateFormat.format(dateFormat.parse(solrCache.getMaturityDate())))); //Need tp add
			System.out.println("offerCoupon" + (solrCache.getOfferCoupon().isEmpty()?null:solrCache.getOfferCoupon())); //Need tp add
			System.out.println("sedol" +(solrCache.getSEDOL().isEmpty()?null:solrCache.getSEDOL())); //Need tp add

		}
		catch(Exception e){
			System.out.println("in Print : "+ e.getMessage());
		}
	}

}

package com.java.solr;


public class ConnectToSolr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SolrQuery query = new SolrQuery();
		query.setQuery("*:*");
		query.setFields("tid,qhid,internalEntitlementId");
		query.addField("(tid:2586086 AND qhid:1059063601) OR (tid:2586118 AND qhid:1059063800) OR (tid:2586533 AND qhid:1059064092) OR (tid:2587303 AND qhid:1059062924) OR (tid:2587390 AND qhid:1059063762) OR (tid:2587460 AND qhid:1059064699) OR (tid:2587580 AND qhid:1059062979) OR (tid:2587606 AND qhid:1059063639) OR (tid:2587881 AND qhid:1059062817) OR (tid:2588077 AND qhid:1059063672) OR (tid:2588450 AND qhid:669492725) OR (tid:2588568 AND qhid:669491560) OR (tid:2588654 AND qhid:1059063713) OR (tid:2588872 AND qhid:1059064184) OR (tid:2588913 AND qhid:1059063967) OR (tid:2589073 AND qhid:1059062887) OR (tid:2589769 AND qhid:669492425) OR (tid:2589895 AND qhid:1059063215) OR (tid:2590230 AND qhid:1059070712) OR (tid:2590238 AND qhid:1059062939) OR (tid:2592032 AND qhid:1059063638) OR (tid:2592597 AND qhid:1059063564) OR (tid:2592681 AND qhid:1059064428) OR (tid:2592914 AND qhid:1059062771) OR (tid:2593346 AND qhid:1059063632) OR (tid:2593695 AND qhid:1059063705) OR (tid:2593888 AND qhid:1059063634) OR (tid:2594023 AND qhid:1059063566) OR (tid:2594158 AND qhid:1059064098) OR (tid:2594192 AND qhid:1059064236) OR (tid:2596835 AND qhid:1059063400) OR (tid:2596945 AND qhid:1059064446) OR (tid:2597012 AND qhid:1059064270) OR (tid:2597397 AND qhid:1059065868) OR (tid:2597991 AND qhid:1059063637) OR (tid:2598155 AND qhid:1059063633) OR (tid:2598323 AND qhid:1059062901) OR (tid:2598619 AND qhid:1059063337) OR (tid:2598787 AND qhid:669493346) OR (tid:2599302 AND qhid:1059064275) OR (tid:2599340 AND qhid:669493349) OR (tid:2599793 AND qhid:1059062891) OR (tid:2600566 AND qhid:1059063846) OR tid:2600582 OR (tid:2600628 AND qhid:1059062835) OR (tid:2602648 AND qhid:1059066002) OR (tid:2602822 AND qhid:1059063621) OR (tid:2603263 AND qhid:1059063493) OR (tid:2604195 AND qhid:1059063089) OR (tid:2604698 AND qhid:1059063730) OR (tid:2604722 AND qhid:1059064292) OR (tid:2604878 AND qhid:1059062974) OR (tid:2606473 AND qhid:1059063806) OR (tid:2606599 AND qhid:1059063827) OR (tid:2607387 AND qhid:1059062851) OR (tid:2607507 AND qhid:1059063867) OR (tid:2608062 AND qhid:669492376) OR (tid:2608332 AND qhid:1059066003) OR tid:2608344 OR (tid:2608411 AND qhid:1059063912) OR (tid:2608519 AND qhid:1059063487) OR (tid:2609989 AND qhid:1059063866) OR (tid:2610085 AND qhid:1059064291) OR (tid:2610551 AND qhid:1059064146) OR tid:2610628 OR (tid:2611182 AND qhid:669493537) OR (tid:2611328 AND qhid:1059063527) OR (tid:2612674 AND qhid:669492366) OR (tid:2612708 AND qhid:1059063586) OR (tid:2613214 AND qhid:1059062951) OR tid:2613349 OR (tid:2617365 AND qhid:1059063223) OR (tid:2618035 AND qhid:1059064733) OR (tid:2618261 AND qhid:1059063690) OR (tid:2638938 AND qhid:1059063055) OR (tid:2642679 AND qhid:1059065041) OR (tid:2657992 AND qhid:1059063492) OR (tid:2665846 AND qhid:1059064207) OR (tid:7727529 AND qhid:669492327) OR (tid:10286451 AND qhid:1059063873) OR (tid:23133968 AND qhid:669491667) OR (tid:23515113 AND qhid:1059063412) OR (tid:23895633 AND qhid:1059063630) OR (tid:24268335 AND qhid:1059064747) OR (tid:24993622 AND qhid:1059064821) OR tid:25758143 OR (tid:26591431 AND qhid:1059063067) OR (tid:27127722 AND qhid:1059063569) OR (tid:27143925 AND qhid:1059063402) OR (tid:30252191 AND qhid:669491758) OR (tid:34969538 AND qhid:1059063011) OR (tid:36844550 AND qhid:1059063911) OR (tid:44206722 AND qhid:1059063965) OR (tid:46875436 AND qhid:1059062846) OR (tid:52979343 AND qhid:1059063863) OR (tid:62155180 AND qhid:1059070563) OR (tid:119026528 AND qhid:102764728) OR (tid:212535503 AND qhid:1059063603) OR (tid:225079155 AND qhid:1059073012)");
		query.addSort("tranUTCDateTime",ORDER.asc);
		SolrServer server = new 
				HttpSolrServer("http://nj12mhf0112.mhf.mhc:8983/solr/rtdt_security.ciq_security_master");
		try {
			QueryResponse queryResponse = server.query(query);
			List<EntitlementIDResponse> beans = queryResponse.getBeans(EntitlementIDResponse.class);
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		String s = "abhciaodifja;ldfjklajdfljalfdklahgklakhakdfhklahfkahfklahioehncaklhfiaenao;dfjo;aeio;";
		int l = s.length();
		for(int i=0;i<l;i++)
			System.out.println(s.charAt(i));

	}

}

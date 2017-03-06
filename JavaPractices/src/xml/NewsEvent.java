package xml;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import javax.xml.bind.annotation.XmlRootElement;

@XStreamAlias("AcquireMediaStory")
@XmlRootElement(name="AcquireMediaStory")
public class NewsEvent implements Serializable {
	private String Title;
	private String StoryText;
	private String Source;
	private int SourceID;
	private String ResourceID;
	private String FirstMoverRID;
	private String UnmappedMetaData; // might need to change
//	private Topics Topics;
//	private NewsMetaDataIDs NewsMetaDataIDs;
	private Date DateTimeUTC;
	private String Url;
//	private Language Language;
//	private MediaType MediaType;
//	private Industries Industries;
	private String GroupNewsItems;
	private Boolean HotStory;
	private String Synopsis;
	private String Criteria;
//	private CompanyLinks CompanyLinks;
	private Long userObjectId;
	private String DateTimeUTCDateOnly;
	private String NewsJMSTopic;

	public String getNewsJMSTopic() {
		return NewsJMSTopic;
	}

	public void setNewsJMSTopic(String newsJMSTopic) {
		this.NewsJMSTopic = newsJMSTopic;
	}

	public String getDateTimeUTCDateOnly() {
		DateFormat dateFormatSimple = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormatSimple.format(DateTimeUTC);
	}

	public Long getUserObjectId() {
		return userObjectId;
	}

	public void setUserObjectId(Long userObjectId) {
		this.userObjectId = userObjectId;
	}

	public String getFirstMoverRID() {
		return FirstMoverRID;
	}

	public void setFirstMoverRID(String firstMoverRID) {
		FirstMoverRID = firstMoverRID;
	}

	public String getUnmappedMetaData() {
		return UnmappedMetaData;
	}

	public void setUnmappedMetaData(String unmappedMetaData) {
		UnmappedMetaData = unmappedMetaData;
	}

	/*public Topics getTopics() {
		return Topics;
	}

	public void setTopics(Topics topics) {
		this.Topics = topics;
	}

	public NewsMetaDataIDs getNewsMetaDataIDs() {
		return NewsMetaDataIDs;
	}

	public void setNewsMetaDataIDs(NewsMetaDataIDs newsMetaDataIDs) {
		NewsMetaDataIDs = newsMetaDataIDs;
	}*/

	public Date getDateTimeUTC() {
		return DateTimeUTC;
	}

	public void setDateTimeUTC(Date dateTimeUTC) {
		DateTimeUTC = dateTimeUTC;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	/*public Language getLanguage() {
		return Language;
	}

	public void setLanguage(Language language) {
		Language = language;
	}

	public MediaType getMediaType() {
		return MediaType;
	}

	public void setMediaType(MediaType mediaType) {
		MediaType = mediaType;
	}
*/
	public String getGroupNewsItems() {
		return GroupNewsItems;
	}

	public void setGroupNewsItems(String groupNewsItems) {
		GroupNewsItems = groupNewsItems;
	}

	public String getStoryText() {
		return StoryText;
	}

	public void setStoryText(String storyText) {
		StoryText = storyText;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public int getSourceID() {
		return SourceID;
	}

	public void setSourceID(int sourceID) {
		SourceID = sourceID;
	}

	public String getResourceID() {
		return ResourceID;
	}

	public void setResourceID(String resourceID) {
		ResourceID = resourceID;
	}

	/*public CompanyLinks getCompanyLinks() {
		return CompanyLinks;
	}

	public void setCompanyLinks(CompanyLinks companyLinks) {
		CompanyLinks = companyLinks;
	}*/


	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}


	public String getSynopsis() {
		return Synopsis;
	}

	public void setSynopsis(String Synopsis) {
		this.Synopsis = Synopsis;
	}


	public Boolean getHotStory() {
		return HotStory;
	}

	public void setHotStory(Boolean HotStory) {
		this.HotStory = HotStory;
	}



/*	public Industries getIndustries() {
		return Industries;
	}

	public void setIndustries(Industries industries) {
		Industries = industries;
	}*/

	public String getCriteria() {
		return Criteria;
	}

	public void setCriteria(String criteria) {
		Criteria = criteria;
	}

}


package xml.objectModels.research;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created with IntelliJ IDEA.
 * User: natia_chachkhiani
 * Date: 5/19/14
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */

@XStreamAlias("CapitalIQResearchDocument")

public class Research implements Serializable {
	private String status;
	private String Language;
	private Integer PrimaryResearchDocumentType;
	private Integer VersionFormat;
	private String Headline;
	private Date LastUpdatedDateTime;
	private String ResearchContributor;
	private Companies Companies;
	private Industries Industries;
	private Geographies Geographies;
	private String Criteria;
	@XStreamAsAttribute
	private Integer id;
	private String LastUpdatedDateOnly;
	private ResearchProducts ResearchProducts;
	private String ExtractedText;

	public String getExtractedText() {
		return ExtractedText;
	}

	public void setExtractedText(String extractedText) {
		ExtractedText = extractedText;
	}

	public ResearchProducts getResearchProducts() {
		return ResearchProducts;
	}

	public void setResearchProducts(ResearchProducts researchProducts) {
		ResearchProducts = researchProducts;
	}

	public String getLastUpdatedDateOnly() {
		DateFormat dateFormatSimple = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormatSimple.format(LastUpdatedDateTime);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCriteria() {
		return Criteria;
	}

	public void setCriteria(String criteria) {
		Criteria = criteria;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		status = status;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public Integer getPrimaryResearchDocumentType() {
		return PrimaryResearchDocumentType;
	}

	public void setPrimaryResearchDocumentType(Integer primaryResearchDocumentType) {
		PrimaryResearchDocumentType = primaryResearchDocumentType;
	}

	public Integer getVersionFormat() {
		return VersionFormat;
	}

	public void setVersionFormat(Integer versionFormat) {
		VersionFormat = versionFormat;
	}

	public String getHeadline() {
		return Headline;
	}

	public void setHeadline(String headline) {
		Headline = headline;
	}

	public Date getLastUpdatedDateTime() {
		return LastUpdatedDateTime;
	}

	public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
		LastUpdatedDateTime = lastUpdatedDateTime;
	}

	public String getResearchContributor() {
		return ResearchContributor;
	}

	public void setResearchContributor(String researchContributor) {
		ResearchContributor = researchContributor;
	}

	public Companies getCompanies() {
		return Companies;
	}

	public void setCompanies(Companies companies) {
		Companies = companies;
	}

	public Industries getIndustries() {
		return Industries;
	}

	public void setIndustries(Industries industries) {
		Industries = industries;
	}

	public Geographies getGeographies() {
		return Geographies;
	}

	public void setGeographies(Geographies geographies) {
		Geographies = geographies;
	}


}

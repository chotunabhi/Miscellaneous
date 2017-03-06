package xml.objectModels.research;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Companies {
    @XStreamImplicit(itemFieldName = "Company")
    private List<Company> Company;

    public List<Company> getCompany() {
        return Company;
    }

    public void setCompany(List<Company> company) {
        Company = company;
    }

}

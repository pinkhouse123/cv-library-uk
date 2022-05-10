package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "JobSearch")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Software Tester", "London", "up to 15 miles", "40000", "500000", "Per annum","Permanent", "Permanent Software Tester jobs in London"},
                {"Software API Tester", "Croydon", "up to 5 miles", "30000", "60000", "Per annum","Temporary", "Contract Software API Tester jobs in Croydon"},
                {"Manual Tester", "West London", "up to 4 miles", "30000", "30000", "Per annum","Permanent", "Manual Tester jobs in West London"},
                {"Scrum Master", "Southampton", "up to 10 miles", "30000", "50000", "Per annum","Permanent", "Permanent Scrum Master jobs in Southampton"},
                {"QA", "Coventry", "up to 10 miles", "3000", "4000", "Per day","Contract", "QA jobs in Coventry"},
                {"Research Tester", "Slough", "up to 10 miles", "4000", "5000", "Per annum","Contract", "Research Tester jobs in Slough"},
                {"Automation Tester", "Watford", "up to 5 miles", "20000", "50000", "Per annum","Temporary", "Automation Tester jobs in Watford"},
        };
    }


}
package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countryList = new ArrayList<>();

    public List<Country> getCountryList() {
        return countryList;
    }

    public void readFromFile(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream("/country.txt")))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(" ");
                String name = temp[0];
                int borderCountries = Integer.parseInt(temp[1]);
                countryList.add(new Country(name, borderCountries));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read the file", ioe);
        }
    }

    public int numberOFCountries() {
        return countryList.size();
    }


    public Country mostBorderCountries() {
        Country searchedCountry = null;
        int max = 0;
        for (Country country : countryList) {
            if (max < country.getBorderCountries()) {
                max = country.getBorderCountries();
                searchedCountry = country;
            }
        }
        return searchedCountry;
    }
}

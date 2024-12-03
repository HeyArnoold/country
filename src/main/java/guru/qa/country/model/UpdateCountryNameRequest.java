package guru.qa.country.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UpdateCountryNameRequest(@JsonProperty("country_name")
                                       String countryName) {
}

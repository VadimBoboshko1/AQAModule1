package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetUsersData {
	private String color;
	private int year;
	private String name;
	private int id;
	@JsonProperty("pantone_value")
	private String pantoneValue;
}
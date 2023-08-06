package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Double valuePerHours;
	private Integer hour;
	
	public HourContract() {}

	public HourContract(Date date, Double valuePerHours, Integer hour) {
		this.date = date;
		this.valuePerHours = valuePerHours;
		this.hour = hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public double totalValue() {
		return valuePerHours * hour;
	}
}
 
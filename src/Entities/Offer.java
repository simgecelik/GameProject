package Entities;

import java.time.LocalDate;

public class Offer {
	private String offerCode;
	private String offerName;
	private LocalDate startDate;
	private LocalDate finishDate;

	public Offer(String offerCode, String offerName, LocalDate startDate, LocalDate finishDate) {
		super();
		this.offerCode = offerCode;
		this.offerName = offerName;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}

}

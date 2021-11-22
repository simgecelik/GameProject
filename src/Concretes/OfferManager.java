package Concretes;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getOfferCode() + " kodlu " + offer.getOfferName() + " kampanyasý sisteme eklendi ");

	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getOfferName() + " kampanyasý kullanýmda deðil");

	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getOfferCode() + "kampanyasý güncellenmiþtir.");

	}

}

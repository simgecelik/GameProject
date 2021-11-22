package Concretes;

import Abstract.OfferService;
import Entities.Offer;

public class OfferManager implements OfferService {

	@Override
	public void add(Offer offer) {
		System.out.println(offer.getOfferCode() + " kodlu " + offer.getOfferName() + " kampanyası sisteme eklendi ");

	}

	@Override
	public void delete(Offer offer) {
		System.out.println(offer.getOfferName() + " kampanyası kullanımda değil");

	}

	@Override
	public void update(Offer offer) {
		System.out.println(offer.getOfferCode() + "kampanyası güncellenmiştir.");

	}

}

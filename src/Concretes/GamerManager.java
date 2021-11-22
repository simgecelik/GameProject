package Concretes;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	public void add(Gamer member) {
		if (gamerCheckService.checkIfRealPerson(member)) {
			System.out.println("oyuncu eklendi");
		} else {
			System.out.println("oyuncu eklenemedi");
		}

	}

	public void update(Gamer member) {
		System.out.println(member.getFirstName() + " adl� oyuncunun  bilgileri g�ncellendi");
	}

	public void delete(Gamer member) {
		System.out.println(member.getFirstName() + " adl� oyuncu silindi");

	}
}

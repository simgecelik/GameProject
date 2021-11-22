package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniseServiceAdapters implements GamerCheckService {
	public boolean result;

	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getTcNo()), gamer.getFirstName(),
					gamer.getLastName(), gamer.getBirthYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
}

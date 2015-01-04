package fr.epsi;

import java.util.Random;

import javax.jws.WebService;

import com.mymeteo.meteo.Lieu;
import com.mymeteo.meteo.Releve;
import com.mymeteo.meteo.Temperature;
import com.mymeteo.webservices.meteo.MeteoService;

@WebService(name = "MeteoService", targetNamespace = "http://www.mymeteo.com/webservices/meteo", endpointInterface="com.mymeteo.webservices.meteo.MeteoService")
public class MeteoServiceImpl implements MeteoService {
	
	@Override
	public Releve releveMeteo(Lieu lieu) {
		
		Releve releve = new Releve();
		releve.setLieu(lieu);
		releve.setTemperature(new Temperature());
		releve.getTemperature().setUnite("celsius");
		double valeur = (new Random().nextInt(400) / 10d) - 5d;
		releve.getTemperature().setValeur(valeur);
		
		return releve;
	}
}

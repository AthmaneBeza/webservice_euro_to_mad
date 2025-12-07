package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "ws.BanqueService")
public class BanqueServiceImpl implements BanqueService {

    @Override
    public double conversionEuroToDH(double montant) {
        return montant * 11;
    }

    @Override
    public Compte consulterCompte(int code) {
        return new Compte(code, Math.random() * 9000);
    }

    @Override
    public List<Compte> consulterListeComptes() {
        List<Compte> liste = new ArrayList<>();
        liste.add(new Compte(1, 5000));
        liste.add(new Compte(2, 8000));
        return liste;
    }
}

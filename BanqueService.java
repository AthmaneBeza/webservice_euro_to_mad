package ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BanqueService {

    @WebMethod
    double conversionEuroToDH(double montant);

    @WebMethod
    Compte consulterCompte(int code);

    @WebMethod
    List<Compte> consulterListeComptes();
}

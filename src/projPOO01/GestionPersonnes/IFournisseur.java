package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Commande;

public interface IFournisseur {
	public boolean livre();
	public void commande(List<Commande> listcommande);
	public boolean isFournisseur();
}

package primogit;

import java.util.ArrayList;
import java.util.List;

public class Negozio {
	private String indirizzo;
	private long numeroTelefonico;
	private int numeroDipendenti;
	private String nomeDelDirigente;
	// Non centra nulla questa lista con il chiamante del
	// della sede amministrativa

	public Negozio() {
	}

	public Negozio(String indirizzo, long numeroTelefonico, int numeroDipendenti, String nomeDelDirigente) {
		super();
		this.indirizzo = indirizzo;
		this.numeroTelefonico = numeroTelefonico;
		this.numeroDipendenti = numeroDipendenti;
		this.nomeDelDirigente = nomeDelDirigente;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public long getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(long numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public int getNumeroDipendenti() {
		return numeroDipendenti;
	}

	public void setNumeroDipendenti(int numeroDipendenti) {
		this.numeroDipendenti = numeroDipendenti;
	}

	public String getNomeDelDirigente() {
		return nomeDelDirigente;
	}

	public void setNomeDelDirigente(String nomeDelDirigente) {
		this.nomeDelDirigente = nomeDelDirigente;
	}

}

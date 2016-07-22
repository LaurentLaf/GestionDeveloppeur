package com.developpez.beans;

import java.util.Date;

public class Developpeur {
	private int identifiant;
	private String pseudo;
	private String mail;
	private String codePostal;
	private Date dateInscription;
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(java.util.Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	
	@Override
	public String toString() {
		return "Developpeur [identifiant=" + identifiant + ", pseudo=" + pseudo + ", mail=" + mail + ", codePostal="
				+ codePostal + ", dateInscription=" + dateInscription + "]";
	}
	
	
	
}

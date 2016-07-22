package com.developpez.actions;
import java.util.ArrayList;
import java.util.Date;

import com.developpez.beans.Developpeur;
import com.opensymphony.xwork2.ActionSupport;

public class DeveloppeurAction extends ActionSupport {
	
	
	private static final long serialVersionUID = 1L;
	
	private int identifiant;
	private String pseudo;
	private String mail;
	private String codePostal;
	private Date dateInscription;

	public static ArrayList<Developpeur> listDeveloppeurs = new ArrayList<Developpeur>();
	public Developpeur developpeur;
	
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
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public Developpeur getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}

	public  ArrayList<Developpeur> getListDeveloppeurs() {
		return listDeveloppeurs;
	}
	public void setListDeveloppeurs(ArrayList<Developpeur> listDeveloppeurs) {
		DeveloppeurAction.listDeveloppeurs = listDeveloppeurs;
	}
	public String enregistrer() {
		System.out.println("dans la méthode enregistrer()......");
		
		developpeur = new Developpeur();
		
		developpeur.setIdentifiant(identifiant);
		developpeur.setPseudo(pseudo);
		developpeur.setMail(mail);
		developpeur.setCodePostal(codePostal);
		developpeur.setDateInscription(dateInscription);
		listDeveloppeurs.add(developpeur);
		
		if(developpeur.getPseudo().equals("")) {
			return "input";
		}
			return "success";
      }
	
	public String lister(){
		System.out.println("dans la méthode lister().....");
		//System.out.println(listDeveloppeurs);
		return "success";
	}
}

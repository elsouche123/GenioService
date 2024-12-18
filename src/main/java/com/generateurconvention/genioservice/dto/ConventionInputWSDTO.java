package com.generateurconvention.genioservice.dto;

import lombok.Data;

@Data
public class ConventionInputWSDTO {
    private String annee;
    private String nomPrenomStagiaire;
    private String enseignantReferent;
    private String tuteurDeStage;
    private String representantLegal;
    private String etudiant;
    private String nomOrganisme;
    private String adresseOrganisme;
    private String nomRepresentantOrganisme;
    private String qualiteRepresentantOrg;
    private String telOrganisme;
    private String emailOrganisme;
    private String lieuStage;
    private String nomDuService;
    private String nomEtudiant; // <-- ici
    private String prenomEtudiant;
    private String sexeEtudiant;
    private String dateNaissanceEtudiant;
    private String adresseEtudiant;
    private String telEtudiant;
    private String emailEtudiant;
    private String sujetDuStage;
    private String dateDebutStage;
    private String dateFinStage;
    private String dureeStage;
    private int totalJoursStage;
    private int totalHeuresStage;
    private String remunerationHoraire;
    private String tuteurIUT;
    private String tuteurIUTEmail;
    private String prenomEncadrant;
    private String nomEncadrant;
    private String fonctionEncadrant;
    private String telEncadrant;
    private String emailEncadrant;
    private String nomCPAM;
    private String niveauStage;

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getNomPrenomStagiaire() {
        return nomPrenomStagiaire;
    }

    public void setNomPrenomStagiaire(String nomPrenomStagiaire) {
        this.nomPrenomStagiaire = nomPrenomStagiaire;
    }

    public String getEnseignantReferent() {
        return enseignantReferent;
    }

    public void setEnseignantReferent(String enseignantReferent) {
        this.enseignantReferent = enseignantReferent;
    }

    public String getTuteurDeStage() {
        return tuteurDeStage;
    }

    public void setTuteurDeStage(String tuteurDeStage) {
        this.tuteurDeStage = tuteurDeStage;
    }

    public String getRepresentantLegal() {
        return representantLegal;
    }

    public void setRepresentantLegal(String representantLegal) {
        this.representantLegal = representantLegal;
    }

    public String getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(String etudiant) {
        this.etudiant = etudiant;
    }

    public String getNomOrganisme() {
        return nomOrganisme;
    }

    public void setNomOrganisme(String nomOrganisme) {
        this.nomOrganisme = nomOrganisme;
    }

    public String getAdresseOrganisme() {
        return adresseOrganisme;
    }

    public void setAdresseOrganisme(String adresseOrganisme) {
        this.adresseOrganisme = adresseOrganisme;
    }

    public String getNomRepresentantOrganisme() {
        return nomRepresentantOrganisme;
    }

    public void setNomRepresentantOrganisme(String nomRepresentantOrganisme) {
        this.nomRepresentantOrganisme = nomRepresentantOrganisme;
    }

    public String getQualiteRepresentantOrg() {
        return qualiteRepresentantOrg;
    }

    public void setQualiteRepresentantOrg(String qualiteRepresentantOrg) {
        this.qualiteRepresentantOrg = qualiteRepresentantOrg;
    }

    public String getTelOrganisme() {
        return telOrganisme;
    }

    public void setTelOrganisme(String telOrganisme) {
        this.telOrganisme = telOrganisme;
    }

    public String getEmailOrganisme() {
        return emailOrganisme;
    }

    public void setEmailOrganisme(String emailOrganisme) {
        this.emailOrganisme = emailOrganisme;
    }

    public String getLieuStage() {
        return lieuStage;
    }

    public void setLieuStage(String lieuStage) {
        this.lieuStage = lieuStage;
    }

    public String getNomDuService() {
        return nomDuService;
    }

    public void setNomDuService(String nomDuService) {
        this.nomDuService = nomDuService;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getSexeEtudiant() {
        return sexeEtudiant;
    }

    public void setSexeEtudiant(String sexeEtudiant) {
        this.sexeEtudiant = sexeEtudiant;
    }

    public String getDateNaissanceEtudiant() {
        return dateNaissanceEtudiant;
    }

    public void setDateNaissanceEtudiant(String dateNaissanceEtudiant) {
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
    }

    public String getAdresseEtudiant() {
        return adresseEtudiant;
    }

    public void setAdresseEtudiant(String adresseEtudiant) {
        this.adresseEtudiant = adresseEtudiant;
    }

    public String getTelEtudiant() {
        return telEtudiant;
    }

    public void setTelEtudiant(String telEtudiant) {
        this.telEtudiant = telEtudiant;
    }

    public String getEmailEtudiant() {
        return emailEtudiant;
    }

    public void setEmailEtudiant(String emailEtudiant) {
        this.emailEtudiant = emailEtudiant;
    }

    public String getSujetDuStage() {
        return sujetDuStage;
    }

    public void setSujetDuStage(String sujetDuStage) {
        this.sujetDuStage = sujetDuStage;
    }

    public String getDateDebutStage() {
        return dateDebutStage;
    }

    public void setDateDebutStage(String dateDebutStage) {
        this.dateDebutStage = dateDebutStage;
    }

    public String getDateFinStage() {
        return dateFinStage;
    }

    public void setDateFinStage(String dateFinStage) {
        this.dateFinStage = dateFinStage;
    }

    public String getDureeStage() {
        return dureeStage;
    }

    public void setDureeStage(String dureeStage) {
        this.dureeStage = dureeStage;
    }

    public int getTotalJoursStage() {
        return totalJoursStage;
    }

    public void setTotalJoursStage(int totalJoursStage) {
        this.totalJoursStage = totalJoursStage;
    }

    public int getTotalHeuresStage() {
        return totalHeuresStage;
    }

    public void setTotalHeuresStage(int totalHeuresStage) {
        this.totalHeuresStage = totalHeuresStage;
    }

    public String getRemunerationHoraire() {
        return remunerationHoraire;
    }

    public void setRemunerationHoraire(String remunerationHoraire) {
        this.remunerationHoraire = remunerationHoraire;
    }

    public String getTuteurIUT() {
        return tuteurIUT;
    }

    public void setTuteurIUT(String tuteurIUT) {
        this.tuteurIUT = tuteurIUT;
    }

    public String getTuteurIUTEmail() {
        return tuteurIUTEmail;
    }

    public void setTuteurIUTEmail(String tuteurIUTEmail) {
        this.tuteurIUTEmail = tuteurIUTEmail;
    }

    public String getPrenomEncadrant() {
        return prenomEncadrant;
    }

    public void setPrenomEncadrant(String prenomEncadrant) {
        this.prenomEncadrant = prenomEncadrant;
    }

    public String getNomEncadrant() {
        return nomEncadrant;
    }

    public void setNomEncadrant(String nomEncadrant) {
        this.nomEncadrant = nomEncadrant;
    }

    public String getFonctionEncadrant() {
        return fonctionEncadrant;
    }

    public void setFonctionEncadrant(String fonctionEncadrant) {
        this.fonctionEncadrant = fonctionEncadrant;
    }

    public String getTelEncadrant() {
        return telEncadrant;
    }

    public void setTelEncadrant(String telEncadrant) {
        this.telEncadrant = telEncadrant;
    }

    public String getEmailEncadrant() {
        return emailEncadrant;
    }

    public void setEmailEncadrant(String emailEncadrant) {
        this.emailEncadrant = emailEncadrant;
    }

    public String getNomCPAM() {
        return nomCPAM;
    }

    public void setNomCPAM(String nomCPAM) {
        this.nomCPAM = nomCPAM;
    }

    public String getNiveauStage() {
        return niveauStage;
    }

    public void setNiveauStage(String niveauStage) {
        this.niveauStage = niveauStage;
    }
}

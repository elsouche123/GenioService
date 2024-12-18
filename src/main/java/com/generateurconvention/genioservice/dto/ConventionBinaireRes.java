package com.generateurconvention.genioservice.dto;

public class ConventionBinaireRes {
    private byte[] fichier; // Le fichier binaire
    private String nomFichier;

    public byte[] getFichier() {
        return fichier;
    }

    public void setFichier(byte[] fichier) {
        this.fichier = fichier;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }
}

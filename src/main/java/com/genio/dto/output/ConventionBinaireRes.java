package com.genio.dto.output;

public class ConventionBinaireRes {
    private byte[] fichierBinaire;
    private String messageErreur;
    private boolean success;

    public ConventionBinaireRes(boolean success, byte[] fichierBinaire, String messageErreur) {
        this.success = success;
        this.fichierBinaire = fichierBinaire;
        this.messageErreur = messageErreur;
    }

    public byte[] getFichierBinaire() {
        return fichierBinaire;
    }

    public void setFichierBinaire(byte[] fichierBinaire) {
        this.fichierBinaire = fichierBinaire;
    }

    public String getMessageErreur() {
        return messageErreur;
    }

    public void setMessageErreur(String messageErreur) {
        this.messageErreur = messageErreur;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
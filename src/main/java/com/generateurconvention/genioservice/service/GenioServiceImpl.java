package com.generateurconvention.genioservice.service;

import com.generateurconvention.genioservice.dto.ConventionBinaireRes;
import com.generateurconvention.genioservice.dto.ConventionInputWSDTO;
import org.springframework.stereotype.Service;

@Service
public class GenioServiceImpl implements GenioService {

    @Override
    public ConventionBinaireRes genererConvention(ConventionInputWSDTO input) {
        // Simuler la création d'un fichier PDF/DOCX
        ConventionBinaireRes response = new ConventionBinaireRes();
        response.setNomFichier("Convention_" + input.getNomEtudiant() + ".pdf");
        response.setFichier("Contenu binaire simulé".getBytes()); // Simule un fichier binaire
        return response;
    }
}

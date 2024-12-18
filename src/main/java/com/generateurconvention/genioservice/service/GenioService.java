package com.generateurconvention.genioservice.service;

import com.generateurconvention.genioservice.dto.ConventionBinaireRes;
import com.generateurconvention.genioservice.dto.ConventionInputWSDTO;

public interface GenioService {
    ConventionBinaireRes genererConvention(ConventionInputWSDTO input);
}


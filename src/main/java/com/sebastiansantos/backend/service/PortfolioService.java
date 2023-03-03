package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Portfolio;
import com.sebastiansantos.backend.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService implements IPortfolioService{
    @Autowired
    public PortfolioRepository portfolioRepo;

    @Override
    public void altaPortfolio(Portfolio portfolio) {
        portfolioRepo.save(portfolio);
        
    }

    @Override
    public void modificarPortfolio(Portfolio portfolio) {
        portfolioRepo.save(portfolio);
    }

    @Override
    public Portfolio traerPortfolio(int id) {
        return portfolioRepo.getReferenceById(id);
    }
}

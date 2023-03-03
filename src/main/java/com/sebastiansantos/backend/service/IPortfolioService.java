
package com.sebastiansantos.backend.service;

import com.sebastiansantos.backend.model.Portfolio;


public interface IPortfolioService {
    public void altaPortfolio(Portfolio portfolio);
    public void modificarPortfolio(Portfolio portfolio);
    public Portfolio traerPortfolio(int id);    
}

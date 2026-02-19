package org.roehampton.dataaccess;

import org.roehampton.domain.PriceSeries;

import java.time.LocalDate;

public interface IAPIClient {

    PriceSeries getSharePrices(String symbol, LocalDate from, LocalDate to);
}



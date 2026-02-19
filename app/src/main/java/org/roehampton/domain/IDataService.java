package org.roehampton.domain;

import org.roehampton.dataaccess.PriceSeries;
import java.time.LocalDate;

public interface IDataService {
    <PriceSeries> PriceSeries getSharePrices(String symbol, LocalDate start, LocalDate end);
}

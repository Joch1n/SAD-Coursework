package org.roehampton.dataaccess;

import org.roehampton.domain.PriceSeries;

import java.nio.file.Path;
import java.time.LocalDate;

public class ShareDatabase implements IShareDatabase {

    private final Path dbPath = Path.of("data", "shareinfo.db");
    private final String jdbcUrl = "jdbc:sqlite:" + dbPath.toString();

    public ShareDatabase() {

        // initialise database here
    }

    @Override
    public DataFound dbCheck(String symbol, LocalDate from, LocalDate to) {

        return DataFound.NOT_FOUND; // for now so no errors

    }

    public void storeData(PriceSeries priceSeries) {

    }

    public PriceSeries getStoredData(String symbol, LocalDate to, LocalDate from) {

        throw new UnsupportedOperationException("getStoredData not implemented yet");
    }


}

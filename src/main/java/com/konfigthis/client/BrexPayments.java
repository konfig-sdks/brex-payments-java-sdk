package com.konfigthis.client;

import com.konfigthis.client.api.LinkedAccountsApi;
import com.konfigthis.client.api.TransfersApi;
import com.konfigthis.client.api.VendorsApi;

public class BrexPayments {
    private ApiClient apiClient;
    public final LinkedAccountsApi linkedAccounts;
    public final TransfersApi transfers;
    public final VendorsApi vendors;

    public BrexPayments() {
        this(null);
    }

    public BrexPayments(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.linkedAccounts = new LinkedAccountsApi(this.apiClient);
        this.transfers = new TransfersApi(this.apiClient);
        this.vendors = new VendorsApi(this.apiClient);
    }

}

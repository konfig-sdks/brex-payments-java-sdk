/*
 * Payments API
 *  The payments API allows you to initiate and manage payments and vendors from your Brex business accounts. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateVendorRequest;
import com.konfigthis.client.model.PageVendorResponse;
import com.konfigthis.client.model.PaymentAccountRequest;
import com.konfigthis.client.model.UpdateVendorRequest;
import com.konfigthis.client.model.VendorResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VendorsApi
 */
@Disabled
public class VendorsApiTest {

    private static VendorsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VendorsApi(apiClient);
    }

    /**
     *  Create vendor 
     *
     *  This endpoint creates a new vendor. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewVendorTest() throws ApiException {
        String companyName = null;
        String idempotencyKey = null;
        String email = null;
        String phone = null;
        List<PaymentAccountRequest> paymentAccounts = null;
        VendorResponse response = api.createNewVendor(companyName, idempotencyKey)
                .email(email)
                .phone(phone)
                .paymentAccounts(paymentAccounts)
                .execute();
        // TODO: test validations
    }

    /**
     *  Delete vendor. 
     *
     *  This endpoint deletes a vendor by ID. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVendorByIdTest() throws ApiException {
        String id = null;
        api.deleteVendorById(id)
                .execute();
        // TODO: test validations
    }

    /**
     *  Get vendor 
     *
     *  This endpoint gets a vendor by ID. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        VendorResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     *  Lists vendors  
     *
     *  This endpoint lists all existing vendors for an account. Takes an optional parameter to match by vendor name. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        String cursor = null;
        Integer limit = null;
        String name = null;
        PageVendorResponse response = api.list()
                .cursor(cursor)
                .limit(limit)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Update vendor
     *
     *      Updates an existing vendor by ID. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateByIdTest() throws ApiException {
        String id = null;
        String companyName = null;
        String email = null;
        String phone = null;
        List<PaymentAccountRequest> paymentAccounts = null;
        String beneficiaryName = null;
        String idempotencyKey = null;
        VendorResponse response = api.updateById(id)
                .companyName(companyName)
                .email(email)
                .phone(phone)
                .paymentAccounts(paymentAccounts)
                .beneficiaryName(beneficiaryName)
                .idempotencyKey(idempotencyKey)
                .execute();
        // TODO: test validations
    }

}
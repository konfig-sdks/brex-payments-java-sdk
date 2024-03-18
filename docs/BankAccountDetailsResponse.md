

# BankAccountDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the transfer. |  [optional] |
|**type** | **CounterPartyResponseType** |  |  |
|**routingNumber** | **String** | Routing number of a bank account (or SWIFT/BIC code for international transfer). For incoming cheques, this field might be null. |  [optional] |
|**accountNumber** | **String** | Account number of a bank account (or IBAN code for international transfer). For incoming cheques, this field might be null. |  [optional] |
|**beneficiaryBank** | [**BeneficiaryBank**](BeneficiaryBank.md) |  |  [optional] |
|**fedReferenceNumber** | **String** | Fed reference number for incoming wires |  [optional] |
|**externalMemo** | **String** | External Memo populated by the sender |  [optional] |




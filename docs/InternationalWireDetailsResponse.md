

# InternationalWireDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **PaymentDetailsTypeResponse** |  |  |
|**paymentInstrumentId** | **String** | Payment Instrument ID that can be passed to the /transfers endpoint to trigger a transfer. The type of the payment instrument dictates the method.  |  |
|**swiftCode** | **String** | Counterparty&#39;s &#x60;SWIFT&#x60; code |  |
|**iban** | **String** | Counterparty&#39;s international bank account number |  |
|**beneficiaryBankName** | **String** | Name of counterparty&#39;s bank |  [optional] |
|**address** | [**Address**](Address.md) |  |  |




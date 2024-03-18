

# VendorDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **CounterPartyType** |  |  |
|**paymentInstrumentId** | **String** | ID of the vendor&#39;s payment instrument: this will dictate the payment method and the counterparty of the transaction. The payment instrument ID is returned from the /vendors response and the type of the instrument will dictate the payment method. eg. Passing an instrument ID of type ACH will trigger an ACH payment to the associated vendor. Since a payment instrument can be updated while retaining the same payment_instrument_id,  please make sure to double check the details.  |  |




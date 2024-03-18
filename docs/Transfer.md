

# Transfer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the transfer |  [optional] |
|**id** | **String** | Unique ID associated with the transfer |  |
|**counterparty** | [**Object**](Object.md) |  |  [optional] |
|**paymentType** | **PaymentType** |  |  |
|**amount** | [**Money**](Money.md) |  |  |
|**processDate** | **LocalDate** | Transaction processing date |  [optional] |
|**originatingAccount** | **Object** |  |  |
|**status** | **TransferStatus** |  |  |
|**cancellationReason** | [**TransferCancellationReason**](TransferCancellationReason.md) |  |  [optional] |
|**estimatedDeliveryDate** | **LocalDate** | Estimated delivery date for transfer |  [optional] |
|**creatorUserId** | **String** | User ID of the transfer initiator |  [optional] |
|**createdAt** | **LocalDate** | Date of transfer creation |  [optional] |
|**displayName** | **String** | Human readable name for the transaction |  [optional] |
|**externalMemo** | **String** | External memo for the transfer. &#x60;Payment Instructions&#x60; for Wires and the &#x60;Entry Description&#x60; for ACH payments.  Must be at most 90 characters for &#x60;ACH&#x60; and &#x60;WIRE&#x60; transactions and at most 40 characters for &#x60;CHEQUES&#x60;  |  [optional] |






# CreateTransferRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the transfer for internal use. Not exposed externally. |  |
|**counterparty** | **Object** |  |  |
|**amount** | [**Money**](Money.md) |  |  |
|**externalMemo** | **String** | External memo for the transfer. &#x60;Payment Instructions&#x60; for Wires and the &#x60;Entry Description&#x60; for ACH payments.  Must be at most 90 characters for &#x60;ACH&#x60; and &#x60;WIRE&#x60; transactions and at most 40 characters for &#x60;CHEQUES&#x60;  |  |
|**originatingAccount** | [**Object**](Object.md) |  |  |
|**approvalType** | [**ApprovalType**](ApprovalType.md) |  |  [optional] |




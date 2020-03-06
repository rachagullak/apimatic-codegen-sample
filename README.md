# Getting started

Set of API's that allow clients to onboard with Yapstone.

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

## How to Use

The following section explains how to use the YapstoneStagedOnBoardingServices library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *YapstoneStagedOnBoardingServicesLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

Clicking the ``` Add ``` button will open a dialog where you need to specify YapstoneStagedOnBoardingServices in ``` Group Id ``` and YapstoneStagedOnBoardingServicesLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Yapstone%20Staged%20On-Boarding%20Services-Java&workspaceName=YapstoneStagedOnBoardingServices&projectName=YapstoneStagedOnBoardingServicesLib&rootNamespace=com.yapstone.apiuat)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *YapstoneStagedOnBoardingServicesLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| authorization | TODO: add a description |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String authorization = "authorization";

YapstoneStagedOnBoardingServicesClient client = new YapstoneStagedOnBoardingServicesClient(authorization);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [IndividualApplicantsController](#individual_applicants_controller)
* [BusinessApplicantsController](#business_applicants_controller)
* [MerchantsController](#merchants_controller)
* [AssetsController](#assets_controller)
* [PayoutInstrumentsController](#payout_instruments_controller)
* [InstrumentsController](#instruments_controller)
* [MarketplaceProductsController](#marketplace_products_controller)
* [PayoutProductsController](#payout_products_controller)
* [ContractsController](#contracts_controller)
* [MarketplacesController](#marketplaces_controller)
* [PayoutsController](#payouts_controller)
* [CustomersController](#customers_controller)
* [CustomersAdminController](#customers_admin_controller)
* [HistoryController](#history_controller)
* [AdminController](#admin_controller)
* [OfferingsController](#offerings_controller)
* [SearchController](#search_controller)

## <a name="individual_applicants_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.IndividualApplicantsController") IndividualApplicantsController

### Get singleton instance

The singleton instance of the ``` IndividualApplicantsController ``` class can be accessed from the API Client.

```java
IndividualApplicantsController individualApplicants = client.getIndividualApplicants();
```

### <a name="get_individual_applicants_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.IndividualApplicantsController.getIndividualApplicantsAsync") getIndividualApplicantsAsync

> Get all Individual Applicant Resources the actor has access to in the system.


```java
void getIndividualApplicantsAsync(
        final String externalId,
        final Integer page,
        final Integer size,
        final APICallBack<IndividualApplicantsResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| externalId |  ``` Required ```  | The identifier used by an external client. |
| page |  ``` Optional ```  | page number |
| size |  ``` Optional ```  | Maximum number of records to return per page |


#### Example Usage

```java
String externalId = "externalId";
Integer page = 234;
Integer size = 234;
// Invoking the API call with sample inputs
individualApplicants.getIndividualApplicantsAsync(externalId, page, size, new APICallBack<IndividualApplicantsResource>() {
    public void onSuccess(HttpContext context, IndividualApplicantsResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="create_individual_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.IndividualApplicantsController.createIndividualApplicantAsync") createIndividualApplicantAsync

> Creates an Applicant Resource in the system.


```java
void createIndividualApplicantAsync(
        final IndividualApplicantRequest body,
        final String xYapstoneFpsid,
        final APICallBack<IndividualApplicantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The Applicant Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    IndividualApplicantRequest body = new IndividualApplicantRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    individualApplicants.createIndividualApplicantAsync(body, xYapstoneFpsid, new APICallBack<IndividualApplicantResource>() {
        public void onSuccess(HttpContext context, IndividualApplicantResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.IndividualApplicantsController.deleteDeactivateApplicantAsync") deleteDeactivateApplicantAsync

> Deactivates the Individual Applicant Resource in the system.


```java
void deleteDeactivateApplicantAsync(
        final String applicantId,
        final APICallBack<DeactivateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Individual Applicant Resource. |


#### Example Usage

```java
String applicantId = "applicantId";
// Invoking the API call with sample inputs
individualApplicants.deleteDeactivateApplicantAsync(applicantId, new APICallBack<DeactivateResponse>() {
    public void onSuccess(HttpContext context, DeactivateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="update_individual_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.IndividualApplicantsController.updateIndividualApplicantAsync") updateIndividualApplicantAsync

> Updates the Individual Applicant Resource.


```java
void updateIndividualApplicantAsync(
        final String applicantId,
        final IndividualApplicantUpdateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<IndividualApplicantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Individual Applicant Resource. |
| body |  ``` Required ```  | The Applicant Request Resource to be updated. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String applicantId = "applicantId";
    IndividualApplicantUpdateRequest body = new IndividualApplicantUpdateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    individualApplicants.updateIndividualApplicantAsync(applicantId, body, xYapstoneFpsid, new APICallBack<IndividualApplicantResource>() {
        public void onSuccess(HttpContext context, IndividualApplicantResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_individual_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.IndividualApplicantsController.getIndividualApplicantAsync") getIndividualApplicantAsync

> Retrieves an Individual Applicant Resource from the system for the given applicantId.


```java
void getIndividualApplicantAsync(
        final String applicantId,
        final APICallBack<IndividualApplicantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Individual Applicant Resource. |


#### Example Usage

```java
String applicantId = "applicantId";
// Invoking the API call with sample inputs
individualApplicants.getIndividualApplicantAsync(applicantId, new APICallBack<IndividualApplicantResource>() {
    public void onSuccess(HttpContext context, IndividualApplicantResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="business_applicants_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.BusinessApplicantsController") BusinessApplicantsController

### Get singleton instance

The singleton instance of the ``` BusinessApplicantsController ``` class can be accessed from the API Client.

```java
BusinessApplicantsController businessApplicants = client.getBusinessApplicants();
```

### <a name="get_business_applicants_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.BusinessApplicantsController.getBusinessApplicantsAsync") getBusinessApplicantsAsync

> Get all Business Applicant Resources the actor has access to in the system.


```java
void getBusinessApplicantsAsync(
        final String externalId,
        final Integer page,
        final Integer size,
        final APICallBack<BusinessApplicantsResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| externalId |  ``` Required ```  | The identifier used by an external client. |
| page |  ``` Optional ```  | page number |
| size |  ``` Optional ```  | Maximum number of records to return per page |


#### Example Usage

```java
String externalId = "externalId";
Integer page = 234;
Integer size = 234;
// Invoking the API call with sample inputs
businessApplicants.getBusinessApplicantsAsync(externalId, page, size, new APICallBack<BusinessApplicantsResource>() {
    public void onSuccess(HttpContext context, BusinessApplicantsResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="create_business_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.BusinessApplicantsController.createBusinessApplicantAsync") createBusinessApplicantAsync

> Creates a Business Applicant Resource in the system.


```java
void createBusinessApplicantAsync(
        final BusinessApplicantRequest body,
        final String xYapstoneFpsid,
        final APICallBack<BusinessApplicantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The Business Applicant Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    BusinessApplicantRequest body = new BusinessApplicantRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    businessApplicants.createBusinessApplicantAsync(body, xYapstoneFpsid, new APICallBack<BusinessApplicantResource>() {
        public void onSuccess(HttpContext context, BusinessApplicantResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_business_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.BusinessApplicantsController.getBusinessApplicantAsync") getBusinessApplicantAsync

> Retrieves an Business Applicant Resource from the system for the given applicantId.


```java
void getBusinessApplicantAsync(
        final String applicantId,
        final APICallBack<BusinessApplicantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Business Applicant Resource. |


#### Example Usage

```java
String applicantId = "applicantId";
// Invoking the API call with sample inputs
businessApplicants.getBusinessApplicantAsync(applicantId, new APICallBack<BusinessApplicantResource>() {
    public void onSuccess(HttpContext context, BusinessApplicantResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="update_business_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.BusinessApplicantsController.updateBusinessApplicantAsync") updateBusinessApplicantAsync

> Updates the Business Applicant Resource.


```java
void updateBusinessApplicantAsync(
        final String applicantId,
        final BusinessApplicantUpdateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<BusinessApplicantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the BusinessApplicant Resource. |
| body |  ``` Required ```  | The Business Applicant Resource to be created after updation. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String applicantId = "applicantId";
    BusinessApplicantUpdateRequest body = new BusinessApplicantUpdateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    businessApplicants.updateBusinessApplicantAsync(applicantId, body, xYapstoneFpsid, new APICallBack<BusinessApplicantResource>() {
        public void onSuccess(HttpContext context, BusinessApplicantResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_business_applicant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.BusinessApplicantsController.deleteDeactivateBusinessApplicantAsync") deleteDeactivateBusinessApplicantAsync

> Deactivates the Business Applicant Resource in the system.


```java
void deleteDeactivateBusinessApplicantAsync(
        final String applicantId,
        final APICallBack<DeactivateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Applicant Resource. |


#### Example Usage

```java
String applicantId = "applicantId";
// Invoking the API call with sample inputs
businessApplicants.deleteDeactivateBusinessApplicantAsync(applicantId, new APICallBack<DeactivateResponse>() {
    public void onSuccess(HttpContext context, DeactivateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="merchants_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.MerchantsController") MerchantsController

### Get singleton instance

The singleton instance of the ``` MerchantsController ``` class can be accessed from the API Client.

```java
MerchantsController merchants = client.getMerchants();
```

### <a name="get_merchant_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MerchantsController.getMerchantAsync") getMerchantAsync

> Retrieves an merchant type with its metadata from the system for the given merchantId.


```java
void getMerchantAsync(
        final String merchantId,
        final APICallBack<MerchantResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| merchantId |  ``` Required ```  | The unique id of the merchant. |


#### Example Usage

```java
String merchantId = "merchantId";
// Invoking the API call with sample inputs
merchants.getMerchantAsync(merchantId, new APICallBack<MerchantResource>() {
    public void onSuccess(HttpContext context, MerchantResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="assets_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.AssetsController") AssetsController

### Get singleton instance

The singleton instance of the ``` AssetsController ``` class can be accessed from the API Client.

```java
AssetsController assets = client.getAssets();
```

### <a name="get_assets_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AssetsController.getAssetsAsync") getAssetsAsync

> Get Asset Resources the actor has access to in the system.


```java
void getAssetsAsync(
        final Integer page,
        final Integer size,
        final String externalId,
        final APICallBack<AssetsResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | page number |
| size |  ``` Optional ```  | Maximum number of records to return per page |
| externalId |  ``` Optional ```  | The identifier used by an external client. |


#### Example Usage

```java
Integer page = 234;
Integer size = 234;
String externalId = "externalId";
// Invoking the API call with sample inputs
assets.getAssetsAsync(page, size, externalId, new APICallBack<AssetsResource>() {
    public void onSuccess(HttpContext context, AssetsResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="create_asset_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AssetsController.createAssetAsync") createAssetAsync

> Creates an Asset Resource in the system.


```java
void createAssetAsync(
        final AssetRequest body,
        final String xYapstoneFpsid,
        final APICallBack<AssetResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The Asset Request Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    AssetRequest body = new AssetRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    assets.createAssetAsync(body, xYapstoneFpsid, new APICallBack<AssetResource>() {
        public void onSuccess(HttpContext context, AssetResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_asset_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AssetsController.getAssetAsync") getAssetAsync

> Retrieves an Asset Resource from the system for the given assetId.


```java
void getAssetAsync(
        final String assetId,
        final APICallBack<AssetResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| assetId |  ``` Required ```  | The unique id of the Asset Resource. |


#### Example Usage

```java
String assetId = "assetId";
// Invoking the API call with sample inputs
assets.getAssetAsync(assetId, new APICallBack<AssetResource>() {
    public void onSuccess(HttpContext context, AssetResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="update_asset_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AssetsController.updateAssetAsync") updateAssetAsync

> Updates the Asset Resource.


```java
void updateAssetAsync(
        final String assetId,
        final AssetUpdateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<AssetResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| assetId |  ``` Required ```  | The unique id of the Asset Resource. |
| body |  ``` Required ```  | The Asset Request Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String assetId = "assetId";
    AssetUpdateRequest body = new AssetUpdateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    assets.updateAssetAsync(assetId, body, xYapstoneFpsid, new APICallBack<AssetResource>() {
        public void onSuccess(HttpContext context, AssetResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_asset_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AssetsController.deleteDeactivateAssetAsync") deleteDeactivateAssetAsync

> Deactivates the Asset Resource in the system.


```java
void deleteDeactivateAssetAsync(
        final String assetId,
        final APICallBack<DeactivateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| assetId |  ``` Required ```  | The unique id of the Asset Resource. |


#### Example Usage

```java
String assetId = "assetId";
// Invoking the API call with sample inputs
assets.deleteDeactivateAssetAsync(assetId, new APICallBack<DeactivateResponse>() {
    public void onSuccess(HttpContext context, DeactivateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="payout_instruments_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.PayoutInstrumentsController") PayoutInstrumentsController

### Get singleton instance

The singleton instance of the ``` PayoutInstrumentsController ``` class can be accessed from the API Client.

```java
PayoutInstrumentsController payoutInstruments = client.getPayoutInstruments();
```

### <a name="get_payout_instruments_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutInstrumentsController.getPayoutInstrumentsAsync") getPayoutInstrumentsAsync

> Get all Payout Instrument Resources the actor has access to in the system.


```java
void getPayoutInstrumentsAsync(
        final Integer page,
        final Integer size,
        final APICallBack<PayoutInstrumentsResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | page number |
| size |  ``` Optional ```  | Maximum number of records to return per page |


#### Example Usage

```java
Integer page = 71;
Integer size = 71;
// Invoking the API call with sample inputs
payoutInstruments.getPayoutInstrumentsAsync(page, size, new APICallBack<PayoutInstrumentsResource>() {
    public void onSuccess(HttpContext context, PayoutInstrumentsResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="create_payout_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutInstrumentsController.createPayoutInstrumentAsync") createPayoutInstrumentAsync

> Creates an Payout Instrument Resource in the system.


```java
void createPayoutInstrumentAsync(
        final PayoutInstrumentRequest body,
        final String xYapstoneFpsid,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The Payout Instrument Request Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    PayoutInstrumentRequest body = new PayoutInstrumentRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    payoutInstruments.createPayoutInstrumentAsync(body, xYapstoneFpsid, new APICallBack<PayoutInstrumentResource>() {
        public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_payout_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutInstrumentsController.getPayoutInstrumentAsync") getPayoutInstrumentAsync

> Retrieves an Payout Instrument Resource from the system for the given payoutInstrumentId.


```java
void getPayoutInstrumentAsync(
        final String payoutInstrumentId,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| payoutInstrumentId |  ``` Required ```  | The unique id of the  Payout Instrument Resource. |


#### Example Usage

```java
String payoutInstrumentId = "payoutInstrumentId";
// Invoking the API call with sample inputs
payoutInstruments.getPayoutInstrumentAsync(payoutInstrumentId, new APICallBack<PayoutInstrumentResource>() {
    public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="update_payout_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutInstrumentsController.updatePayoutInstrumentAsync") updatePayoutInstrumentAsync

> Updates the PayoutInstrument Resource.


```java
void updatePayoutInstrumentAsync(
        final String payoutInstrumentId,
        final PayoutInstrumentUpdateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| payoutInstrumentId |  ``` Required ```  | The unique id of the  Payout Instrument Resource. |
| body |  ``` Required ```  | The PayoutInstrument Request Resource to be updated. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String payoutInstrumentId = "payoutInstrumentId";
    PayoutInstrumentUpdateRequest body = new PayoutInstrumentUpdateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    payoutInstruments.updatePayoutInstrumentAsync(payoutInstrumentId, body, xYapstoneFpsid, new APICallBack<PayoutInstrumentResource>() {
        public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_payout_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutInstrumentsController.deleteDeactivatePayoutInstrumentAsync") deleteDeactivatePayoutInstrumentAsync

> Deactivates the Payout Instrument Resource in the system.


```java
void deleteDeactivatePayoutInstrumentAsync(
        final String payoutInstrumentId,
        final APICallBack<DeactivateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| payoutInstrumentId |  ``` Required ```  | The unique id of the  Payout Instrument Resource. |


#### Example Usage

```java
String payoutInstrumentId = "payoutInstrumentId";
// Invoking the API call with sample inputs
payoutInstruments.deleteDeactivatePayoutInstrumentAsync(payoutInstrumentId, new APICallBack<DeactivateResponse>() {
    public void onSuccess(HttpContext context, DeactivateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="instruments_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.InstrumentsController") InstrumentsController

### Get singleton instance

The singleton instance of the ``` InstrumentsController ``` class can be accessed from the API Client.

```java
InstrumentsController instruments = client.getInstruments();
```

### <a name="get_instruments_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.InstrumentsController.getInstrumentsAsync") getInstrumentsAsync

> Get all Payout Instrument Resources the actor has access to in the system.


```java
void getInstrumentsAsync(
        final Integer page,
        final Integer size,
        final APICallBack<PayoutInstrumentsResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | page number |
| size |  ``` Optional ```  | Maximum number of records to return per page |


#### Example Usage

```java
Integer page = 71;
Integer size = 71;
// Invoking the API call with sample inputs
instruments.getInstrumentsAsync(page, size, new APICallBack<PayoutInstrumentsResource>() {
    public void onSuccess(HttpContext context, PayoutInstrumentsResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="create_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.InstrumentsController.createInstrumentAsync") createInstrumentAsync

> Creates an Payout Instrument Resource in the system.


```java
void createInstrumentAsync(
        final PayoutInstrumentRequest body,
        final String xYapstoneFpsid,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The Payout Instrument Request Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    PayoutInstrumentRequest body = new PayoutInstrumentRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    instruments.createInstrumentAsync(body, xYapstoneFpsid, new APICallBack<PayoutInstrumentResource>() {
        public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.InstrumentsController.getInstrumentAsync") getInstrumentAsync

> Retrieves an Payout Instrument Resource from the system for the given payoutInstrumentId.


```java
void getInstrumentAsync(
        final String instrumentId,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| instrumentId |  ``` Required ```  | The unique id of the Instrument Resource. |


#### Example Usage

```java
String instrumentId = "instrumentId";
// Invoking the API call with sample inputs
instruments.getInstrumentAsync(instrumentId, new APICallBack<PayoutInstrumentResource>() {
    public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="update_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.InstrumentsController.updateInstrumentAsync") updateInstrumentAsync

> Updates the PayoutInstrument Resource.


```java
void updateInstrumentAsync(
        final String instrumentId,
        final PayoutInstrumentUpdateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| instrumentId |  ``` Required ```  | The unique id of the Instrument Resource. |
| body |  ``` Required ```  | The PayoutInstrument Request Resource to be updated. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String instrumentId = "instrumentId";
    PayoutInstrumentUpdateRequest body = new PayoutInstrumentUpdateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    instruments.updateInstrumentAsync(instrumentId, body, xYapstoneFpsid, new APICallBack<PayoutInstrumentResource>() {
        public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_instrument_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.InstrumentsController.deleteDeactivateInstrumentAsync") deleteDeactivateInstrumentAsync

> Deactivates the Payout Instrument Resource in the system.


```java
void deleteDeactivateInstrumentAsync(
        final String instrumentId,
        final APICallBack<DeactivateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| instrumentId |  ``` Required ```  | The unique id of the Instrument Resource. |


#### Example Usage

```java
String instrumentId = "instrumentId";
// Invoking the API call with sample inputs
instruments.deleteDeactivateInstrumentAsync(instrumentId, new APICallBack<DeactivateResponse>() {
    public void onSuccess(HttpContext context, DeactivateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_instrument_using_managed_by_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.InstrumentsController.getInstrumentUsingManagedByAsync") getInstrumentUsingManagedByAsync

> Retrieves Instrument Resources from the system for the given managedBy.


```java
void getInstrumentUsingManagedByAsync(
        final String managedBy,
        final APICallBack<PayoutInstrumentsResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| managedBy |  ``` Required ```  | The id of the  ManagedBy for getting Payout Instrument Resource. |


#### Example Usage

```java
String managedBy = "managedBy";
// Invoking the API call with sample inputs
instruments.getInstrumentUsingManagedByAsync(managedBy, new APICallBack<PayoutInstrumentsResource>() {
    public void onSuccess(HttpContext context, PayoutInstrumentsResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="marketplace_products_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.MarketplaceProductsController") MarketplaceProductsController

### Get singleton instance

The singleton instance of the ``` MarketplaceProductsController ``` class can be accessed from the API Client.

```java
MarketplaceProductsController marketplaceProducts = client.getMarketplaceProducts();
```

### <a name="get_marketplace_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MarketplaceProductsController.getMarketplaceProductAsync") getMarketplaceProductAsync

> Retrieves a MarketPlace Product


```java
void getMarketplaceProductAsync(
        final String productId,
        final APICallBack<MarketplaceProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productId |  ``` Required ```  | The unique id of Product Resource. |


#### Example Usage

```java
String productId = "productId";
// Invoking the API call with sample inputs
marketplaceProducts.getMarketplaceProductAsync(productId, new APICallBack<MarketplaceProductResource>() {
    public void onSuccess(HttpContext context, MarketplaceProductResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="update_marketplace_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MarketplaceProductsController.updateMarketplaceProductAsync") updateMarketplaceProductAsync

> Update selctive MarketPlace Product details


```java
void updateMarketplaceProductAsync(
        final String productId,
        final MarketplaceProductResource body,
        final String xYapstoneFpsid,
        final APICallBack<MarketplaceProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productId |  ``` Required ```  | The unique id of Product Resource. |
| body |  ``` Required ```  | The Marketplace product resource object with fields to be updated. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String productId = "productId";
    MarketplaceProductResource body = new MarketplaceProductResource();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    marketplaceProducts.updateMarketplaceProductAsync(productId, body, xYapstoneFpsid, new APICallBack<MarketplaceProductResource>() {
        public void onSuccess(HttpContext context, MarketplaceProductResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="payout_products_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.PayoutProductsController") PayoutProductsController

### Get singleton instance

The singleton instance of the ``` PayoutProductsController ``` class can be accessed from the API Client.

```java
PayoutProductsController payoutProducts = client.getPayoutProducts();
```

### <a name="get_payout_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutProductsController.getPayoutProductAsync") getPayoutProductAsync

> Retrieves a Payout Product


```java
void getPayoutProductAsync(
        final String productId,
        final APICallBack<PayoutProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productId |  ``` Required ```  | The unique id of Product Resource. |


#### Example Usage

```java
String productId = "productId";
// Invoking the API call with sample inputs
payoutProducts.getPayoutProductAsync(productId, new APICallBack<PayoutProductResource>() {
    public void onSuccess(HttpContext context, PayoutProductResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="contracts_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.ContractsController") ContractsController

### Get singleton instance

The singleton instance of the ``` ContractsController ``` class can be accessed from the API Client.

```java
ContractsController contracts = client.getContracts();
```

### <a name="create_contract_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.ContractsController.createContractAsync") createContractAsync

> Creates an Contract Resource in the system.


```java
void createContractAsync(
        final ContractCreateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<ContractResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The Contract Request Resource to be created. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    ContractCreateRequest body = new ContractCreateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    contracts.createContractAsync(body, xYapstoneFpsid, new APICallBack<ContractResource>() {
        public void onSuccess(HttpContext context, ContractResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_all_contracts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.ContractsController.getAllContractsAsync") getAllContractsAsync

> Retrieves all of the Contracts


```java
void getAllContractsAsync(
        final String applicantId,
        final String assetId,
        final String payoutInstrumentId,
        final Product1Enum product,
        final Integer offset,
        final Integer limit,
        final APICallBack<ContractResourceDTO> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Optional ```  | applicantId |
| assetId |  ``` Optional ```  | assetId |
| payoutInstrumentId |  ``` Optional ```  | payoutInstrumentId |
| product |  ``` Optional ```  | filter by provided product |
| offset |  ``` Optional ```  ``` DefaultValue ```  | offset |
| limit |  ``` Optional ```  ``` DefaultValue ```  | limit |


#### Example Usage

```java
String applicantId = "applicantId";
String assetId = "assetId";
String payoutInstrumentId = "payoutInstrumentId";
Product1Enum product = Product1Enum.fromString("MARKETPLACE");
Integer offset = 0;
Integer limit = 1000;
// Invoking the API call with sample inputs
contracts.getAllContractsAsync(applicantId, assetId, payoutInstrumentId, product, offset, limit, new APICallBack<ContractResourceDTO>() {
    public void onSuccess(HttpContext context, ContractResourceDTO response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable |
| 500 | internal service error |



### <a name="get_contract_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.ContractsController.getContractAsync") getContractAsync

> Retrieves an Contract Resource from the system for the given contractId.


```java
void getContractAsync(
        final String contractId,
        final APICallBack<ContractResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |


#### Example Usage

```java
String contractId = "contractId";
// Invoking the API call with sample inputs
contracts.getContractAsync(contractId, new APICallBack<ContractResource>() {
    public void onSuccess(HttpContext context, ContractResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="update_contract_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.ContractsController.updateContractAsync") updateContractAsync

> Updates the Contract Resource.


```java
void updateContractAsync(
        final String contractId,
        final ContractUpdateRequest body,
        final String xYapstoneFpsid,
        final APICallBack<ContractResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| body |  ``` Required ```  | The Contract Resource to be created after updation. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contractId = "contractId";
    ContractUpdateRequest body = new ContractUpdateRequest();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    contracts.updateContractAsync(contractId, body, xYapstoneFpsid, new APICallBack<ContractResource>() {
        public void onSuccess(HttpContext context, ContractResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="marketplaces_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.MarketplacesController") MarketplacesController

### Get singleton instance

The singleton instance of the ``` MarketplacesController ``` class can be accessed from the API Client.

```java
MarketplacesController marketplaces = client.getMarketplaces();
```

### <a name="add_marketplace_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MarketplacesController.addMarketplaceProductAsync") addMarketplaceProductAsync

> Add a new market place in a given contract.


```java
void addMarketplaceProductAsync(
        final String contractId,
        final MarketplaceProductAdd body,
        final String xYapstoneFpsid,
        final APICallBack<MarketplaceProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| body |  ``` Required ```  | The market place details |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contractId = "contractId";
    MarketplaceProductAdd body = new MarketplaceProductAdd();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    marketplaces.addMarketplaceProductAsync(contractId, body, xYapstoneFpsid, new APICallBack<MarketplaceProductResource>() {
        public void onSuccess(HttpContext context, MarketplaceProductResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="get_marketplace_product_by_asset_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MarketplacesController.getMarketplaceProductByAssetIdAsync") getMarketplaceProductByAssetIdAsync

> Retrieves an Marketplace Resource from the system for the given contractId and assetId.


```java
void getMarketplaceProductByAssetIdAsync(
        final String contractId,
        final String assetId,
        final APICallBack<MarketplaceProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| assetId |  ``` Required ```  | The unique id of the Asset Resource. |


#### Example Usage

```java
String contractId = "contractId";
String assetId = "assetId";
// Invoking the API call with sample inputs
marketplaces.getMarketplaceProductByAssetIdAsync(contractId, assetId, new APICallBack<MarketplaceProductResource>() {
    public void onSuccess(HttpContext context, MarketplaceProductResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="update_marketplace_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MarketplacesController.updateMarketplaceAsync") updateMarketplaceAsync

> Updates the Marketplace Resource in a given Contract Resource.


```java
void updateMarketplaceAsync(
        final String contractId,
        final String assetId,
        final MarketplaceProductUpdate body,
        final String xYapstoneFpsid,
        final APICallBack<MarketplaceProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| assetId |  ``` Required ```  | The unique id of the Asset Resource. |
| body |  ``` Required ```  | The Market Resource to be updated. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contractId = "contractId";
    String assetId = "assetId";
    MarketplaceProductUpdate body = new MarketplaceProductUpdate();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    marketplaces.updateMarketplaceAsync(contractId, assetId, body, xYapstoneFpsid, new APICallBack<MarketplaceProductResource>() {
        public void onSuccess(HttpContext context, MarketplaceProductResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_marketplace_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.MarketplacesController.deleteDeactivateMarketplaceProductAsync") deleteDeactivateMarketplaceProductAsync

> deactivate the Marketplace Product Resource.


```java
void deleteDeactivateMarketplaceProductAsync(
        final String contractId,
        final String assetId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| assetId |  ``` Required ```  | The unique id of the Asset Resource. |


#### Example Usage

```java
String contractId = "contractId";
String assetId = "assetId";
// Invoking the API call with sample inputs
marketplaces.deleteDeactivateMarketplaceProductAsync(contractId, assetId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="payouts_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.PayoutsController") PayoutsController

### Get singleton instance

The singleton instance of the ``` PayoutsController ``` class can be accessed from the API Client.

```java
PayoutsController payouts = client.getPayouts();
```

### <a name="add_payout_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutsController.addPayoutProductAsync") addPayoutProductAsync

> Add a payout product in a given contract.


```java
void addPayoutProductAsync(
        final String contractId,
        final PayoutProductAdd body,
        final String xYapstoneFpsid,
        final APICallBack<PayoutProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| body |  ``` Required ```  | The payout instruments list |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contractId = "contractId";
    PayoutProductAdd body = new PayoutProductAdd();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    payouts.addPayoutProductAsync(contractId, body, xYapstoneFpsid, new APICallBack<PayoutProductResource>() {
        public void onSuccess(HttpContext context, PayoutProductResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="get_payout_product_by_instrument_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutsController.getPayoutProductByInstrumentIdAsync") getPayoutProductByInstrumentIdAsync

> Retrieves an Payout Resource from the system for the given contractId and payoutInstrumentId.


```java
void getPayoutProductByInstrumentIdAsync(
        final String contractId,
        final String payoutInstrumentId,
        final APICallBack<PayoutProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| payoutInstrumentId |  ``` Required ```  | The unique id of the  Payout Instrument Resource. |


#### Example Usage

```java
String contractId = "contractId";
String payoutInstrumentId = "payoutInstrumentId";
// Invoking the API call with sample inputs
payouts.getPayoutProductByInstrumentIdAsync(contractId, payoutInstrumentId, new APICallBack<PayoutProductResource>() {
    public void onSuccess(HttpContext context, PayoutProductResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



### <a name="update_payout_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutsController.updatePayoutProductAsync") updatePayoutProductAsync

> Updates the Payout product in the Contract Resource.


```java
void updatePayoutProductAsync(
        final String contractId,
        final String payoutInstrumentId,
        final PayoutProductResource body,
        final String xYapstoneFpsid,
        final APICallBack<PayoutProductResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| payoutInstrumentId |  ``` Required ```  | The unique id of the  Payout Instrument Resource. |
| body |  ``` Required ```  | The Payout Resource to be updated. |
| xYapstoneFpsid |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contractId = "contractId";
    String payoutInstrumentId = "payoutInstrumentId";
    PayoutProductResource body = new PayoutProductResource();
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    payouts.updatePayoutProductAsync(contractId, payoutInstrumentId, body, xYapstoneFpsid, new APICallBack<PayoutProductResource>() {
        public void onSuccess(HttpContext context, PayoutProductResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="delete_deactivate_payout_product_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.PayoutsController.deleteDeactivatePayoutProductAsync") deleteDeactivatePayoutProductAsync

> deactivate the Payout Product Resource.


```java
void deleteDeactivatePayoutProductAsync(
        final String contractId,
        final String payoutInstrumentId,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contractId |  ``` Required ```  | The unique id of the Contract Resource. |
| payoutInstrumentId |  ``` Required ```  | The unique id of the  Payout Instrument Resource. |


#### Example Usage

```java
String contractId = "contractId";
String payoutInstrumentId = "payoutInstrumentId";
// Invoking the API call with sample inputs
payouts.deleteDeactivatePayoutProductAsync(contractId, payoutInstrumentId, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="customers_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.CustomersController") CustomersController

### Get singleton instance

The singleton instance of the ``` CustomersController ``` class can be accessed from the API Client.

```java
CustomersController customers = client.getCustomers();
```

### <a name="create_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.CustomersController.createCustomerAsync") createCustomerAsync

> Creates an Customer Resource in the system.


```java
void createCustomerAsync(
        final CustomerResource body,
        final String xYapstoneIpaddress,
        final String xYapstoneFpsid,
        final APICallBack<CustomerResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |
| xYapstoneIpaddress |  ``` Optional ```  | IP address |
| xYapstoneFpsid |  ``` Optional ```  | Device Finger print id. |


#### Example Usage

```java
try {
    CustomerResource body = new CustomerResource();
    String xYapstoneIpaddress = "x-yapstone-ipaddress";
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    customers.createCustomerAsync(body, xYapstoneIpaddress, xYapstoneFpsid, new APICallBack<CustomerResource>() {
        public void onSuccess(HttpContext context, CustomerResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Conflict |
| 422 | Unprocessable Entity |
| 0 | Unexpected Error |



### <a name="get_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.CustomersController.getCustomerAsync") getCustomerAsync

> Fetch a customer.


```java
void getCustomerAsync(
        final String customerId,
        final APICallBack<CustomerResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customerId";
// Invoking the API call with sample inputs
customers.getCustomerAsync(customerId, new APICallBack<CustomerResource>() {
    public void onSuccess(HttpContext context, CustomerResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 0 | Unexpected Error |



### <a name="update_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.CustomersController.updateCustomerAsync") updateCustomerAsync

> Modify a Customer.


```java
void updateCustomerAsync(
        final String customerId,
        final CustomerResource body,
        final String xYapstoneIpaddress,
        final String xYapstoneFpsid,
        final APICallBack<CustomerResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |
| xYapstoneIpaddress |  ``` Optional ```  | IP address |
| xYapstoneFpsid |  ``` Optional ```  | Device Finger print id. |


#### Example Usage

```java
try {
    String customerId = "customerId";
    CustomerResource body = new CustomerResource();
    String xYapstoneIpaddress = "x-yapstone-ipaddress";
    String xYapstoneFpsid = "x-yapstone-fpsid";
    // Invoking the API call with sample inputs
    customers.updateCustomerAsync(customerId, body, xYapstoneIpaddress, xYapstoneFpsid, new APICallBack<CustomerResource>() {
        public void onSuccess(HttpContext context, CustomerResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 409 | Conflict |
| 422 | Unprocessable Entity |
| 0 | Unexpected Error |



### <a name="delete_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.CustomersController.deleteCustomerAsync") deleteCustomerAsync

> Delete a customer.


```java
void deleteCustomerAsync(
        final String customerId,
        final APICallBack<CustomerDeactivateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customerId";
// Invoking the API call with sample inputs
customers.deleteCustomerAsync(customerId, new APICallBack<CustomerDeactivateResponse>() {
    public void onSuccess(HttpContext context, CustomerDeactivateResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_customer_marketplace_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.CustomersController.getCustomerMarketplaceAsync") getCustomerMarketplaceAsync

> Fetch a customer with maketPlace.


```java
void getCustomerMarketplaceAsync(
        final String customerId,
        final APICallBack<CustomerMarketplaceResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customerId";
// Invoking the API call with sample inputs
customers.getCustomerMarketplaceAsync(customerId, new APICallBack<CustomerMarketplaceResource>() {
    public void onSuccess(HttpContext context, CustomerMarketplaceResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="customers_admin_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.CustomersAdminController") CustomersAdminController

### Get singleton instance

The singleton instance of the ``` CustomersAdminController ``` class can be accessed from the API Client.

```java
CustomersAdminController customersAdmin = client.getCustomersAdmin();
```

### <a name="get_customer_for_internal_use_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.CustomersAdminController.getCustomerForInternalUseAsync") getCustomerForInternalUseAsync

> Fetch a customer.


```java
void getCustomerForInternalUseAsync(
        final String customerId,
        final APICallBack<CustomerAdminResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customerId";
// Invoking the API call with sample inputs
customersAdmin.getCustomerForInternalUseAsync(customerId, new APICallBack<CustomerAdminResource>() {
    public void onSuccess(HttpContext context, CustomerAdminResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="history_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.HistoryController") HistoryController

### Get singleton instance

The singleton instance of the ``` HistoryController ``` class can be accessed from the API Client.

```java
HistoryController history = client.getHistory();
```

### <a name="get_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.HistoryController.getHistoryAsync") getHistoryAsync

> Retrieves a History Resource from the system for the given entityId.


```java
void getHistoryAsync(
        final String entityId,
        final APICallBack<EntityHistoryResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| entityId |  ``` Required ```  | The unique id of the History Resource. |


#### Example Usage

```java
String entityId = "entityId";
// Invoking the API call with sample inputs
history.getHistoryAsync(entityId, new APICallBack<EntityHistoryResource>() {
    public void onSuccess(HttpContext context, EntityHistoryResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="admin_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.AdminController") AdminController

### Get singleton instance

The singleton instance of the ``` AdminController ``` class can be accessed from the API Client.

```java
AdminController admin = client.getAdmin();
```

### <a name="update_individual_applicant_admin_fields_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AdminController.updateIndividualApplicantAdminFieldsAsync") updateIndividualApplicantAdminFieldsAsync

> Updates admin specific fields for the given individual applicant id.


```java
void updateIndividualApplicantAdminFieldsAsync(
        final String applicantId,
        final IndividualApplicantAdminFieldsResource body,
        final APICallBack<IndividualApplicantAdminResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Individual Aplicant. |
| body |  ``` Required ```  | The internal fields to be updated by admin. |


#### Example Usage

```java
try {
    String applicantId = "applicantId";
    IndividualApplicantAdminFieldsResource body = new IndividualApplicantAdminFieldsResource();
    // Invoking the API call with sample inputs
    admin.updateIndividualApplicantAdminFieldsAsync(applicantId, body, new APICallBack<IndividualApplicantAdminResource>() {
        public void onSuccess(HttpContext context, IndividualApplicantAdminResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_individual_applicant_admin_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AdminController.getIndividualApplicantAdminAsync") getIndividualApplicantAdminAsync

> Retrieves admin specific fields for the given individual applicant id.


```java
void getIndividualApplicantAdminAsync(
        final String applicantId,
        final APICallBack<IndividualApplicantAdminResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Individual Aplicant. |


#### Example Usage

```java
String applicantId = "applicantId";
// Invoking the API call with sample inputs
admin.getIndividualApplicantAdminAsync(applicantId, new APICallBack<IndividualApplicantAdminResource>() {
    public void onSuccess(HttpContext context, IndividualApplicantAdminResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="update_business_applicant_admin_fields_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AdminController.updateBusinessApplicantAdminFieldsAsync") updateBusinessApplicantAdminFieldsAsync

> Updates admin specific fields for the given business applicant id.


```java
void updateBusinessApplicantAdminFieldsAsync(
        final String applicantId,
        final BusinessApplicantAdminFieldsResource body,
        final APICallBack<BusinessApplicantAdminResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Contract Resource. |
| body |  ``` Required ```  | The internal fields to be updated by admin. |


#### Example Usage

```java
try {
    String applicantId = "applicantId";
    BusinessApplicantAdminFieldsResource body = new BusinessApplicantAdminFieldsResource();
    // Invoking the API call with sample inputs
    admin.updateBusinessApplicantAdminFieldsAsync(applicantId, body, new APICallBack<BusinessApplicantAdminResource>() {
        public void onSuccess(HttpContext context, BusinessApplicantAdminResource response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_business_applicant_admin_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AdminController.getBusinessApplicantAdminAsync") getBusinessApplicantAdminAsync

> Retrieves admin specific fields for the given individual applicant id.


```java
void getBusinessApplicantAdminAsync(
        final String applicantId,
        final APICallBack<BusinessApplicantAdminResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| applicantId |  ``` Required ```  | The unique id of the Individual Aplicant. |


#### Example Usage

```java
String applicantId = "applicantId";
// Invoking the API call with sample inputs
admin.getBusinessApplicantAdminAsync(applicantId, new APICallBack<BusinessApplicantAdminResource>() {
    public void onSuccess(HttpContext context, BusinessApplicantAdminResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



### <a name="get_instrument_by_admin_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.AdminController.getInstrumentByAdminAsync") getInstrumentByAdminAsync

> Retrieves an Payout Instrument Resource from the system for the given instrumentId.


```java
void getInstrumentByAdminAsync(
        final String instrumentId,
        final APICallBack<PayoutInstrumentResource> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| instrumentId |  ``` Required ```  | The unique id of the Instrument Resource. |


#### Example Usage

```java
String instrumentId = "instrumentId";
// Invoking the API call with sample inputs
admin.getInstrumentByAdminAsync(instrumentId, new APICallBack<PayoutInstrumentResource>() {
    public void onSuccess(HttpContext context, PayoutInstrumentResource response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="offerings_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.OfferingsController") OfferingsController

### Get singleton instance

The singleton instance of the ``` OfferingsController ``` class can be accessed from the API Client.

```java
OfferingsController offerings = client.getOfferings();
```

### <a name="create_offerings_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.OfferingsController.createOfferingsAsync") createOfferingsAsync

> Create new offerings for a given asset.


```java
void createOfferingsAsync(
        final OfferingRequest body,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    OfferingRequest body = new OfferingRequest();
    // Invoking the API call with sample inputs
    offerings.createOfferingsAsync(body, new APICallBack<OfferingResponse>() {
        public void onSuccess(HttpContext context, OfferingResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 409 | Conflict |
| 422 | Unprocessable Entity |
| 0 | Unexpected Error |



### <a name="patch_offering_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.OfferingsController.patchOfferingAsync") patchOfferingAsync

> Modify an offering.


```java
void patchOfferingAsync(
        final OfferingRequest body,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    OfferingRequest body = new OfferingRequest();
    // Invoking the API call with sample inputs
    offerings.patchOfferingAsync(body, new APICallBack<OfferingResponse>() {
        public void onSuccess(HttpContext context, OfferingResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 409 | Conflict |
| 422 | Unprocessable Entity |
| 0 | Unexpected Error |



### <a name="update_offering_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.OfferingsController.updateOfferingAsync") updateOfferingAsync

> Put an offering.


```java
void updateOfferingAsync(
        final OfferingRequest body,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    OfferingRequest body = new OfferingRequest();
    // Invoking the API call with sample inputs
    offerings.updateOfferingAsync(body, new APICallBack<OfferingResponse>() {
        public void onSuccess(HttpContext context, OfferingResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 409 | Conflict |
| 422 | Unprocessable Entity |
| 0 | Unexpected Error |



### <a name="get_offering_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.OfferingsController.getOfferingByIdAsync") getOfferingByIdAsync

> Fetch an Offering using ID.


```java
void getOfferingByIdAsync(
        final String offeringId,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offeringId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String offeringId = "offeringId";
// Invoking the API call with sample inputs
offerings.getOfferingByIdAsync(offeringId, new APICallBack<OfferingResponse>() {
    public void onSuccess(HttpContext context, OfferingResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 0 | Unexpected Error |



### <a name="delete_offering_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.OfferingsController.deleteOfferingAsync") deleteOfferingAsync

> Delete an Offering.


```java
void deleteOfferingAsync(
        final String offeringId,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offeringId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String offeringId = "offeringId";
// Invoking the API call with sample inputs
offerings.deleteOfferingAsync(offeringId, new APICallBack<OfferingResponse>() {
    public void onSuccess(HttpContext context, OfferingResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | unauthorized |
| 404 | not found |
| 422 | unprocessable entity |
| 500 | internal service error |



[Back to List of Controllers](#list_of_controllers)

## <a name="search_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.yapstone.apiuat.controllers.SearchController") SearchController

### Get singleton instance

The singleton instance of the ``` SearchController ``` class can be accessed from the API Client.

```java
SearchController search = client.getSearch();
```

### <a name="get_offerings_by_asset_listing_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.SearchController.getOfferingsByAssetListingAsync") getOfferingsByAssetListingAsync

> Get all the offerings for a given assetListing


```java
void getOfferingsByAssetListingAsync(
        final String assetListingId,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| assetListingId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String assetListingId = "assetListingId";
// Invoking the API call with sample inputs
search.getOfferingsByAssetListingAsync(assetListingId, new APICallBack<OfferingResponse>() {
    public void onSuccess(HttpContext context, OfferingResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 0 | Unexpected Error |



### <a name="get_offering_by_entity_id_async"></a>![Method: ](https://apidocs.io/img/method.png "com.yapstone.apiuat.controllers.SearchController.getOfferingByEntityIdAsync") getOfferingByEntityIdAsync

> Fetch an Offering using ID.


```java
void getOfferingByEntityIdAsync(
        final String entityId,
        final APICallBack<OfferingResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| entityId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String entityId = "entityId";
// Invoking the API call with sample inputs
search.getOfferingByEntityIdAsync(entityId, new APICallBack<OfferingResponse>() {
    public void onSuccess(HttpContext context, OfferingResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 404 | Not Found |
| 0 | Unexpected Error |



[Back to List of Controllers](#list_of_controllers)




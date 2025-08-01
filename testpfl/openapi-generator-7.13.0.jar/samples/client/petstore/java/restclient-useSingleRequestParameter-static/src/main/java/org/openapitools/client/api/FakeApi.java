package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.ChildWithNullable;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0-SNAPSHOT")
public class FakeApi {
    private ApiClient apiClient;

    public FakeApi() {
        this(new ApiClient());
    }

    @Autowired
    public FakeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * for Java apache and Java native, test toUrlQueryString for maps with BegDecimal keys
     * <p><b>200</b> - successful operation
     * @return FakeBigDecimalMap200Response
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeBigDecimalMapRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<FakeBigDecimalMap200Response> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/BigDecimalMap", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * for Java apache and Java native, test toUrlQueryString for maps with BegDecimal keys
     * <p><b>200</b> - successful operation
     * @return FakeBigDecimalMap200Response
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public FakeBigDecimalMap200Response fakeBigDecimalMap() throws RestClientResponseException {
        ParameterizedTypeReference<FakeBigDecimalMap200Response> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeBigDecimalMapRequestCreation().body(localVarReturnType);
    }

    /**
     * 
     * for Java apache and Java native, test toUrlQueryString for maps with BegDecimal keys
     * <p><b>200</b> - successful operation
     * @return ResponseEntity&lt;FakeBigDecimalMap200Response&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FakeBigDecimalMap200Response> fakeBigDecimalMapWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<FakeBigDecimalMap200Response> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeBigDecimalMapRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * 
     * for Java apache and Java native, test toUrlQueryString for maps with BegDecimal keys
     * <p><b>200</b> - successful operation
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeBigDecimalMapWithResponseSpec() throws RestClientResponseException {
        return fakeBigDecimalMapRequestCreation();
    }
    /**
     * Health check endpoint
     * 
     * <p><b>200</b> - The instance started successfully
     * @return HealthCheckResult
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeHealthGetRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<HealthCheckResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/health", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Health check endpoint
     * 
     * <p><b>200</b> - The instance started successfully
     * @return HealthCheckResult
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public HealthCheckResult fakeHealthGet() throws RestClientResponseException {
        ParameterizedTypeReference<HealthCheckResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeHealthGetRequestCreation().body(localVarReturnType);
    }

    /**
     * Health check endpoint
     * 
     * <p><b>200</b> - The instance started successfully
     * @return ResponseEntity&lt;HealthCheckResult&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<HealthCheckResult> fakeHealthGetWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<HealthCheckResult> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeHealthGetRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Health check endpoint
     * 
     * <p><b>200</b> - The instance started successfully
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeHealthGetWithResponseSpec() throws RestClientResponseException {
        return fakeHealthGetRequestCreation();
    }

    public static class FakeHttpSignatureTestRequest {
        private @jakarta.annotation.Nonnull Pet pet;
        private @jakarta.annotation.Nullable String query1;
        private @jakarta.annotation.Nullable String header1;

        public FakeHttpSignatureTestRequest() {}

        public FakeHttpSignatureTestRequest(@jakarta.annotation.Nonnull Pet pet, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1) {
            this.pet = pet;
            this.query1 = query1;
            this.header1 = header1;
        }

        public @jakarta.annotation.Nonnull Pet pet() {
            return this.pet;
        }
        public FakeHttpSignatureTestRequest pet(@jakarta.annotation.Nonnull Pet pet) {
            this.pet = pet;
            return this;
        }

        public @jakarta.annotation.Nullable String query1() {
            return this.query1;
        }
        public FakeHttpSignatureTestRequest query1(@jakarta.annotation.Nullable String query1) {
            this.query1 = query1;
            return this;
        }

        public @jakarta.annotation.Nullable String header1() {
            return this.header1;
        }
        public FakeHttpSignatureTestRequest header1(@jakarta.annotation.Nullable String header1) {
            this.header1 = header1;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            FakeHttpSignatureTestRequest request = (FakeHttpSignatureTestRequest) o;
            return Objects.equals(this.pet, request.pet()) &&
                Objects.equals(this.query1, request.query1()) &&
                Objects.equals(this.header1, request.header1());
        }

        @Override
        public int hashCode() {
            return Objects.hash(pet, query1, header1);
        }
    }

    /**
    * test http signature authentication
    * 
     * <p><b>200</b> - The instance started successfully
     * @param requestParameters The fakeHttpSignatureTest request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void fakeHttpSignatureTest(FakeHttpSignatureTestRequest requestParameters) throws RestClientResponseException {
      this.fakeHttpSignatureTest(requestParameters.pet(), requestParameters.query1(), requestParameters.header1());
    }

  /**
  * test http signature authentication
  * 
     * <p><b>200</b> - The instance started successfully
     * @param requestParameters The fakeHttpSignatureTest request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> fakeHttpSignatureTestWithHttpInfo(FakeHttpSignatureTestRequest requestParameters) throws RestClientResponseException {
      return this.fakeHttpSignatureTestWithHttpInfo(requestParameters.pet(), requestParameters.query1(), requestParameters.header1());
    }

  /**
  * test http signature authentication
  * 
     * <p><b>200</b> - The instance started successfully
     * @param requestParameters The fakeHttpSignatureTest request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec fakeHttpSignatureTestWithResponseSpec(FakeHttpSignatureTestRequest requestParameters) throws RestClientResponseException {
      return this.fakeHttpSignatureTestWithResponseSpec(requestParameters.pet(), requestParameters.query1(), requestParameters.header1());
    }

    /**
     * test http signature authentication
     * 
     * <p><b>200</b> - The instance started successfully
     * @param pet Pet object that needs to be added to the store
     * @param query1 query parameter
     * @param header1 header parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeHttpSignatureTestRequestCreation(@jakarta.annotation.Nonnull Pet pet, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1) throws RestClientResponseException {
        Object postBody = pet;
        // verify the required parameter 'pet' is set
        if (pet == null) {
            throw new RestClientResponseException("Missing the required parameter 'pet' when calling fakeHttpSignatureTest", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query_1", query1));
        

        if (header1 != null)
        headerParams.add("header_1", apiClient.parameterToString(header1));
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "http_signature_test" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/http-signature-test", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test http signature authentication
     * 
     * <p><b>200</b> - The instance started successfully
     * @param pet Pet object that needs to be added to the store
     * @param query1 query parameter
     * @param header1 header parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void fakeHttpSignatureTest(@jakarta.annotation.Nonnull Pet pet, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        fakeHttpSignatureTestRequestCreation(pet, query1, header1).body(localVarReturnType);
    }

    /**
     * test http signature authentication
     * 
     * <p><b>200</b> - The instance started successfully
     * @param pet Pet object that needs to be added to the store
     * @param query1 query parameter
     * @param header1 header parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> fakeHttpSignatureTestWithHttpInfo(@jakarta.annotation.Nonnull Pet pet, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeHttpSignatureTestRequestCreation(pet, query1, header1).toEntity(localVarReturnType);
    }

    /**
     * test http signature authentication
     * 
     * <p><b>200</b> - The instance started successfully
     * @param pet Pet object that needs to be added to the store
     * @param query1 query parameter
     * @param header1 header parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeHttpSignatureTestWithResponseSpec(@jakarta.annotation.Nonnull Pet pet, @jakarta.annotation.Nullable String query1, @jakarta.annotation.Nullable String header1) throws RestClientResponseException {
        return fakeHttpSignatureTestRequestCreation(pet, query1, header1);
    }
    /**
     * 
     * Test serialization of outer boolean types
     * <p><b>200</b> - Output boolean
     * @param body Input boolean as post body
     * @return Boolean
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeOuterBooleanSerializeRequestCreation(@jakarta.annotation.Nullable Boolean body) throws RestClientResponseException {
        Object postBody = body;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/outer/boolean", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer boolean types
     * <p><b>200</b> - Output boolean
     * @param body Input boolean as post body
     * @return Boolean
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Boolean fakeOuterBooleanSerialize(@jakarta.annotation.Nullable Boolean body) throws RestClientResponseException {
        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterBooleanSerializeRequestCreation(body).body(localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer boolean types
     * <p><b>200</b> - Output boolean
     * @param body Input boolean as post body
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> fakeOuterBooleanSerializeWithHttpInfo(@jakarta.annotation.Nullable Boolean body) throws RestClientResponseException {
        ParameterizedTypeReference<Boolean> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterBooleanSerializeRequestCreation(body).toEntity(localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer boolean types
     * <p><b>200</b> - Output boolean
     * @param body Input boolean as post body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeOuterBooleanSerializeWithResponseSpec(@jakarta.annotation.Nullable Boolean body) throws RestClientResponseException {
        return fakeOuterBooleanSerializeRequestCreation(body);
    }
    /**
     * 
     * Test serialization of object with outer number type
     * <p><b>200</b> - Output composite
     * @param outerComposite Input composite as post body
     * @return OuterComposite
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeOuterCompositeSerializeRequestCreation(@jakarta.annotation.Nullable OuterComposite outerComposite) throws RestClientResponseException {
        Object postBody = outerComposite;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OuterComposite> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/outer/composite", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Test serialization of object with outer number type
     * <p><b>200</b> - Output composite
     * @param outerComposite Input composite as post body
     * @return OuterComposite
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public OuterComposite fakeOuterCompositeSerialize(@jakarta.annotation.Nullable OuterComposite outerComposite) throws RestClientResponseException {
        ParameterizedTypeReference<OuterComposite> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterCompositeSerializeRequestCreation(outerComposite).body(localVarReturnType);
    }

    /**
     * 
     * Test serialization of object with outer number type
     * <p><b>200</b> - Output composite
     * @param outerComposite Input composite as post body
     * @return ResponseEntity&lt;OuterComposite&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OuterComposite> fakeOuterCompositeSerializeWithHttpInfo(@jakarta.annotation.Nullable OuterComposite outerComposite) throws RestClientResponseException {
        ParameterizedTypeReference<OuterComposite> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterCompositeSerializeRequestCreation(outerComposite).toEntity(localVarReturnType);
    }

    /**
     * 
     * Test serialization of object with outer number type
     * <p><b>200</b> - Output composite
     * @param outerComposite Input composite as post body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeOuterCompositeSerializeWithResponseSpec(@jakarta.annotation.Nullable OuterComposite outerComposite) throws RestClientResponseException {
        return fakeOuterCompositeSerializeRequestCreation(outerComposite);
    }
    /**
     * 
     * Test serialization of outer number types
     * <p><b>200</b> - Output number
     * @param body Input number as post body
     * @return BigDecimal
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeOuterNumberSerializeRequestCreation(@jakarta.annotation.Nullable BigDecimal body) throws RestClientResponseException {
        Object postBody = body;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BigDecimal> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/outer/number", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer number types
     * <p><b>200</b> - Output number
     * @param body Input number as post body
     * @return BigDecimal
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public BigDecimal fakeOuterNumberSerialize(@jakarta.annotation.Nullable BigDecimal body) throws RestClientResponseException {
        ParameterizedTypeReference<BigDecimal> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterNumberSerializeRequestCreation(body).body(localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer number types
     * <p><b>200</b> - Output number
     * @param body Input number as post body
     * @return ResponseEntity&lt;BigDecimal&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BigDecimal> fakeOuterNumberSerializeWithHttpInfo(@jakarta.annotation.Nullable BigDecimal body) throws RestClientResponseException {
        ParameterizedTypeReference<BigDecimal> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterNumberSerializeRequestCreation(body).toEntity(localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer number types
     * <p><b>200</b> - Output number
     * @param body Input number as post body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeOuterNumberSerializeWithResponseSpec(@jakarta.annotation.Nullable BigDecimal body) throws RestClientResponseException {
        return fakeOuterNumberSerializeRequestCreation(body);
    }
    /**
     * 
     * Test serialization of outer string types
     * <p><b>200</b> - Output string
     * @param body Input string as post body
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakeOuterStringSerializeRequestCreation(@jakarta.annotation.Nullable String body) throws RestClientResponseException {
        Object postBody = body;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/outer/string", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer string types
     * <p><b>200</b> - Output string
     * @param body Input string as post body
     * @return String
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public String fakeOuterStringSerialize(@jakarta.annotation.Nullable String body) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterStringSerializeRequestCreation(body).body(localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer string types
     * <p><b>200</b> - Output string
     * @param body Input string as post body
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> fakeOuterStringSerializeWithHttpInfo(@jakarta.annotation.Nullable String body) throws RestClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakeOuterStringSerializeRequestCreation(body).toEntity(localVarReturnType);
    }

    /**
     * 
     * Test serialization of outer string types
     * <p><b>200</b> - Output string
     * @param body Input string as post body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakeOuterStringSerializeWithResponseSpec(@jakarta.annotation.Nullable String body) throws RestClientResponseException {
        return fakeOuterStringSerializeRequestCreation(body);
    }
    /**
     * 
     * Test serialization of enum (int) properties with examples
     * <p><b>200</b> - Output enum (int)
     * @param outerObjectWithEnumProperty Input enum (int) as post body
     * @return OuterObjectWithEnumProperty
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec fakePropertyEnumIntegerSerializeRequestCreation(@jakarta.annotation.Nonnull OuterObjectWithEnumProperty outerObjectWithEnumProperty) throws RestClientResponseException {
        Object postBody = outerObjectWithEnumProperty;
        // verify the required parameter 'outerObjectWithEnumProperty' is set
        if (outerObjectWithEnumProperty == null) {
            throw new RestClientResponseException("Missing the required parameter 'outerObjectWithEnumProperty' when calling fakePropertyEnumIntegerSerialize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OuterObjectWithEnumProperty> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/property/enum-int", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Test serialization of enum (int) properties with examples
     * <p><b>200</b> - Output enum (int)
     * @param outerObjectWithEnumProperty Input enum (int) as post body
     * @return OuterObjectWithEnumProperty
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public OuterObjectWithEnumProperty fakePropertyEnumIntegerSerialize(@jakarta.annotation.Nonnull OuterObjectWithEnumProperty outerObjectWithEnumProperty) throws RestClientResponseException {
        ParameterizedTypeReference<OuterObjectWithEnumProperty> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakePropertyEnumIntegerSerializeRequestCreation(outerObjectWithEnumProperty).body(localVarReturnType);
    }

    /**
     * 
     * Test serialization of enum (int) properties with examples
     * <p><b>200</b> - Output enum (int)
     * @param outerObjectWithEnumProperty Input enum (int) as post body
     * @return ResponseEntity&lt;OuterObjectWithEnumProperty&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OuterObjectWithEnumProperty> fakePropertyEnumIntegerSerializeWithHttpInfo(@jakarta.annotation.Nonnull OuterObjectWithEnumProperty outerObjectWithEnumProperty) throws RestClientResponseException {
        ParameterizedTypeReference<OuterObjectWithEnumProperty> localVarReturnType = new ParameterizedTypeReference<>() {};
        return fakePropertyEnumIntegerSerializeRequestCreation(outerObjectWithEnumProperty).toEntity(localVarReturnType);
    }

    /**
     * 
     * Test serialization of enum (int) properties with examples
     * <p><b>200</b> - Output enum (int)
     * @param outerObjectWithEnumProperty Input enum (int) as post body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec fakePropertyEnumIntegerSerializeWithResponseSpec(@jakarta.annotation.Nonnull OuterObjectWithEnumProperty outerObjectWithEnumProperty) throws RestClientResponseException {
        return fakePropertyEnumIntegerSerializeRequestCreation(outerObjectWithEnumProperty);
    }
    /**
     * test referenced additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testAdditionalPropertiesReferenceRequestCreation(@jakarta.annotation.Nonnull Map<String, Object> requestBody) throws RestClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new RestClientResponseException("Missing the required parameter 'requestBody' when calling testAdditionalPropertiesReference", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/additionalProperties-reference", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test referenced additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testAdditionalPropertiesReference(@jakarta.annotation.Nonnull Map<String, Object> requestBody) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testAdditionalPropertiesReferenceRequestCreation(requestBody).body(localVarReturnType);
    }

    /**
     * test referenced additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testAdditionalPropertiesReferenceWithHttpInfo(@jakarta.annotation.Nonnull Map<String, Object> requestBody) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testAdditionalPropertiesReferenceRequestCreation(requestBody).toEntity(localVarReturnType);
    }

    /**
     * test referenced additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testAdditionalPropertiesReferenceWithResponseSpec(@jakarta.annotation.Nonnull Map<String, Object> requestBody) throws RestClientResponseException {
        return testAdditionalPropertiesReferenceRequestCreation(requestBody);
    }
    /**
     * 
     * For this test, the body has to be a binary file.
     * <p><b>200</b> - Success
     * @param body image to upload
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testBodyWithBinaryRequestCreation(@jakarta.annotation.Nullable File body) throws RestClientResponseException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new RestClientResponseException("Missing the required parameter 'body' when calling testBodyWithBinary", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "image/png"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/body-with-binary", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * For this test, the body has to be a binary file.
     * <p><b>200</b> - Success
     * @param body image to upload
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testBodyWithBinary(@jakarta.annotation.Nullable File body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testBodyWithBinaryRequestCreation(body).body(localVarReturnType);
    }

    /**
     * 
     * For this test, the body has to be a binary file.
     * <p><b>200</b> - Success
     * @param body image to upload
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testBodyWithBinaryWithHttpInfo(@jakarta.annotation.Nullable File body) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testBodyWithBinaryRequestCreation(body).toEntity(localVarReturnType);
    }

    /**
     * 
     * For this test, the body has to be a binary file.
     * <p><b>200</b> - Success
     * @param body image to upload
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testBodyWithBinaryWithResponseSpec(@jakarta.annotation.Nullable File body) throws RestClientResponseException {
        return testBodyWithBinaryRequestCreation(body);
    }
    /**
     * 
     * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
     * <p><b>200</b> - Success
     * @param fileSchemaTestClass The fileSchemaTestClass parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testBodyWithFileSchemaRequestCreation(@jakarta.annotation.Nonnull FileSchemaTestClass fileSchemaTestClass) throws RestClientResponseException {
        Object postBody = fileSchemaTestClass;
        // verify the required parameter 'fileSchemaTestClass' is set
        if (fileSchemaTestClass == null) {
            throw new RestClientResponseException("Missing the required parameter 'fileSchemaTestClass' when calling testBodyWithFileSchema", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/body-with-file-schema", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
     * <p><b>200</b> - Success
     * @param fileSchemaTestClass The fileSchemaTestClass parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testBodyWithFileSchema(@jakarta.annotation.Nonnull FileSchemaTestClass fileSchemaTestClass) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testBodyWithFileSchemaRequestCreation(fileSchemaTestClass).body(localVarReturnType);
    }

    /**
     * 
     * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
     * <p><b>200</b> - Success
     * @param fileSchemaTestClass The fileSchemaTestClass parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testBodyWithFileSchemaWithHttpInfo(@jakarta.annotation.Nonnull FileSchemaTestClass fileSchemaTestClass) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testBodyWithFileSchemaRequestCreation(fileSchemaTestClass).toEntity(localVarReturnType);
    }

    /**
     * 
     * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
     * <p><b>200</b> - Success
     * @param fileSchemaTestClass The fileSchemaTestClass parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testBodyWithFileSchemaWithResponseSpec(@jakarta.annotation.Nonnull FileSchemaTestClass fileSchemaTestClass) throws RestClientResponseException {
        return testBodyWithFileSchemaRequestCreation(fileSchemaTestClass);
    }

    public static class TestBodyWithQueryParamsRequest {
        private @jakarta.annotation.Nonnull String query;
        private @jakarta.annotation.Nonnull User user;

        public TestBodyWithQueryParamsRequest() {}

        public TestBodyWithQueryParamsRequest(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull User user) {
            this.query = query;
            this.user = user;
        }

        public @jakarta.annotation.Nonnull String query() {
            return this.query;
        }
        public TestBodyWithQueryParamsRequest query(@jakarta.annotation.Nonnull String query) {
            this.query = query;
            return this;
        }

        public @jakarta.annotation.Nonnull User user() {
            return this.user;
        }
        public TestBodyWithQueryParamsRequest user(@jakarta.annotation.Nonnull User user) {
            this.user = user;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestBodyWithQueryParamsRequest request = (TestBodyWithQueryParamsRequest) o;
            return Objects.equals(this.query, request.query()) &&
                Objects.equals(this.user, request.user());
        }

        @Override
        public int hashCode() {
            return Objects.hash(query, user);
        }
    }

    /**
    * 
    * 
     * <p><b>200</b> - Success
     * @param requestParameters The testBodyWithQueryParams request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void testBodyWithQueryParams(TestBodyWithQueryParamsRequest requestParameters) throws RestClientResponseException {
      this.testBodyWithQueryParams(requestParameters.query(), requestParameters.user());
    }

  /**
  * 
  * 
     * <p><b>200</b> - Success
     * @param requestParameters The testBodyWithQueryParams request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> testBodyWithQueryParamsWithHttpInfo(TestBodyWithQueryParamsRequest requestParameters) throws RestClientResponseException {
      return this.testBodyWithQueryParamsWithHttpInfo(requestParameters.query(), requestParameters.user());
    }

  /**
  * 
  * 
     * <p><b>200</b> - Success
     * @param requestParameters The testBodyWithQueryParams request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec testBodyWithQueryParamsWithResponseSpec(TestBodyWithQueryParamsRequest requestParameters) throws RestClientResponseException {
      return this.testBodyWithQueryParamsWithResponseSpec(requestParameters.query(), requestParameters.user());
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query The query parameter
     * @param user The user parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testBodyWithQueryParamsRequestCreation(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull User user) throws RestClientResponseException {
        Object postBody = user;
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new RestClientResponseException("Missing the required parameter 'query' when calling testBodyWithQueryParams", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new RestClientResponseException("Missing the required parameter 'user' when calling testBodyWithQueryParams", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "query", query));
        
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/body-with-query-params", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query The query parameter
     * @param user The user parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testBodyWithQueryParams(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull User user) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testBodyWithQueryParamsRequestCreation(query, user).body(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query The query parameter
     * @param user The user parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testBodyWithQueryParamsWithHttpInfo(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull User user) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testBodyWithQueryParamsRequestCreation(query, user).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>200</b> - Success
     * @param query The query parameter
     * @param user The user parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testBodyWithQueryParamsWithResponseSpec(@jakarta.annotation.Nonnull String query, @jakarta.annotation.Nonnull User user) throws RestClientResponseException {
        return testBodyWithQueryParamsRequestCreation(query, user);
    }
    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * <p><b>200</b> - successful operation
     * @param client client model
     * @return Client
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testClientModelRequestCreation(@jakarta.annotation.Nonnull Client client) throws RestClientResponseException {
        Object postBody = client;
        // verify the required parameter 'client' is set
        if (client == null) {
            throw new RestClientResponseException("Missing the required parameter 'client' when calling testClientModel", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * <p><b>200</b> - successful operation
     * @param client client model
     * @return Client
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Client testClientModel(@jakarta.annotation.Nonnull Client client) throws RestClientResponseException {
        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testClientModelRequestCreation(client).body(localVarReturnType);
    }

    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * <p><b>200</b> - successful operation
     * @param client client model
     * @return ResponseEntity&lt;Client&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Client> testClientModelWithHttpInfo(@jakarta.annotation.Nonnull Client client) throws RestClientResponseException {
        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testClientModelRequestCreation(client).toEntity(localVarReturnType);
    }

    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * <p><b>200</b> - successful operation
     * @param client client model
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testClientModelWithResponseSpec(@jakarta.annotation.Nonnull Client client) throws RestClientResponseException {
        return testClientModelRequestCreation(client);
    }

    public static class TestEndpointParametersRequest {
        private @jakarta.annotation.Nonnull BigDecimal number;
        private @jakarta.annotation.Nonnull Double _double;
        private @jakarta.annotation.Nonnull String patternWithoutDelimiter;
        private @jakarta.annotation.Nonnull byte[] _byte;
        private @jakarta.annotation.Nullable Integer integer;
        private @jakarta.annotation.Nullable Integer int32;
        private @jakarta.annotation.Nullable Long int64;
        private @jakarta.annotation.Nullable Float _float;
        private @jakarta.annotation.Nullable String string;
        private @jakarta.annotation.Nullable File binary;
        private @jakarta.annotation.Nullable LocalDate date;
        private @jakarta.annotation.Nullable OffsetDateTime dateTime;
        private @jakarta.annotation.Nullable String password;
        private @jakarta.annotation.Nullable String paramCallback;

        public TestEndpointParametersRequest() {}

        public TestEndpointParametersRequest(@jakarta.annotation.Nonnull BigDecimal number, @jakarta.annotation.Nonnull Double _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull byte[] _byte, @jakarta.annotation.Nullable Integer integer, @jakarta.annotation.Nullable Integer int32, @jakarta.annotation.Nullable Long int64, @jakarta.annotation.Nullable Float _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable File binary, @jakarta.annotation.Nullable LocalDate date, @jakarta.annotation.Nullable OffsetDateTime dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) {
            this.number = number;
            this._double = _double;
            this.patternWithoutDelimiter = patternWithoutDelimiter;
            this._byte = _byte;
            this.integer = integer;
            this.int32 = int32;
            this.int64 = int64;
            this._float = _float;
            this.string = string;
            this.binary = binary;
            this.date = date;
            this.dateTime = dateTime;
            this.password = password;
            this.paramCallback = paramCallback;
        }

        public @jakarta.annotation.Nonnull BigDecimal number() {
            return this.number;
        }
        public TestEndpointParametersRequest number(@jakarta.annotation.Nonnull BigDecimal number) {
            this.number = number;
            return this;
        }

        public @jakarta.annotation.Nonnull Double _double() {
            return this._double;
        }
        public TestEndpointParametersRequest _double(@jakarta.annotation.Nonnull Double _double) {
            this._double = _double;
            return this;
        }

        public @jakarta.annotation.Nonnull String patternWithoutDelimiter() {
            return this.patternWithoutDelimiter;
        }
        public TestEndpointParametersRequest patternWithoutDelimiter(@jakarta.annotation.Nonnull String patternWithoutDelimiter) {
            this.patternWithoutDelimiter = patternWithoutDelimiter;
            return this;
        }

        public @jakarta.annotation.Nonnull byte[] _byte() {
            return this._byte;
        }
        public TestEndpointParametersRequest _byte(@jakarta.annotation.Nonnull byte[] _byte) {
            this._byte = _byte;
            return this;
        }

        public @jakarta.annotation.Nullable Integer integer() {
            return this.integer;
        }
        public TestEndpointParametersRequest integer(@jakarta.annotation.Nullable Integer integer) {
            this.integer = integer;
            return this;
        }

        public @jakarta.annotation.Nullable Integer int32() {
            return this.int32;
        }
        public TestEndpointParametersRequest int32(@jakarta.annotation.Nullable Integer int32) {
            this.int32 = int32;
            return this;
        }

        public @jakarta.annotation.Nullable Long int64() {
            return this.int64;
        }
        public TestEndpointParametersRequest int64(@jakarta.annotation.Nullable Long int64) {
            this.int64 = int64;
            return this;
        }

        public @jakarta.annotation.Nullable Float _float() {
            return this._float;
        }
        public TestEndpointParametersRequest _float(@jakarta.annotation.Nullable Float _float) {
            this._float = _float;
            return this;
        }

        public @jakarta.annotation.Nullable String string() {
            return this.string;
        }
        public TestEndpointParametersRequest string(@jakarta.annotation.Nullable String string) {
            this.string = string;
            return this;
        }

        public @jakarta.annotation.Nullable File binary() {
            return this.binary;
        }
        public TestEndpointParametersRequest binary(@jakarta.annotation.Nullable File binary) {
            this.binary = binary;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate date() {
            return this.date;
        }
        public TestEndpointParametersRequest date(@jakarta.annotation.Nullable LocalDate date) {
            this.date = date;
            return this;
        }

        public @jakarta.annotation.Nullable OffsetDateTime dateTime() {
            return this.dateTime;
        }
        public TestEndpointParametersRequest dateTime(@jakarta.annotation.Nullable OffsetDateTime dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public @jakarta.annotation.Nullable String password() {
            return this.password;
        }
        public TestEndpointParametersRequest password(@jakarta.annotation.Nullable String password) {
            this.password = password;
            return this;
        }

        public @jakarta.annotation.Nullable String paramCallback() {
            return this.paramCallback;
        }
        public TestEndpointParametersRequest paramCallback(@jakarta.annotation.Nullable String paramCallback) {
            this.paramCallback = paramCallback;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestEndpointParametersRequest request = (TestEndpointParametersRequest) o;
            return Objects.equals(this.number, request.number()) &&
                Objects.equals(this._double, request._double()) &&
                Objects.equals(this.patternWithoutDelimiter, request.patternWithoutDelimiter()) &&
                Arrays.equals(this._byte, request._byte()) &&
                Objects.equals(this.integer, request.integer()) &&
                Objects.equals(this.int32, request.int32()) &&
                Objects.equals(this.int64, request.int64()) &&
                Objects.equals(this._float, request._float()) &&
                Objects.equals(this.string, request.string()) &&
                Objects.equals(this.binary, request.binary()) &&
                Objects.equals(this.date, request.date()) &&
                Objects.equals(this.dateTime, request.dateTime()) &&
                Objects.equals(this.password, request.password()) &&
                Objects.equals(this.paramCallback, request.paramCallback());
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, _double, patternWithoutDelimiter, Arrays.hashCode(_byte), integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
        }
    }

    /**
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param requestParameters The testEndpointParameters request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void testEndpointParameters(TestEndpointParametersRequest requestParameters) throws RestClientResponseException {
      this.testEndpointParameters(requestParameters.number(), requestParameters._double(), requestParameters.patternWithoutDelimiter(), requestParameters._byte(), requestParameters.integer(), requestParameters.int32(), requestParameters.int64(), requestParameters._float(), requestParameters.string(), requestParameters.binary(), requestParameters.date(), requestParameters.dateTime(), requestParameters.password(), requestParameters.paramCallback());
    }

  /**
  * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param requestParameters The testEndpointParameters request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> testEndpointParametersWithHttpInfo(TestEndpointParametersRequest requestParameters) throws RestClientResponseException {
      return this.testEndpointParametersWithHttpInfo(requestParameters.number(), requestParameters._double(), requestParameters.patternWithoutDelimiter(), requestParameters._byte(), requestParameters.integer(), requestParameters.int32(), requestParameters.int64(), requestParameters._float(), requestParameters.string(), requestParameters.binary(), requestParameters.date(), requestParameters.dateTime(), requestParameters.password(), requestParameters.paramCallback());
    }

  /**
  * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
  * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param requestParameters The testEndpointParameters request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec testEndpointParametersWithResponseSpec(TestEndpointParametersRequest requestParameters) throws RestClientResponseException {
      return this.testEndpointParametersWithResponseSpec(requestParameters.number(), requestParameters._double(), requestParameters.patternWithoutDelimiter(), requestParameters._byte(), requestParameters.integer(), requestParameters.int32(), requestParameters.int64(), requestParameters._float(), requestParameters.string(), requestParameters.binary(), requestParameters.date(), requestParameters.dateTime(), requestParameters.password(), requestParameters.paramCallback());
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param number None
     * @param _double None
     * @param patternWithoutDelimiter None
     * @param _byte None
     * @param integer None
     * @param int32 None
     * @param int64 None
     * @param _float None
     * @param string None
     * @param binary None
     * @param date None
     * @param dateTime None
     * @param password None
     * @param paramCallback None
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testEndpointParametersRequestCreation(@jakarta.annotation.Nonnull BigDecimal number, @jakarta.annotation.Nonnull Double _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull byte[] _byte, @jakarta.annotation.Nullable Integer integer, @jakarta.annotation.Nullable Integer int32, @jakarta.annotation.Nullable Long int64, @jakarta.annotation.Nullable Float _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable File binary, @jakarta.annotation.Nullable LocalDate date, @jakarta.annotation.Nullable OffsetDateTime dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'number' is set
        if (number == null) {
            throw new RestClientResponseException("Missing the required parameter 'number' when calling testEndpointParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter '_double' is set
        if (_double == null) {
            throw new RestClientResponseException("Missing the required parameter '_double' when calling testEndpointParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'patternWithoutDelimiter' is set
        if (patternWithoutDelimiter == null) {
            throw new RestClientResponseException("Missing the required parameter 'patternWithoutDelimiter' when calling testEndpointParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter '_byte' is set
        if (_byte == null) {
            throw new RestClientResponseException("Missing the required parameter '_byte' when calling testEndpointParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (integer != null)
            formParams.add("integer", integer);
        if (int32 != null)
            formParams.add("int32", int32);
        if (int64 != null)
            formParams.add("int64", int64);
        if (number != null)
            formParams.add("number", number);
        if (_float != null)
            formParams.add("float", _float);
        if (_double != null)
            formParams.add("double", _double);
        if (string != null)
            formParams.add("string", string);
        if (patternWithoutDelimiter != null)
            formParams.add("pattern_without_delimiter", patternWithoutDelimiter);
        if (_byte != null)
            formParams.add("byte", _byte);
        if (binary != null)
            formParams.add("binary", new FileSystemResource(binary));
        if (date != null)
            formParams.add("date", date);
        if (dateTime != null)
            formParams.add("dateTime", dateTime);
        if (password != null)
            formParams.add("password", password);
        if (paramCallback != null)
            formParams.add("callback", paramCallback);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "http_basic_test" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param number None
     * @param _double None
     * @param patternWithoutDelimiter None
     * @param _byte None
     * @param integer None
     * @param int32 None
     * @param int64 None
     * @param _float None
     * @param string None
     * @param binary None
     * @param date None
     * @param dateTime None
     * @param password None
     * @param paramCallback None
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testEndpointParameters(@jakarta.annotation.Nonnull BigDecimal number, @jakarta.annotation.Nonnull Double _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull byte[] _byte, @jakarta.annotation.Nullable Integer integer, @jakarta.annotation.Nullable Integer int32, @jakarta.annotation.Nullable Long int64, @jakarta.annotation.Nullable Float _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable File binary, @jakarta.annotation.Nullable LocalDate date, @jakarta.annotation.Nullable OffsetDateTime dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testEndpointParametersRequestCreation(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback).body(localVarReturnType);
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param number None
     * @param _double None
     * @param patternWithoutDelimiter None
     * @param _byte None
     * @param integer None
     * @param int32 None
     * @param int64 None
     * @param _float None
     * @param string None
     * @param binary None
     * @param date None
     * @param dateTime None
     * @param password None
     * @param paramCallback None
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testEndpointParametersWithHttpInfo(@jakarta.annotation.Nonnull BigDecimal number, @jakarta.annotation.Nonnull Double _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull byte[] _byte, @jakarta.annotation.Nullable Integer integer, @jakarta.annotation.Nullable Integer int32, @jakarta.annotation.Nullable Long int64, @jakarta.annotation.Nullable Float _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable File binary, @jakarta.annotation.Nullable LocalDate date, @jakarta.annotation.Nullable OffsetDateTime dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testEndpointParametersRequestCreation(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback).toEntity(localVarReturnType);
    }

    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - User not found
     * @param number None
     * @param _double None
     * @param patternWithoutDelimiter None
     * @param _byte None
     * @param integer None
     * @param int32 None
     * @param int64 None
     * @param _float None
     * @param string None
     * @param binary None
     * @param date None
     * @param dateTime None
     * @param password None
     * @param paramCallback None
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testEndpointParametersWithResponseSpec(@jakarta.annotation.Nonnull BigDecimal number, @jakarta.annotation.Nonnull Double _double, @jakarta.annotation.Nonnull String patternWithoutDelimiter, @jakarta.annotation.Nonnull byte[] _byte, @jakarta.annotation.Nullable Integer integer, @jakarta.annotation.Nullable Integer int32, @jakarta.annotation.Nullable Long int64, @jakarta.annotation.Nullable Float _float, @jakarta.annotation.Nullable String string, @jakarta.annotation.Nullable File binary, @jakarta.annotation.Nullable LocalDate date, @jakarta.annotation.Nullable OffsetDateTime dateTime, @jakarta.annotation.Nullable String password, @jakarta.annotation.Nullable String paramCallback) throws RestClientResponseException {
        return testEndpointParametersRequestCreation(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
    }

    public static class TestEnumParametersRequest {
        private @jakarta.annotation.Nullable List<String> enumHeaderStringArray;
        private @jakarta.annotation.Nullable String enumHeaderString;
        private @jakarta.annotation.Nullable List<String> enumQueryStringArray;
        private @jakarta.annotation.Nullable String enumQueryString;
        private @jakarta.annotation.Nullable Integer enumQueryInteger;
        private @jakarta.annotation.Nullable Double enumQueryDouble;
        private @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray;
        private @jakarta.annotation.Nullable List<String> enumFormStringArray;
        private @jakarta.annotation.Nullable String enumFormString;

        public TestEnumParametersRequest() {}

        public TestEnumParametersRequest(@jakarta.annotation.Nullable List<String> enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable List<String> enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable Integer enumQueryInteger, @jakarta.annotation.Nullable Double enumQueryDouble, @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray, @jakarta.annotation.Nullable List<String> enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) {
            this.enumHeaderStringArray = enumHeaderStringArray;
            this.enumHeaderString = enumHeaderString;
            this.enumQueryStringArray = enumQueryStringArray;
            this.enumQueryString = enumQueryString;
            this.enumQueryInteger = enumQueryInteger;
            this.enumQueryDouble = enumQueryDouble;
            this.enumQueryModelArray = enumQueryModelArray;
            this.enumFormStringArray = enumFormStringArray;
            this.enumFormString = enumFormString;
        }

        public @jakarta.annotation.Nullable List<String> enumHeaderStringArray() {
            return this.enumHeaderStringArray;
        }
        public TestEnumParametersRequest enumHeaderStringArray(@jakarta.annotation.Nullable List<String> enumHeaderStringArray) {
            this.enumHeaderStringArray = enumHeaderStringArray;
            return this;
        }

        public @jakarta.annotation.Nullable String enumHeaderString() {
            return this.enumHeaderString;
        }
        public TestEnumParametersRequest enumHeaderString(@jakarta.annotation.Nullable String enumHeaderString) {
            this.enumHeaderString = enumHeaderString;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> enumQueryStringArray() {
            return this.enumQueryStringArray;
        }
        public TestEnumParametersRequest enumQueryStringArray(@jakarta.annotation.Nullable List<String> enumQueryStringArray) {
            this.enumQueryStringArray = enumQueryStringArray;
            return this;
        }

        public @jakarta.annotation.Nullable String enumQueryString() {
            return this.enumQueryString;
        }
        public TestEnumParametersRequest enumQueryString(@jakarta.annotation.Nullable String enumQueryString) {
            this.enumQueryString = enumQueryString;
            return this;
        }

        public @jakarta.annotation.Nullable Integer enumQueryInteger() {
            return this.enumQueryInteger;
        }
        public TestEnumParametersRequest enumQueryInteger(@jakarta.annotation.Nullable Integer enumQueryInteger) {
            this.enumQueryInteger = enumQueryInteger;
            return this;
        }

        public @jakarta.annotation.Nullable Double enumQueryDouble() {
            return this.enumQueryDouble;
        }
        public TestEnumParametersRequest enumQueryDouble(@jakarta.annotation.Nullable Double enumQueryDouble) {
            this.enumQueryDouble = enumQueryDouble;
            return this;
        }

        public @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray() {
            return this.enumQueryModelArray;
        }
        public TestEnumParametersRequest enumQueryModelArray(@jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray) {
            this.enumQueryModelArray = enumQueryModelArray;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> enumFormStringArray() {
            return this.enumFormStringArray;
        }
        public TestEnumParametersRequest enumFormStringArray(@jakarta.annotation.Nullable List<String> enumFormStringArray) {
            this.enumFormStringArray = enumFormStringArray;
            return this;
        }

        public @jakarta.annotation.Nullable String enumFormString() {
            return this.enumFormString;
        }
        public TestEnumParametersRequest enumFormString(@jakarta.annotation.Nullable String enumFormString) {
            this.enumFormString = enumFormString;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestEnumParametersRequest request = (TestEnumParametersRequest) o;
            return Objects.equals(this.enumHeaderStringArray, request.enumHeaderStringArray()) &&
                Objects.equals(this.enumHeaderString, request.enumHeaderString()) &&
                Objects.equals(this.enumQueryStringArray, request.enumQueryStringArray()) &&
                Objects.equals(this.enumQueryString, request.enumQueryString()) &&
                Objects.equals(this.enumQueryInteger, request.enumQueryInteger()) &&
                Objects.equals(this.enumQueryDouble, request.enumQueryDouble()) &&
                Objects.equals(this.enumQueryModelArray, request.enumQueryModelArray()) &&
                Objects.equals(this.enumFormStringArray, request.enumFormStringArray()) &&
                Objects.equals(this.enumFormString, request.enumFormString());
        }

        @Override
        public int hashCode() {
            return Objects.hash(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString);
        }
    }

    /**
    * To test enum parameters
    * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param requestParameters The testEnumParameters request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void testEnumParameters(TestEnumParametersRequest requestParameters) throws RestClientResponseException {
      this.testEnumParameters(requestParameters.enumHeaderStringArray(), requestParameters.enumHeaderString(), requestParameters.enumQueryStringArray(), requestParameters.enumQueryString(), requestParameters.enumQueryInteger(), requestParameters.enumQueryDouble(), requestParameters.enumQueryModelArray(), requestParameters.enumFormStringArray(), requestParameters.enumFormString());
    }

  /**
  * To test enum parameters
  * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param requestParameters The testEnumParameters request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> testEnumParametersWithHttpInfo(TestEnumParametersRequest requestParameters) throws RestClientResponseException {
      return this.testEnumParametersWithHttpInfo(requestParameters.enumHeaderStringArray(), requestParameters.enumHeaderString(), requestParameters.enumQueryStringArray(), requestParameters.enumQueryString(), requestParameters.enumQueryInteger(), requestParameters.enumQueryDouble(), requestParameters.enumQueryModelArray(), requestParameters.enumFormStringArray(), requestParameters.enumFormString());
    }

  /**
  * To test enum parameters
  * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param requestParameters The testEnumParameters request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec testEnumParametersWithResponseSpec(TestEnumParametersRequest requestParameters) throws RestClientResponseException {
      return this.testEnumParametersWithResponseSpec(requestParameters.enumHeaderStringArray(), requestParameters.enumHeaderString(), requestParameters.enumQueryStringArray(), requestParameters.enumQueryString(), requestParameters.enumQueryInteger(), requestParameters.enumQueryDouble(), requestParameters.enumQueryModelArray(), requestParameters.enumFormStringArray(), requestParameters.enumFormString());
    }

    /**
     * To test enum parameters
     * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param enumHeaderStringArray Header parameter enum test (string array)
     * @param enumHeaderString Header parameter enum test (string)
     * @param enumQueryStringArray Query parameter enum test (string array)
     * @param enumQueryString Query parameter enum test (string)
     * @param enumQueryInteger Query parameter enum test (double)
     * @param enumQueryDouble Query parameter enum test (double)
     * @param enumQueryModelArray The enumQueryModelArray parameter
     * @param enumFormStringArray Form parameter enum test (string array)
     * @param enumFormString Form parameter enum test (string)
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testEnumParametersRequestCreation(@jakarta.annotation.Nullable List<String> enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable List<String> enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable Integer enumQueryInteger, @jakarta.annotation.Nullable Double enumQueryDouble, @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray, @jakarta.annotation.Nullable List<String> enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "enum_query_string_array", enumQueryStringArray));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enum_query_string", enumQueryString));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enum_query_integer", enumQueryInteger));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enum_query_double", enumQueryDouble));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "enum_query_model_array", enumQueryModelArray));
        

        if (enumHeaderStringArray != null)
        headerParams.add("enum_header_string_array", apiClient.parameterToString(enumHeaderStringArray));
        if (enumHeaderString != null)
        headerParams.add("enum_header_string", apiClient.parameterToString(enumHeaderString));
        if (enumFormStringArray != null)
            formParams.addAll("enum_form_string_array", enumFormStringArray);
        if (enumFormString != null)
            formParams.add("enum_form_string", enumFormString);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * To test enum parameters
     * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param enumHeaderStringArray Header parameter enum test (string array)
     * @param enumHeaderString Header parameter enum test (string)
     * @param enumQueryStringArray Query parameter enum test (string array)
     * @param enumQueryString Query parameter enum test (string)
     * @param enumQueryInteger Query parameter enum test (double)
     * @param enumQueryDouble Query parameter enum test (double)
     * @param enumQueryModelArray The enumQueryModelArray parameter
     * @param enumFormStringArray Form parameter enum test (string array)
     * @param enumFormString Form parameter enum test (string)
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testEnumParameters(@jakarta.annotation.Nullable List<String> enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable List<String> enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable Integer enumQueryInteger, @jakarta.annotation.Nullable Double enumQueryDouble, @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray, @jakarta.annotation.Nullable List<String> enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testEnumParametersRequestCreation(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString).body(localVarReturnType);
    }

    /**
     * To test enum parameters
     * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param enumHeaderStringArray Header parameter enum test (string array)
     * @param enumHeaderString Header parameter enum test (string)
     * @param enumQueryStringArray Query parameter enum test (string array)
     * @param enumQueryString Query parameter enum test (string)
     * @param enumQueryInteger Query parameter enum test (double)
     * @param enumQueryDouble Query parameter enum test (double)
     * @param enumQueryModelArray The enumQueryModelArray parameter
     * @param enumFormStringArray Form parameter enum test (string array)
     * @param enumFormString Form parameter enum test (string)
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testEnumParametersWithHttpInfo(@jakarta.annotation.Nullable List<String> enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable List<String> enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable Integer enumQueryInteger, @jakarta.annotation.Nullable Double enumQueryDouble, @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray, @jakarta.annotation.Nullable List<String> enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testEnumParametersRequestCreation(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString).toEntity(localVarReturnType);
    }

    /**
     * To test enum parameters
     * To test enum parameters
     * <p><b>400</b> - Invalid request
     * <p><b>404</b> - Not found
     * @param enumHeaderStringArray Header parameter enum test (string array)
     * @param enumHeaderString Header parameter enum test (string)
     * @param enumQueryStringArray Query parameter enum test (string array)
     * @param enumQueryString Query parameter enum test (string)
     * @param enumQueryInteger Query parameter enum test (double)
     * @param enumQueryDouble Query parameter enum test (double)
     * @param enumQueryModelArray The enumQueryModelArray parameter
     * @param enumFormStringArray Form parameter enum test (string array)
     * @param enumFormString Form parameter enum test (string)
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testEnumParametersWithResponseSpec(@jakarta.annotation.Nullable List<String> enumHeaderStringArray, @jakarta.annotation.Nullable String enumHeaderString, @jakarta.annotation.Nullable List<String> enumQueryStringArray, @jakarta.annotation.Nullable String enumQueryString, @jakarta.annotation.Nullable Integer enumQueryInteger, @jakarta.annotation.Nullable Double enumQueryDouble, @jakarta.annotation.Nullable List<EnumClass> enumQueryModelArray, @jakarta.annotation.Nullable List<String> enumFormStringArray, @jakarta.annotation.Nullable String enumFormString) throws RestClientResponseException {
        return testEnumParametersRequestCreation(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString);
    }

    public static class TestGroupParametersRequest {
        private @jakarta.annotation.Nonnull Integer requiredStringGroup;
        private @jakarta.annotation.Nonnull Boolean requiredBooleanGroup;
        private @jakarta.annotation.Nonnull Long requiredInt64Group;
        private @jakarta.annotation.Nullable Integer stringGroup;
        private @jakarta.annotation.Nullable Boolean booleanGroup;
        private @jakarta.annotation.Nullable Long int64Group;

        public TestGroupParametersRequest() {}

        public TestGroupParametersRequest(@jakarta.annotation.Nonnull Integer requiredStringGroup, @jakarta.annotation.Nonnull Boolean requiredBooleanGroup, @jakarta.annotation.Nonnull Long requiredInt64Group, @jakarta.annotation.Nullable Integer stringGroup, @jakarta.annotation.Nullable Boolean booleanGroup, @jakarta.annotation.Nullable Long int64Group) {
            this.requiredStringGroup = requiredStringGroup;
            this.requiredBooleanGroup = requiredBooleanGroup;
            this.requiredInt64Group = requiredInt64Group;
            this.stringGroup = stringGroup;
            this.booleanGroup = booleanGroup;
            this.int64Group = int64Group;
        }

        public @jakarta.annotation.Nonnull Integer requiredStringGroup() {
            return this.requiredStringGroup;
        }
        public TestGroupParametersRequest requiredStringGroup(@jakarta.annotation.Nonnull Integer requiredStringGroup) {
            this.requiredStringGroup = requiredStringGroup;
            return this;
        }

        public @jakarta.annotation.Nonnull Boolean requiredBooleanGroup() {
            return this.requiredBooleanGroup;
        }
        public TestGroupParametersRequest requiredBooleanGroup(@jakarta.annotation.Nonnull Boolean requiredBooleanGroup) {
            this.requiredBooleanGroup = requiredBooleanGroup;
            return this;
        }

        public @jakarta.annotation.Nonnull Long requiredInt64Group() {
            return this.requiredInt64Group;
        }
        public TestGroupParametersRequest requiredInt64Group(@jakarta.annotation.Nonnull Long requiredInt64Group) {
            this.requiredInt64Group = requiredInt64Group;
            return this;
        }

        public @jakarta.annotation.Nullable Integer stringGroup() {
            return this.stringGroup;
        }
        public TestGroupParametersRequest stringGroup(@jakarta.annotation.Nullable Integer stringGroup) {
            this.stringGroup = stringGroup;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean booleanGroup() {
            return this.booleanGroup;
        }
        public TestGroupParametersRequest booleanGroup(@jakarta.annotation.Nullable Boolean booleanGroup) {
            this.booleanGroup = booleanGroup;
            return this;
        }

        public @jakarta.annotation.Nullable Long int64Group() {
            return this.int64Group;
        }
        public TestGroupParametersRequest int64Group(@jakarta.annotation.Nullable Long int64Group) {
            this.int64Group = int64Group;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestGroupParametersRequest request = (TestGroupParametersRequest) o;
            return Objects.equals(this.requiredStringGroup, request.requiredStringGroup()) &&
                Objects.equals(this.requiredBooleanGroup, request.requiredBooleanGroup()) &&
                Objects.equals(this.requiredInt64Group, request.requiredInt64Group()) &&
                Objects.equals(this.stringGroup, request.stringGroup()) &&
                Objects.equals(this.booleanGroup, request.booleanGroup()) &&
                Objects.equals(this.int64Group, request.int64Group());
        }

        @Override
        public int hashCode() {
            return Objects.hash(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
        }
    }

    /**
    * Fake endpoint to test group parameters (optional)
    * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requestParameters The testGroupParameters request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void testGroupParameters(TestGroupParametersRequest requestParameters) throws RestClientResponseException {
      this.testGroupParameters(requestParameters.requiredStringGroup(), requestParameters.requiredBooleanGroup(), requestParameters.requiredInt64Group(), requestParameters.stringGroup(), requestParameters.booleanGroup(), requestParameters.int64Group());
    }

  /**
  * Fake endpoint to test group parameters (optional)
  * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requestParameters The testGroupParameters request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> testGroupParametersWithHttpInfo(TestGroupParametersRequest requestParameters) throws RestClientResponseException {
      return this.testGroupParametersWithHttpInfo(requestParameters.requiredStringGroup(), requestParameters.requiredBooleanGroup(), requestParameters.requiredInt64Group(), requestParameters.stringGroup(), requestParameters.booleanGroup(), requestParameters.int64Group());
    }

  /**
  * Fake endpoint to test group parameters (optional)
  * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requestParameters The testGroupParameters request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec testGroupParametersWithResponseSpec(TestGroupParametersRequest requestParameters) throws RestClientResponseException {
      return this.testGroupParametersWithResponseSpec(requestParameters.requiredStringGroup(), requestParameters.requiredBooleanGroup(), requestParameters.requiredInt64Group(), requestParameters.stringGroup(), requestParameters.booleanGroup(), requestParameters.int64Group());
    }

    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requiredStringGroup Required String in group parameters
     * @param requiredBooleanGroup Required Boolean in group parameters
     * @param requiredInt64Group Required Integer in group parameters
     * @param stringGroup String in group parameters
     * @param booleanGroup Boolean in group parameters
     * @param int64Group Integer in group parameters
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testGroupParametersRequestCreation(@jakarta.annotation.Nonnull Integer requiredStringGroup, @jakarta.annotation.Nonnull Boolean requiredBooleanGroup, @jakarta.annotation.Nonnull Long requiredInt64Group, @jakarta.annotation.Nullable Integer stringGroup, @jakarta.annotation.Nullable Boolean booleanGroup, @jakarta.annotation.Nullable Long int64Group) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'requiredStringGroup' is set
        if (requiredStringGroup == null) {
            throw new RestClientResponseException("Missing the required parameter 'requiredStringGroup' when calling testGroupParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requiredBooleanGroup' is set
        if (requiredBooleanGroup == null) {
            throw new RestClientResponseException("Missing the required parameter 'requiredBooleanGroup' when calling testGroupParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requiredInt64Group' is set
        if (requiredInt64Group == null) {
            throw new RestClientResponseException("Missing the required parameter 'requiredInt64Group' when calling testGroupParameters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "required_string_group", requiredStringGroup));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "required_int64_group", requiredInt64Group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "string_group", stringGroup));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "int64_group", int64Group));
        

        if (requiredBooleanGroup != null)
        headerParams.add("required_boolean_group", apiClient.parameterToString(requiredBooleanGroup));
        if (booleanGroup != null)
        headerParams.add("boolean_group", apiClient.parameterToString(booleanGroup));
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearer_test" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requiredStringGroup Required String in group parameters
     * @param requiredBooleanGroup Required Boolean in group parameters
     * @param requiredInt64Group Required Integer in group parameters
     * @param stringGroup String in group parameters
     * @param booleanGroup Boolean in group parameters
     * @param int64Group Integer in group parameters
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testGroupParameters(@jakarta.annotation.Nonnull Integer requiredStringGroup, @jakarta.annotation.Nonnull Boolean requiredBooleanGroup, @jakarta.annotation.Nonnull Long requiredInt64Group, @jakarta.annotation.Nullable Integer stringGroup, @jakarta.annotation.Nullable Boolean booleanGroup, @jakarta.annotation.Nullable Long int64Group) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testGroupParametersRequestCreation(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group).body(localVarReturnType);
    }

    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requiredStringGroup Required String in group parameters
     * @param requiredBooleanGroup Required Boolean in group parameters
     * @param requiredInt64Group Required Integer in group parameters
     * @param stringGroup String in group parameters
     * @param booleanGroup Boolean in group parameters
     * @param int64Group Integer in group parameters
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testGroupParametersWithHttpInfo(@jakarta.annotation.Nonnull Integer requiredStringGroup, @jakarta.annotation.Nonnull Boolean requiredBooleanGroup, @jakarta.annotation.Nonnull Long requiredInt64Group, @jakarta.annotation.Nullable Integer stringGroup, @jakarta.annotation.Nullable Boolean booleanGroup, @jakarta.annotation.Nullable Long int64Group) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testGroupParametersRequestCreation(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group).toEntity(localVarReturnType);
    }

    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     * <p><b>400</b> - Something wrong
     * @param requiredStringGroup Required String in group parameters
     * @param requiredBooleanGroup Required Boolean in group parameters
     * @param requiredInt64Group Required Integer in group parameters
     * @param stringGroup String in group parameters
     * @param booleanGroup Boolean in group parameters
     * @param int64Group Integer in group parameters
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testGroupParametersWithResponseSpec(@jakarta.annotation.Nonnull Integer requiredStringGroup, @jakarta.annotation.Nonnull Boolean requiredBooleanGroup, @jakarta.annotation.Nonnull Long requiredInt64Group, @jakarta.annotation.Nullable Integer stringGroup, @jakarta.annotation.Nullable Boolean booleanGroup, @jakarta.annotation.Nullable Long int64Group) throws RestClientResponseException {
        return testGroupParametersRequestCreation(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
    }
    /**
     * test inline additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testInlineAdditionalPropertiesRequestCreation(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new RestClientResponseException("Missing the required parameter 'requestBody' when calling testInlineAdditionalProperties", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/inline-additionalProperties", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test inline additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testInlineAdditionalProperties(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testInlineAdditionalPropertiesRequestCreation(requestBody).body(localVarReturnType);
    }

    /**
     * test inline additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testInlineAdditionalPropertiesWithHttpInfo(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testInlineAdditionalPropertiesRequestCreation(requestBody).toEntity(localVarReturnType);
    }

    /**
     * test inline additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testInlineAdditionalPropertiesWithResponseSpec(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        return testInlineAdditionalPropertiesRequestCreation(requestBody);
    }
    /**
     * test inline free-form additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param testInlineFreeformAdditionalPropertiesRequest request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testInlineFreeformAdditionalPropertiesRequestCreation(@jakarta.annotation.Nonnull TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws RestClientResponseException {
        Object postBody = testInlineFreeformAdditionalPropertiesRequest;
        // verify the required parameter 'testInlineFreeformAdditionalPropertiesRequest' is set
        if (testInlineFreeformAdditionalPropertiesRequest == null) {
            throw new RestClientResponseException("Missing the required parameter 'testInlineFreeformAdditionalPropertiesRequest' when calling testInlineFreeformAdditionalProperties", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/inline-freeform-additionalProperties", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test inline free-form additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param testInlineFreeformAdditionalPropertiesRequest request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testInlineFreeformAdditionalProperties(@jakarta.annotation.Nonnull TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testInlineFreeformAdditionalPropertiesRequestCreation(testInlineFreeformAdditionalPropertiesRequest).body(localVarReturnType);
    }

    /**
     * test inline free-form additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param testInlineFreeformAdditionalPropertiesRequest request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testInlineFreeformAdditionalPropertiesWithHttpInfo(@jakarta.annotation.Nonnull TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testInlineFreeformAdditionalPropertiesRequestCreation(testInlineFreeformAdditionalPropertiesRequest).toEntity(localVarReturnType);
    }

    /**
     * test inline free-form additionalProperties
     * 
     * <p><b>200</b> - successful operation
     * @param testInlineFreeformAdditionalPropertiesRequest request body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testInlineFreeformAdditionalPropertiesWithResponseSpec(@jakarta.annotation.Nonnull TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest) throws RestClientResponseException {
        return testInlineFreeformAdditionalPropertiesRequestCreation(testInlineFreeformAdditionalPropertiesRequest);
    }

    public static class TestJsonFormDataRequest {
        private @jakarta.annotation.Nonnull String param;
        private @jakarta.annotation.Nonnull String param2;

        public TestJsonFormDataRequest() {}

        public TestJsonFormDataRequest(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2) {
            this.param = param;
            this.param2 = param2;
        }

        public @jakarta.annotation.Nonnull String param() {
            return this.param;
        }
        public TestJsonFormDataRequest param(@jakarta.annotation.Nonnull String param) {
            this.param = param;
            return this;
        }

        public @jakarta.annotation.Nonnull String param2() {
            return this.param2;
        }
        public TestJsonFormDataRequest param2(@jakarta.annotation.Nonnull String param2) {
            this.param2 = param2;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestJsonFormDataRequest request = (TestJsonFormDataRequest) o;
            return Objects.equals(this.param, request.param()) &&
                Objects.equals(this.param2, request.param2());
        }

        @Override
        public int hashCode() {
            return Objects.hash(param, param2);
        }
    }

    /**
    * test json serialization of form data
    * 
     * <p><b>200</b> - successful operation
     * @param requestParameters The testJsonFormData request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void testJsonFormData(TestJsonFormDataRequest requestParameters) throws RestClientResponseException {
      this.testJsonFormData(requestParameters.param(), requestParameters.param2());
    }

  /**
  * test json serialization of form data
  * 
     * <p><b>200</b> - successful operation
     * @param requestParameters The testJsonFormData request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> testJsonFormDataWithHttpInfo(TestJsonFormDataRequest requestParameters) throws RestClientResponseException {
      return this.testJsonFormDataWithHttpInfo(requestParameters.param(), requestParameters.param2());
    }

  /**
  * test json serialization of form data
  * 
     * <p><b>200</b> - successful operation
     * @param requestParameters The testJsonFormData request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec testJsonFormDataWithResponseSpec(TestJsonFormDataRequest requestParameters) throws RestClientResponseException {
      return this.testJsonFormDataWithResponseSpec(requestParameters.param(), requestParameters.param2());
    }

    /**
     * test json serialization of form data
     * 
     * <p><b>200</b> - successful operation
     * @param param field1
     * @param param2 field2
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testJsonFormDataRequestCreation(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'param' is set
        if (param == null) {
            throw new RestClientResponseException("Missing the required parameter 'param' when calling testJsonFormData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'param2' is set
        if (param2 == null) {
            throw new RestClientResponseException("Missing the required parameter 'param2' when calling testJsonFormData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        if (param != null)
            formParams.add("param", param);
        if (param2 != null)
            formParams.add("param2", param2);

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/jsonFormData", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test json serialization of form data
     * 
     * <p><b>200</b> - successful operation
     * @param param field1
     * @param param2 field2
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testJsonFormData(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testJsonFormDataRequestCreation(param, param2).body(localVarReturnType);
    }

    /**
     * test json serialization of form data
     * 
     * <p><b>200</b> - successful operation
     * @param param field1
     * @param param2 field2
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testJsonFormDataWithHttpInfo(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testJsonFormDataRequestCreation(param, param2).toEntity(localVarReturnType);
    }

    /**
     * test json serialization of form data
     * 
     * <p><b>200</b> - successful operation
     * @param param field1
     * @param param2 field2
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testJsonFormDataWithResponseSpec(@jakarta.annotation.Nonnull String param, @jakarta.annotation.Nonnull String param2) throws RestClientResponseException {
        return testJsonFormDataRequestCreation(param, param2);
    }
    /**
     * test nullable parent property
     * 
     * <p><b>200</b> - successful operation
     * @param childWithNullable request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testNullableRequestCreation(@jakarta.annotation.Nonnull ChildWithNullable childWithNullable) throws RestClientResponseException {
        Object postBody = childWithNullable;
        // verify the required parameter 'childWithNullable' is set
        if (childWithNullable == null) {
            throw new RestClientResponseException("Missing the required parameter 'childWithNullable' when calling testNullable", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/nullable", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test nullable parent property
     * 
     * <p><b>200</b> - successful operation
     * @param childWithNullable request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testNullable(@jakarta.annotation.Nonnull ChildWithNullable childWithNullable) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testNullableRequestCreation(childWithNullable).body(localVarReturnType);
    }

    /**
     * test nullable parent property
     * 
     * <p><b>200</b> - successful operation
     * @param childWithNullable request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testNullableWithHttpInfo(@jakarta.annotation.Nonnull ChildWithNullable childWithNullable) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testNullableRequestCreation(childWithNullable).toEntity(localVarReturnType);
    }

    /**
     * test nullable parent property
     * 
     * <p><b>200</b> - successful operation
     * @param childWithNullable request body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testNullableWithResponseSpec(@jakarta.annotation.Nonnull ChildWithNullable childWithNullable) throws RestClientResponseException {
        return testNullableRequestCreation(childWithNullable);
    }

    public static class TestQueryParameterCollectionFormatRequest {
        private @jakarta.annotation.Nonnull List<String> pipe;
        private @jakarta.annotation.Nonnull List<String> ioutil;
        private @jakarta.annotation.Nonnull List<String> http;
        private @jakarta.annotation.Nonnull List<String> url;
        private @jakarta.annotation.Nonnull List<String> context;
        private @jakarta.annotation.Nonnull String allowEmpty;
        private @jakarta.annotation.Nullable Map<String, String> language;

        public TestQueryParameterCollectionFormatRequest() {}

        public TestQueryParameterCollectionFormatRequest(@jakarta.annotation.Nonnull List<String> pipe, @jakarta.annotation.Nonnull List<String> ioutil, @jakarta.annotation.Nonnull List<String> http, @jakarta.annotation.Nonnull List<String> url, @jakarta.annotation.Nonnull List<String> context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable Map<String, String> language) {
            this.pipe = pipe;
            this.ioutil = ioutil;
            this.http = http;
            this.url = url;
            this.context = context;
            this.allowEmpty = allowEmpty;
            this.language = language;
        }

        public @jakarta.annotation.Nonnull List<String> pipe() {
            return this.pipe;
        }
        public TestQueryParameterCollectionFormatRequest pipe(@jakarta.annotation.Nonnull List<String> pipe) {
            this.pipe = pipe;
            return this;
        }

        public @jakarta.annotation.Nonnull List<String> ioutil() {
            return this.ioutil;
        }
        public TestQueryParameterCollectionFormatRequest ioutil(@jakarta.annotation.Nonnull List<String> ioutil) {
            this.ioutil = ioutil;
            return this;
        }

        public @jakarta.annotation.Nonnull List<String> http() {
            return this.http;
        }
        public TestQueryParameterCollectionFormatRequest http(@jakarta.annotation.Nonnull List<String> http) {
            this.http = http;
            return this;
        }

        public @jakarta.annotation.Nonnull List<String> url() {
            return this.url;
        }
        public TestQueryParameterCollectionFormatRequest url(@jakarta.annotation.Nonnull List<String> url) {
            this.url = url;
            return this;
        }

        public @jakarta.annotation.Nonnull List<String> context() {
            return this.context;
        }
        public TestQueryParameterCollectionFormatRequest context(@jakarta.annotation.Nonnull List<String> context) {
            this.context = context;
            return this;
        }

        public @jakarta.annotation.Nonnull String allowEmpty() {
            return this.allowEmpty;
        }
        public TestQueryParameterCollectionFormatRequest allowEmpty(@jakarta.annotation.Nonnull String allowEmpty) {
            this.allowEmpty = allowEmpty;
            return this;
        }

        public @jakarta.annotation.Nullable Map<String, String> language() {
            return this.language;
        }
        public TestQueryParameterCollectionFormatRequest language(@jakarta.annotation.Nullable Map<String, String> language) {
            this.language = language;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestQueryParameterCollectionFormatRequest request = (TestQueryParameterCollectionFormatRequest) o;
            return Objects.equals(this.pipe, request.pipe()) &&
                Objects.equals(this.ioutil, request.ioutil()) &&
                Objects.equals(this.http, request.http()) &&
                Objects.equals(this.url, request.url()) &&
                Objects.equals(this.context, request.context()) &&
                Objects.equals(this.allowEmpty, request.allowEmpty()) &&
                Objects.equals(this.language, request.language());
        }

        @Override
        public int hashCode() {
            return Objects.hash(pipe, ioutil, http, url, context, allowEmpty, language);
        }
    }

    /**
    * 
    * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param requestParameters The testQueryParameterCollectionFormat request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public void testQueryParameterCollectionFormat(TestQueryParameterCollectionFormatRequest requestParameters) throws RestClientResponseException {
      this.testQueryParameterCollectionFormat(requestParameters.pipe(), requestParameters.ioutil(), requestParameters.http(), requestParameters.url(), requestParameters.context(), requestParameters.allowEmpty(), requestParameters.language());
    }

  /**
  * 
  * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param requestParameters The testQueryParameterCollectionFormat request parameters as object
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Void> testQueryParameterCollectionFormatWithHttpInfo(TestQueryParameterCollectionFormatRequest requestParameters) throws RestClientResponseException {
      return this.testQueryParameterCollectionFormatWithHttpInfo(requestParameters.pipe(), requestParameters.ioutil(), requestParameters.http(), requestParameters.url(), requestParameters.context(), requestParameters.allowEmpty(), requestParameters.language());
    }

  /**
  * 
  * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param requestParameters The testQueryParameterCollectionFormat request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec testQueryParameterCollectionFormatWithResponseSpec(TestQueryParameterCollectionFormatRequest requestParameters) throws RestClientResponseException {
      return this.testQueryParameterCollectionFormatWithResponseSpec(requestParameters.pipe(), requestParameters.ioutil(), requestParameters.http(), requestParameters.url(), requestParameters.context(), requestParameters.allowEmpty(), requestParameters.language());
    }

    /**
     * 
     * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param pipe The pipe parameter
     * @param ioutil The ioutil parameter
     * @param http The http parameter
     * @param url The url parameter
     * @param context The context parameter
     * @param allowEmpty The allowEmpty parameter
     * @param language The language parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testQueryParameterCollectionFormatRequestCreation(@jakarta.annotation.Nonnull List<String> pipe, @jakarta.annotation.Nonnull List<String> ioutil, @jakarta.annotation.Nonnull List<String> http, @jakarta.annotation.Nonnull List<String> url, @jakarta.annotation.Nonnull List<String> context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable Map<String, String> language) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'pipe' is set
        if (pipe == null) {
            throw new RestClientResponseException("Missing the required parameter 'pipe' when calling testQueryParameterCollectionFormat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'ioutil' is set
        if (ioutil == null) {
            throw new RestClientResponseException("Missing the required parameter 'ioutil' when calling testQueryParameterCollectionFormat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'http' is set
        if (http == null) {
            throw new RestClientResponseException("Missing the required parameter 'http' when calling testQueryParameterCollectionFormat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'url' is set
        if (url == null) {
            throw new RestClientResponseException("Missing the required parameter 'url' when calling testQueryParameterCollectionFormat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'context' is set
        if (context == null) {
            throw new RestClientResponseException("Missing the required parameter 'context' when calling testQueryParameterCollectionFormat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'allowEmpty' is set
        if (allowEmpty == null) {
            throw new RestClientResponseException("Missing the required parameter 'allowEmpty' when calling testQueryParameterCollectionFormat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("pipes".toUpperCase(Locale.ROOT)), "pipe", pipe));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "ioutil", ioutil));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("ssv".toUpperCase(Locale.ROOT)), "http", http));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "url", url));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "context", context));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "language", language));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allowEmpty", allowEmpty));
        
        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/test-query-parameters", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param pipe The pipe parameter
     * @param ioutil The ioutil parameter
     * @param http The http parameter
     * @param url The url parameter
     * @param context The context parameter
     * @param allowEmpty The allowEmpty parameter
     * @param language The language parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testQueryParameterCollectionFormat(@jakarta.annotation.Nonnull List<String> pipe, @jakarta.annotation.Nonnull List<String> ioutil, @jakarta.annotation.Nonnull List<String> http, @jakarta.annotation.Nonnull List<String> url, @jakarta.annotation.Nonnull List<String> context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable Map<String, String> language) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testQueryParameterCollectionFormatRequestCreation(pipe, ioutil, http, url, context, allowEmpty, language).body(localVarReturnType);
    }

    /**
     * 
     * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param pipe The pipe parameter
     * @param ioutil The ioutil parameter
     * @param http The http parameter
     * @param url The url parameter
     * @param context The context parameter
     * @param allowEmpty The allowEmpty parameter
     * @param language The language parameter
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testQueryParameterCollectionFormatWithHttpInfo(@jakarta.annotation.Nonnull List<String> pipe, @jakarta.annotation.Nonnull List<String> ioutil, @jakarta.annotation.Nonnull List<String> http, @jakarta.annotation.Nonnull List<String> url, @jakarta.annotation.Nonnull List<String> context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable Map<String, String> language) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testQueryParameterCollectionFormatRequestCreation(pipe, ioutil, http, url, context, allowEmpty, language).toEntity(localVarReturnType);
    }

    /**
     * 
     * To test the collection format in query parameters
     * <p><b>200</b> - Success
     * @param pipe The pipe parameter
     * @param ioutil The ioutil parameter
     * @param http The http parameter
     * @param url The url parameter
     * @param context The context parameter
     * @param allowEmpty The allowEmpty parameter
     * @param language The language parameter
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testQueryParameterCollectionFormatWithResponseSpec(@jakarta.annotation.Nonnull List<String> pipe, @jakarta.annotation.Nonnull List<String> ioutil, @jakarta.annotation.Nonnull List<String> http, @jakarta.annotation.Nonnull List<String> url, @jakarta.annotation.Nonnull List<String> context, @jakarta.annotation.Nonnull String allowEmpty, @jakarta.annotation.Nullable Map<String, String> language) throws RestClientResponseException {
        return testQueryParameterCollectionFormatRequestCreation(pipe, ioutil, http, url, context, allowEmpty, language);
    }
    /**
     * test referenced string map
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec testStringMapReferenceRequestCreation(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new RestClientResponseException("Missing the required parameter 'requestBody' when calling testStringMapReference", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/fake/stringMap-reference", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * test referenced string map
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public void testStringMapReference(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        testStringMapReferenceRequestCreation(requestBody).body(localVarReturnType);
    }

    /**
     * test referenced string map
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> testStringMapReferenceWithHttpInfo(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<>() {};
        return testStringMapReferenceRequestCreation(requestBody).toEntity(localVarReturnType);
    }

    /**
     * test referenced string map
     * 
     * <p><b>200</b> - successful operation
     * @param requestBody request body
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec testStringMapReferenceWithResponseSpec(@jakarta.annotation.Nonnull Map<String, String> requestBody) throws RestClientResponseException {
        return testStringMapReferenceRequestCreation(requestBody);
    }
}

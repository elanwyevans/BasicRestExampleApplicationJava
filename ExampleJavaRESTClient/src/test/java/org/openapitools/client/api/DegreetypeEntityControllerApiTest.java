/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CollectionModelEntityModelDegreetype;
import org.openapitools.client.model.DegreetypeRequestBody;
import org.openapitools.client.model.EntityModelDegreetype;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DegreetypeEntityControllerApi
 */
@Disabled
public class DegreetypeEntityControllerApiTest {

    private final DegreetypeEntityControllerApi api = new DegreetypeEntityControllerApi();

    /**
     * delete-degreetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteItemResourceDegreetypeDeleteTest() throws ApiException {
        String id = null;
        api.deleteItemResourceDegreetypeDelete(id);
        // TODO: test validations
    }

    /**
     * get-degreetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCollectionResourceDegreetypeGet1Test() throws ApiException {
        CollectionModelEntityModelDegreetype response = api.getCollectionResourceDegreetypeGet1();
        // TODO: test validations
    }

    /**
     * get-degreetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getItemResourceDegreetypeGetTest() throws ApiException {
        String id = null;
        EntityModelDegreetype response = api.getItemResourceDegreetypeGet(id);
        // TODO: test validations
    }

    /**
     * patch-degreetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchItemResourceDegreetypePatchTest() throws ApiException {
        String id = null;
        DegreetypeRequestBody degreetypeRequestBody = null;
        EntityModelDegreetype response = api.patchItemResourceDegreetypePatch(id, degreetypeRequestBody);
        // TODO: test validations
    }

    /**
     * create-degreetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCollectionResourceDegreetypePostTest() throws ApiException {
        DegreetypeRequestBody degreetypeRequestBody = null;
        EntityModelDegreetype response = api.postCollectionResourceDegreetypePost(degreetypeRequestBody);
        // TODO: test validations
    }

    /**
     * update-degreetype
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putItemResourceDegreetypePutTest() throws ApiException {
        String id = null;
        DegreetypeRequestBody degreetypeRequestBody = null;
        EntityModelDegreetype response = api.putItemResourceDegreetypePut(id, degreetypeRequestBody);
        // TODO: test validations
    }

}

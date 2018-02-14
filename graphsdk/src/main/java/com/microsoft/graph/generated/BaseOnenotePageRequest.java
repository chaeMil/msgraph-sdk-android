// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Onenote Page Request.
 */
public class BaseOnenotePageRequest extends BaseRequest implements IBaseOnenotePageRequest {

    /**
     * The request for the OnenotePage
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BaseOnenotePageRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the OnenotePage from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<OnenotePage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OnenotePage from the service
     * @return The OnenotePage from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenotePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this OnenotePage with a source
     * @param sourceOnenotePage The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final OnenotePage sourceOnenotePage, final ICallback<OnenotePage> callback) {
        send(HttpMethod.PATCH, callback, sourceOnenotePage);
    }

    /**
     * Patches this OnenotePage with a source
     * @param sourceOnenotePage The source object with updates
     * @return The updated OnenotePage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenotePage patch(final OnenotePage sourceOnenotePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     * @param newOnenotePage The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final OnenotePage newOnenotePage, final ICallback<OnenotePage> callback) {
        send(HttpMethod.POST, callback, newOnenotePage);
    }

    /**
     * Creates a OnenotePage with a new object
     * @param newOnenotePage The new object to create
     * @return The created OnenotePage
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public OnenotePage post(final OnenotePage newOnenotePage) throws ClientException {
        return send(HttpMethod.POST, newOnenotePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IOnenotePageRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (OnenotePageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IOnenotePageRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (OnenotePageRequest)this;
     }

}


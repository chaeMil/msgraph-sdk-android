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

import java.io.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Profile Photo Stream Request.
 */
public interface IBaseProfilePhotoStreamRequest extends IHttpStreamRequest {

    /**
     * Gets the contents of this stream
     *
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<InputStream> callback);

    /**
     * Gets the contents of this stream
     *
     * @return The stream that the caller needs to close.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    InputStream get() throws ClientException;

    /**
     * Uploads to the stream
     *
     * @param fileContents The contents of the stream to upload.
     * @param callback The callback to be called after success or failure.
     */
    void put(final byte[] fileContents, final ICallback<ProfilePhoto> callback);

    /**
     * Uploads to the stream
     *
     * @param fileContents The contents of the stream to upload.
     * @return The result of the upload.
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    ProfilePhoto put(final byte[] fileContents) throws ClientException;
}

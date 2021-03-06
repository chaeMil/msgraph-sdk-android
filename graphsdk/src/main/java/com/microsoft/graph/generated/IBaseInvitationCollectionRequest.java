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
 * The interface for the Base Invitation Collection Request.
 */
public interface IBaseInvitationCollectionRequest {

    void get(final ICallback<IInvitationCollectionPage> callback);

    IInvitationCollectionPage get() throws ClientException;

    void post(final Invitation newInvitation, final ICallback<Invitation> callback);

    Invitation post(final Invitation newInvitation) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IInvitationCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IInvitationCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value The max number of items to return
     * @return The updated request
     */
    IInvitationCollectionRequest top(final int value);

}

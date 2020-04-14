// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.management.appservice.CertificatePatchResource;
import com.azure.management.appservice.DefaultErrorResponseException;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Certificates. */
public final class CertificatesInner
    implements InnerSupportsGet<CertificateInner>, InnerSupportsListing<CertificateInner>, InnerSupportsDelete<Void> {
    /** The proxy service used to perform REST calls. */
    private final CertificatesService service;

    /** The service client containing this operation class. */
    private final WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of CertificatesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CertificatesInner(WebSiteManagementClientImpl client) {
        this.service =
            RestProxy.create(CertificatesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for WebSiteManagementClientCertificates to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "WebSiteManagementCli")
    private interface CertificatesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Web/certificates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateCollectionInner>> list(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web"
                + "/certificates")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateCollectionInner>> listByResourceGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web"
                + "/certificates/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateInner>> getByResourceGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web"
                + "/certificates/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateInner>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CertificateInner certificateEnvelope,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web"
                + "/certificates/{name}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web"
                + "/certificates/{name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateInner>> update(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("name") String name,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") CertificatePatchResource certificateEnvelope,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateCollectionInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DefaultErrorResponseException.class)
        Mono<SimpleResponse<CertificateCollectionInner>> listByResourceGroupNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Description for Get all certificates for a subscription.
     *
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CertificateInner>> listSinglePageAsync() {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<CertificateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get all certificates for a subscription.
     *
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CertificateInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all certificates for a subscription.
     *
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CertificateInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Description for Get all certificates in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CertificateInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByResourceGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<CertificateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get all certificates in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CertificateInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Description for Get all certificates in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CertificateInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Description for Get a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CertificateInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String name) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getByResourceGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            name,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Get a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificateInner> getByResourceGroupAsync(String resourceGroupName, String name) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, name)
            .flatMap(
                (SimpleResponse<CertificateInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Description for Get a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CertificateInner getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).block();
    }

    /**
     * Description for Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope SSL certificate for an app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CertificateInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String name, CertificateInner certificateEnvelope) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            name,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            certificateEnvelope,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope SSL certificate for an app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificateInner> createOrUpdateAsync(
        String resourceGroupName, String name, CertificateInner certificateEnvelope) {
        return createOrUpdateWithResponseAsync(resourceGroupName, name, certificateEnvelope)
            .flatMap(
                (SimpleResponse<CertificateInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Description for Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope SSL certificate for an app.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CertificateInner createOrUpdate(
        String resourceGroupName, String name, CertificateInner certificateEnvelope) {
        return createOrUpdateAsync(resourceGroupName, name, certificateEnvelope).block();
    }

    /**
     * Description for Delete a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String name) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            name,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Delete a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String name) {
        return deleteWithResponseAsync(resourceGroupName, name).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Description for Delete a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String name) {
        deleteAsync(resourceGroupName, name).block();
    }

    /**
     * Description for Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope ARM resource for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CertificateInner>> updateWithResponseAsync(
        String resourceGroupName, String name, CertificatePatchResource certificateEnvelope) {
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getHost(),
                            resourceGroupName,
                            name,
                            this.client.getSubscriptionId(),
                            this.client.getApiVersion(),
                            certificateEnvelope,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Description for Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope ARM resource for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CertificateInner> updateAsync(
        String resourceGroupName, String name, CertificatePatchResource certificateEnvelope) {
        return updateWithResponseAsync(resourceGroupName, name, certificateEnvelope)
            .flatMap(
                (SimpleResponse<CertificateInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Description for Create or update a certificate.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the certificate.
     * @param certificateEnvelope ARM resource for a certificate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return sSL certificate for an app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CertificateInner update(
        String resourceGroupName, String name, CertificatePatchResource certificateEnvelope) {
        return updateAsync(resourceGroupName, name, certificateEnvelope).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CertificateInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<CertificateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DefaultErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of certificates.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<CertificateInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listByResourceGroupNext(nextLink, context))
            .<PagedResponse<CertificateInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}

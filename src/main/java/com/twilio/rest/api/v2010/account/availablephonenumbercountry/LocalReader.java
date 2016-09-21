/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.api.v2010.account.availablephonenumbercountry;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class LocalReader extends Reader<Local> {
    private String accountSid;
    private final String countryCode;
    private Integer areaCode;
    private String contains;
    private Boolean smsEnabled;
    private Boolean mmsEnabled;
    private Boolean voiceEnabled;
    private Boolean excludeAllAddressRequired;
    private Boolean excludeLocalAddressRequired;
    private Boolean excludeForeignAddressRequired;
    private Boolean beta;
    private com.twilio.type.PhoneNumber nearNumber;
    private String nearLatLong;
    private Integer distance;
    private String inPostalCode;
    private String inRegion;
    private String inRateCenter;
    private String inLata;

    /**
     * Construct a new LocalReader.
     * 
     * @param countryCode The country_code
     */
    public LocalReader(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Construct a new LocalReader.
     * 
     * @param accountSid The account_sid
     * @param countryCode The country_code
     */
    public LocalReader(final String accountSid, 
                       final String countryCode) {
        this.accountSid = accountSid;
        this.countryCode = countryCode;
    }

    /**
     * The area_code.
     * 
     * @param areaCode The area_code
     * @return this
     */
    public LocalReader byAreaCode(final Integer areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * The contains.
     * 
     * @param contains The contains
     * @return this
     */
    public LocalReader byContains(final String contains) {
        this.contains = contains;
        return this;
    }

    /**
     * The sms_enabled.
     * 
     * @param smsEnabled The sms_enabled
     * @return this
     */
    public LocalReader bySmsEnabled(final Boolean smsEnabled) {
        this.smsEnabled = smsEnabled;
        return this;
    }

    /**
     * The mms_enabled.
     * 
     * @param mmsEnabled The mms_enabled
     * @return this
     */
    public LocalReader byMmsEnabled(final Boolean mmsEnabled) {
        this.mmsEnabled = mmsEnabled;
        return this;
    }

    /**
     * The voice_enabled.
     * 
     * @param voiceEnabled The voice_enabled
     * @return this
     */
    public LocalReader byVoiceEnabled(final Boolean voiceEnabled) {
        this.voiceEnabled = voiceEnabled;
        return this;
    }

    /**
     * The exclude_all_address_required.
     * 
     * @param excludeAllAddressRequired The exclude_all_address_required
     * @return this
     */
    public LocalReader byExcludeAllAddressRequired(final Boolean excludeAllAddressRequired) {
        this.excludeAllAddressRequired = excludeAllAddressRequired;
        return this;
    }

    /**
     * The exclude_local_address_required.
     * 
     * @param excludeLocalAddressRequired The exclude_local_address_required
     * @return this
     */
    public LocalReader byExcludeLocalAddressRequired(final Boolean excludeLocalAddressRequired) {
        this.excludeLocalAddressRequired = excludeLocalAddressRequired;
        return this;
    }

    /**
     * The exclude_foreign_address_required.
     * 
     * @param excludeForeignAddressRequired The exclude_foreign_address_required
     * @return this
     */
    public LocalReader byExcludeForeignAddressRequired(final Boolean excludeForeignAddressRequired) {
        this.excludeForeignAddressRequired = excludeForeignAddressRequired;
        return this;
    }

    /**
     * The beta.
     * 
     * @param beta The beta
     * @return this
     */
    public LocalReader byBeta(final Boolean beta) {
        this.beta = beta;
        return this;
    }

    /**
     * The near_number.
     * 
     * @param nearNumber The near_number
     * @return this
     */
    public LocalReader byNearNumber(final com.twilio.type.PhoneNumber nearNumber) {
        this.nearNumber = nearNumber;
        return this;
    }

    /**
     * The near_lat_long.
     * 
     * @param nearLatLong The near_lat_long
     * @return this
     */
    public LocalReader byNearLatLong(final String nearLatLong) {
        this.nearLatLong = nearLatLong;
        return this;
    }

    /**
     * The distance.
     * 
     * @param distance The distance
     * @return this
     */
    public LocalReader byDistance(final Integer distance) {
        this.distance = distance;
        return this;
    }

    /**
     * The in_postal_code.
     * 
     * @param inPostalCode The in_postal_code
     * @return this
     */
    public LocalReader byInPostalCode(final String inPostalCode) {
        this.inPostalCode = inPostalCode;
        return this;
    }

    /**
     * The in_region.
     * 
     * @param inRegion The in_region
     * @return this
     */
    public LocalReader byInRegion(final String inRegion) {
        this.inRegion = inRegion;
        return this;
    }

    /**
     * The in_rate_center.
     * 
     * @param inRateCenter The in_rate_center
     * @return this
     */
    public LocalReader byInRateCenter(final String inRateCenter) {
        this.inRateCenter = inRateCenter;
        return this;
    }

    /**
     * The in_lata.
     * 
     * @param inLata The in_lata
     * @return this
     */
    public LocalReader byInLata(final String inLata) {
        this.inLata = inLata;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Local ResourceSet
     */
    @Override
    public ResourceSet<Local> execute(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Local ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Local> firstPage(final TwilioRestClient client) {
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            "/2010-04-01/Accounts/" + this.accountSid + "/AvailablePhoneNumbers/" + this.countryCode + "/Local.json",
            client.getRegion()
        );
        
        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     * 
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<Local> nextPage(final Page<Local> page, 
                                final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(
                Domains.API.toString(),
                client.getRegion()
            )
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Local Resources for a given request.
     * 
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Local> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Local read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
        
            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }
        
        return Page.fromJson(
            "available_phone_numbers",
            response.getContent(),
            Local.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     * 
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (areaCode != null) {
            request.addQueryParam("AreaCode", areaCode.toString());
        }
        
        if (contains != null) {
            request.addQueryParam("Contains", contains);
        }
        
        if (smsEnabled != null) {
            request.addQueryParam("SmsEnabled", smsEnabled.toString());
        }
        
        if (mmsEnabled != null) {
            request.addQueryParam("MmsEnabled", mmsEnabled.toString());
        }
        
        if (voiceEnabled != null) {
            request.addQueryParam("VoiceEnabled", voiceEnabled.toString());
        }
        
        if (excludeAllAddressRequired != null) {
            request.addQueryParam("ExcludeAllAddressRequired", excludeAllAddressRequired.toString());
        }
        
        if (excludeLocalAddressRequired != null) {
            request.addQueryParam("ExcludeLocalAddressRequired", excludeLocalAddressRequired.toString());
        }
        
        if (excludeForeignAddressRequired != null) {
            request.addQueryParam("ExcludeForeignAddressRequired", excludeForeignAddressRequired.toString());
        }
        
        if (beta != null) {
            request.addQueryParam("Beta", beta.toString());
        }
        
        if (nearNumber != null) {
            request.addQueryParam("NearNumber", nearNumber.toString());
        }
        
        if (nearLatLong != null) {
            request.addQueryParam("NearLatLong", nearLatLong);
        }
        
        if (distance != null) {
            request.addQueryParam("Distance", distance.toString());
        }
        
        if (inPostalCode != null) {
            request.addQueryParam("InPostalCode", inPostalCode);
        }
        
        if (inRegion != null) {
            request.addQueryParam("InRegion", inRegion);
        }
        
        if (inRateCenter != null) {
            request.addQueryParam("InRateCenter", inRateCenter);
        }
        
        if (inLata != null) {
            request.addQueryParam("InLata", inLata);
        }
        
        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
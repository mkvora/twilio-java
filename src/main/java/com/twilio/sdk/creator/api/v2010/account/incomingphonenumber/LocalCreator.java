/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.sdk.creator.api.v2010.account.incomingphonenumber;

import com.twilio.sdk.http.TwilioRestClient;
import com.twilio.sdk.converter.Promoter;
import com.twilio.sdk.creator.Creator;
import com.twilio.sdk.exception.ApiConnectionException;
import com.twilio.sdk.exception.ApiException;
import com.twilio.sdk.http.HttpMethod;
import com.twilio.sdk.http.Request;
import com.twilio.sdk.http.Response;
import com.twilio.sdk.resource.RestException;
import com.twilio.sdk.resource.api.v2010.account.incomingphonenumber.Local;

import java.net.URI;

public class LocalCreator extends Creator<Local> {
    private String ownerAccountSid;
    private final com.twilio.sdk.type.PhoneNumber phoneNumber;
    private String apiVersion;
    private String friendlyName;
    private String smsApplicationSid;
    private HttpMethod smsFallbackMethod;
    private URI smsFallbackUrl;
    private HttpMethod smsMethod;
    private URI smsUrl;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private String voiceApplicationSid;
    private Boolean voiceCallerIdLookup;
    private HttpMethod voiceFallbackMethod;
    private URI voiceFallbackUrl;
    private HttpMethod voiceMethod;
    private URI voiceUrl;

    /**
     * Construct a new LocalCreator.
     * 
     * @param phoneNumber The phone_number
     */
    public LocalCreator(final com.twilio.sdk.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Construct a new LocalCreator.
     * 
     * @param ownerAccountSid The owner_account_sid
     * @param phoneNumber The phone_number
     */
    public LocalCreator(final String ownerAccountSid, 
                        final com.twilio.sdk.type.PhoneNumber phoneNumber) {
        this.ownerAccountSid = ownerAccountSid;
        this.phoneNumber = phoneNumber;
    }

    /**
     * The api_version.
     * 
     * @param apiVersion The api_version
     * @return this
     */
    public LocalCreator setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The friendly_name.
     * 
     * @param friendlyName The friendly_name
     * @return this
     */
    public LocalCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The sms_application_sid.
     * 
     * @param smsApplicationSid The sms_application_sid
     * @return this
     */
    public LocalCreator setSmsApplicationSid(final String smsApplicationSid) {
        this.smsApplicationSid = smsApplicationSid;
        return this;
    }

    /**
     * The sms_fallback_method.
     * 
     * @param smsFallbackMethod The sms_fallback_method
     * @return this
     */
    public LocalCreator setSmsFallbackMethod(final HttpMethod smsFallbackMethod) {
        this.smsFallbackMethod = smsFallbackMethod;
        return this;
    }

    /**
     * The sms_fallback_url.
     * 
     * @param smsFallbackUrl The sms_fallback_url
     * @return this
     */
    public LocalCreator setSmsFallbackUrl(final URI smsFallbackUrl) {
        this.smsFallbackUrl = smsFallbackUrl;
        return this;
    }

    /**
     * The sms_fallback_url.
     * 
     * @param smsFallbackUrl The sms_fallback_url
     * @return this
     */
    public LocalCreator setSmsFallbackUrl(final String smsFallbackUrl) {
        return setSmsFallbackUrl(Promoter.uriFromString(smsFallbackUrl));
    }

    /**
     * The sms_method.
     * 
     * @param smsMethod The sms_method
     * @return this
     */
    public LocalCreator setSmsMethod(final HttpMethod smsMethod) {
        this.smsMethod = smsMethod;
        return this;
    }

    /**
     * The sms_url.
     * 
     * @param smsUrl The sms_url
     * @return this
     */
    public LocalCreator setSmsUrl(final URI smsUrl) {
        this.smsUrl = smsUrl;
        return this;
    }

    /**
     * The sms_url.
     * 
     * @param smsUrl The sms_url
     * @return this
     */
    public LocalCreator setSmsUrl(final String smsUrl) {
        return setSmsUrl(Promoter.uriFromString(smsUrl));
    }

    /**
     * The status_callback.
     * 
     * @param statusCallback The status_callback
     * @return this
     */
    public LocalCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * The status_callback.
     * 
     * @param statusCallback The status_callback
     * @return this
     */
    public LocalCreator setStatusCallback(final String statusCallback) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    /**
     * The status_callback_method.
     * 
     * @param statusCallbackMethod The status_callback_method
     * @return this
     */
    public LocalCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * The voice_application_sid.
     * 
     * @param voiceApplicationSid The voice_application_sid
     * @return this
     */
    public LocalCreator setVoiceApplicationSid(final String voiceApplicationSid) {
        this.voiceApplicationSid = voiceApplicationSid;
        return this;
    }

    /**
     * The voice_caller_id_lookup.
     * 
     * @param voiceCallerIdLookup The voice_caller_id_lookup
     * @return this
     */
    public LocalCreator setVoiceCallerIdLookup(final Boolean voiceCallerIdLookup) {
        this.voiceCallerIdLookup = voiceCallerIdLookup;
        return this;
    }

    /**
     * The voice_fallback_method.
     * 
     * @param voiceFallbackMethod The voice_fallback_method
     * @return this
     */
    public LocalCreator setVoiceFallbackMethod(final HttpMethod voiceFallbackMethod) {
        this.voiceFallbackMethod = voiceFallbackMethod;
        return this;
    }

    /**
     * The voice_fallback_url.
     * 
     * @param voiceFallbackUrl The voice_fallback_url
     * @return this
     */
    public LocalCreator setVoiceFallbackUrl(final URI voiceFallbackUrl) {
        this.voiceFallbackUrl = voiceFallbackUrl;
        return this;
    }

    /**
     * The voice_fallback_url.
     * 
     * @param voiceFallbackUrl The voice_fallback_url
     * @return this
     */
    public LocalCreator setVoiceFallbackUrl(final String voiceFallbackUrl) {
        return setVoiceFallbackUrl(Promoter.uriFromString(voiceFallbackUrl));
    }

    /**
     * The voice_method.
     * 
     * @param voiceMethod The voice_method
     * @return this
     */
    public LocalCreator setVoiceMethod(final HttpMethod voiceMethod) {
        this.voiceMethod = voiceMethod;
        return this;
    }

    /**
     * The voice_url.
     * 
     * @param voiceUrl The voice_url
     * @return this
     */
    public LocalCreator setVoiceUrl(final URI voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }

    /**
     * The voice_url.
     * 
     * @param voiceUrl The voice_url
     * @return this
     */
    public LocalCreator setVoiceUrl(final String voiceUrl) {
        return setVoiceUrl(Promoter.uriFromString(voiceUrl));
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created Local
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Local execute(final TwilioRestClient client) {
        this.ownerAccountSid = this.ownerAccountSid == null ? client.getAccountSid() : this.ownerAccountSid;
        Request request = new Request(
            HttpMethod.POST,
            TwilioRestClient.Domains.API,
            "/2010-04-01/Accounts/" + this.ownerAccountSid + "/IncomingPhoneNumbers/Local.json",
            client.getAccountSid()
        );
        
        addPostParams(request);
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Local creation failed: Unable to connect to server");
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
        
        return Local.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (phoneNumber != null) {
            request.addPostParam("PhoneNumber", phoneNumber.toString());
        }
        
        if (apiVersion != null) {
            request.addPostParam("ApiVersion", apiVersion);
        }
        
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
        
        if (smsApplicationSid != null) {
            request.addPostParam("SmsApplicationSid", smsApplicationSid);
        }
        
        if (smsFallbackMethod != null) {
            request.addPostParam("SmsFallbackMethod", smsFallbackMethod.toString());
        }
        
        if (smsFallbackUrl != null) {
            request.addPostParam("SmsFallbackUrl", smsFallbackUrl.toString());
        }
        
        if (smsMethod != null) {
            request.addPostParam("SmsMethod", smsMethod.toString());
        }
        
        if (smsUrl != null) {
            request.addPostParam("SmsUrl", smsUrl.toString());
        }
        
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }
        
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
        }
        
        if (voiceApplicationSid != null) {
            request.addPostParam("VoiceApplicationSid", voiceApplicationSid);
        }
        
        if (voiceCallerIdLookup != null) {
            request.addPostParam("VoiceCallerIdLookup", voiceCallerIdLookup.toString());
        }
        
        if (voiceFallbackMethod != null) {
            request.addPostParam("VoiceFallbackMethod", voiceFallbackMethod.toString());
        }
        
        if (voiceFallbackUrl != null) {
            request.addPostParam("VoiceFallbackUrl", voiceFallbackUrl.toString());
        }
        
        if (voiceMethod != null) {
            request.addPostParam("VoiceMethod", voiceMethod.toString());
        }
        
        if (voiceUrl != null) {
            request.addPostParam("VoiceUrl", voiceUrl.toString());
        }
    }
}
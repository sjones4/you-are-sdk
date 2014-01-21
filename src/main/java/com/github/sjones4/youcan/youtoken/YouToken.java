/*
 * Copyright 2014 Steve Jones. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.github.sjones4.youcan.youtoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.github.sjones4.youcan.youtoken.model.GetAccessTokenRequest;
import com.github.sjones4.youcan.youtoken.model.GetAccessTokenResult;
import com.github.sjones4.youcan.youtoken.model.GetImpersonationTokenRequest;
import com.github.sjones4.youcan.youtoken.model.GetImpersonationTokenResult;

/**
 *
 */
public interface YouToken extends AWSSecurityTokenService {

  GetAccessTokenResult getAccessToken( ) throws AmazonServiceException, AmazonClientException;

  GetAccessTokenResult getAccessToken( GetAccessTokenRequest getAccessTokenRequest ) throws AmazonServiceException, AmazonClientException;

  GetImpersonationTokenResult getImpersonationToken( GetImpersonationTokenRequest getImpersonationTokenRequest ) throws AmazonServiceException, AmazonClientException;
}

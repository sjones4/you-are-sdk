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
package com.github.sjones4.youcan.youtoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youtoken.model.GetImpersonationTokenRequest;

/**
 *
 */
public class GetImpersonationTokenRequestMarshaller implements Marshaller<Request<GetImpersonationTokenRequest>, GetImpersonationTokenRequest> {

  public Request<GetImpersonationTokenRequest> marshall(GetImpersonationTokenRequest getImpersonationTokenRequest) {

    if (getImpersonationTokenRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    Request<GetImpersonationTokenRequest> request = new DefaultRequest<GetImpersonationTokenRequest>(getImpersonationTokenRequest, "AWSSecurityTokenService");
    request.addParameter("Action", "GetImpersonationToken");
    request.addParameter("Version", "2011-06-15");

    if (getImpersonationTokenRequest.getAccountAlias() != null) {
      request.addParameter("AccountAlias", StringUtils.fromString( getImpersonationTokenRequest.getAccountAlias() ));
    }
    if (getImpersonationTokenRequest.getUserName() != null) {
      request.addParameter("UserName", StringUtils.fromString(getImpersonationTokenRequest.getUserName()));
    }
    if (getImpersonationTokenRequest.getUserId() != null) {
      request.addParameter("UserId", StringUtils.fromString(getImpersonationTokenRequest.getUserId()));
    }

    return request;
  }
}

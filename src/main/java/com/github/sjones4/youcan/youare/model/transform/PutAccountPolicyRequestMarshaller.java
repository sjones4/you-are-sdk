/*
 * Copyright 2013 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youare.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youare.model.PutAccountPolicyRequest;

/**
 *
 */
public class PutAccountPolicyRequestMarshaller implements Marshaller<Request<PutAccountPolicyRequest>, PutAccountPolicyRequest> {

  public Request<PutAccountPolicyRequest> marshall(PutAccountPolicyRequest putAccountPolicyRequest) {

    if (putAccountPolicyRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    Request<PutAccountPolicyRequest> request = new DefaultRequest<>(putAccountPolicyRequest, "AmazonIdentityManagement");
    request.addParameter("Action", "PutAccountPolicy");
    request.addParameter("Version", "2010-05-08");

    if (putAccountPolicyRequest.getAccountName() != null) {
      request.addParameter("AccountName", StringUtils.fromString( putAccountPolicyRequest.getAccountName() ));
    }
    if (putAccountPolicyRequest.getPolicyName() != null) {
      request.addParameter("PolicyName", StringUtils.fromString(putAccountPolicyRequest.getPolicyName()));
    }
    if (putAccountPolicyRequest.getPolicyDocument() != null) {
      request.addParameter("PolicyDocument", StringUtils.fromString(putAccountPolicyRequest.getPolicyDocument()));
    }

    return request;
  }
}

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
package com.github.sjones4.youare.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youare.model.CreateAccountRequest;

/**
 *
 */
public class CreateAccountRequestMarshaller implements Marshaller<Request<CreateAccountRequest>, CreateAccountRequest> {
  public Request<CreateAccountRequest> marshall(CreateAccountRequest createAccountRequest) {
    if (createAccountRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }
    Request<CreateAccountRequest> request = new DefaultRequest<>(createAccountRequest, "AmazonIdentityManagement");
    request.addParameter("Action", "CreateAccount");
    request.addParameter("Version", "2010-05-08");
    if (createAccountRequest.getAccountName() != null) {
      request.addParameter("AccountName", StringUtils.fromString( createAccountRequest.getAccountName() ));
    }
    return request;
  }
}

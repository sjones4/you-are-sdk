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
package com.github.sjones4.youcan.youprop.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youprop.model.ModifyPropertyValueRequest;

/**
 *
 */
public class ModifyPropertyValueRequestMarshaller implements Marshaller<Request<ModifyPropertyValueRequest>, ModifyPropertyValueRequest> {

  public Request<ModifyPropertyValueRequest> marshall(ModifyPropertyValueRequest modifyPropertyValueRequest) {

    if (modifyPropertyValueRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    final Request<ModifyPropertyValueRequest> request = new DefaultRequest<>(modifyPropertyValueRequest, "EucalyptusProperties");
    request.addParameter("Action", "ModifyPropertyValue");
    request.addParameter("Version", "eucalyptus");

    if (modifyPropertyValueRequest.getName() != null) {
      request.addParameter("Name", StringUtils.fromString(modifyPropertyValueRequest.getName()));
    }
    if (modifyPropertyValueRequest.getValue() != null) {
      request.addParameter("Value", StringUtils.fromString(modifyPropertyValueRequest.getValue()));
    }

    return request;
  }
}

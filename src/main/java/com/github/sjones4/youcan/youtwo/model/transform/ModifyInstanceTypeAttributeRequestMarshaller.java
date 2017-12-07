/*
 * Copyright 2017 Steve Jones. All Rights Reserved.
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
package com.github.sjones4.youcan.youtwo.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.github.sjones4.youcan.youtwo.model.ModifyInstanceTypeAttributeRequest;

/**
 *
 */
public class ModifyInstanceTypeAttributeRequestMarshaller implements Marshaller<Request<ModifyInstanceTypeAttributeRequest>, ModifyInstanceTypeAttributeRequest> {


  @Override
  public Request<ModifyInstanceTypeAttributeRequest> marshall( final ModifyInstanceTypeAttributeRequest modifyInstanceTypeRequest ) {
    if (modifyInstanceTypeRequest == null) {
      throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

    Request<ModifyInstanceTypeAttributeRequest> request = new DefaultRequest<>(modifyInstanceTypeRequest, "AmazonEC2");
    request.addParameter("Action", "ModifyInstanceTypeAttribute");
    request.addParameter( "Version", "2013-10-15" );

    if ( modifyInstanceTypeRequest.getName( ) != null ) {
      request.addParameter( "Name", StringUtils.fromString( modifyInstanceTypeRequest.getName() ) );
    }

    if ( modifyInstanceTypeRequest.getCpu() != null ) {
      request.addParameter( "Cpu", StringUtils.fromInteger( modifyInstanceTypeRequest.getCpu() ) );
    }

    if ( modifyInstanceTypeRequest.getDisk() != null ) {
      request.addParameter( "Disk", StringUtils.fromInteger( modifyInstanceTypeRequest.getDisk() ) );
    }

    if ( modifyInstanceTypeRequest.getMemory() != null ) {
      request.addParameter( "Memory", StringUtils.fromInteger( modifyInstanceTypeRequest.getMemory() ) );
    }

    return request;
  }
}

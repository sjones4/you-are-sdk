/*************************************************************************
 * Copyright 2009-2014 Eucalyptus Systems, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Please contact Eucalyptus Systems, Inc., 6755 Hollister Ave., Goleta
 * CA 93117, USA or visit http://www.eucalyptus.com/licenses/ if you need
 * additional information or have any questions.
 ************************************************************************/
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

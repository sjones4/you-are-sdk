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
package com.github.sjones4.youcan.youec2reports.model;

import com.amazonaws.AmazonWebServiceRequest;

import java.io.Serializable;

/*
 *
 */
public class ViewReservedInstanceUtilizationReportRequest extends AmazonWebServiceRequest implements Serializable {
  private static final long serialVersionUID = 1L;


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("{");
    // no request parameter
    sb.append("}");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    return hashCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;

    if (obj instanceof ViewReservedInstanceUtilizationReportRequest == false) return false;
    final ViewReservedInstanceUtilizationReportRequest other = (ViewReservedInstanceUtilizationReportRequest)obj;

    return true;
  }

}